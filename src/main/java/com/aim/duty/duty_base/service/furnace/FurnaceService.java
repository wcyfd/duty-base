package com.aim.duty.duty_base.service.furnace;

import com.aim.duty.duty_base.entity.bo.Furnace;

public interface FurnaceService {
	void addFuel(Furnace forge, int propId, int num);
	
	void updateTemperature(Furnace forge);
}
