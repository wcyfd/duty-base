package com.aim.duty.duty_base.service;

import com.aim.duty.duty_base.entity.bo.Furnace;

public interface FurnaceService {
	void addFuel(Furnace forge, int propId, int num);
	
	void updateTemperature(Furnace forge);
}
