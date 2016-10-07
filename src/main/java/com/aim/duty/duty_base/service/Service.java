package com.aim.duty.duty_base.service;

import com.aim.duty.duty_base.entity.Forge;

public interface Service {
	void addFuel(Forge forge, int propId, int num);
	
	void updateTemperature(Forge forge);
}
