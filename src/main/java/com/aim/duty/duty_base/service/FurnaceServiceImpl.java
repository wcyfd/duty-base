package com.aim.duty.duty_base.service;

import com.aim.duty.duty_base.cache.config.FuelConfigCache;
import com.aim.duty.duty_base.entity.bo.Furnace;
import com.aim.duty.duty_base.entity.config.FuelConfig;
import com.aim.duty.duty_base.util.Util;

public class FurnaceServiceImpl implements FurnaceService{

	@Override
	public void addFuel(Furnace forge, int propId, int num) {
		int readyFuelId = forge.getReadyFuelId();
		if (readyFuelId == propId) {
			forge.setReadyFuelNum(forge.getReadyFuelNum() + num);
		} else {
			forge.setReadyFuelId(propId);
			forge.setReadyFuelNum(num);
		}
	}

	@Override
	public void updateTemperature(Furnace forge) {
		// TODO Auto-generated method stub
		int nowTime = Util.getTime2();

		if (nowTime >= forge.getBurnEndTime()) {
			int readyFuelId = forge.getReadyFuelId();
			if (readyFuelId != Constant.NO_PROP) {
				forge.setBurnFuelId(readyFuelId);
				forge.setBurnDeltaTime(FuelConfigCache.map.get(readyFuelId).duration);
				forge.setBurnStartTime(nowTime);
				forge.setReadyFuelNum(forge.getReadyFuelNum() - 1);
				if (forge.getReadyFuelNum() == 0)
					forge.setReadyFuelId(Constant.NO_PROP);
			} else {
				forge.setBurnFuelId(Constant.NO_PROP);
			}
		}

		int t = forge.getTemperature();
		if (forge.getBurnFuelId() != Constant.NO_PROP) {
			FuelConfig config = FuelConfigCache.map.get(forge.getBurnFuelId());

			if (t + config.addHeart > config.maxHeart) {
				if (t - config.reduceHeart < config.maxHeart) {
					t = config.maxHeart;
				} else if (t - config.reduceHeart > config.maxHeart) {
					t -= config.reduceHeart;
				}
			} else {
				t += config.addHeart;
			}

		} else {
			t -= 40;
			t = t <= 0 ? 0 : t;
		}
		forge.setTemperature(t);
		System.out.println(forge.getTemperature());
	}

}
