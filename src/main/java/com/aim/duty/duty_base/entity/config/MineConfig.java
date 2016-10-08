package com.aim.duty.duty_base.entity.config;

public class MineConfig {

	public MineConfig(int id, String name, int temperature, int brickBlood, int cementBlood) {
		this.name = name;
		this.id = id;
		this.temperature = temperature;
		this.brickBlood = brickBlood;
		this.cementBlood = cementBlood;
	}

	public String name;
	public int id;
	public int temperature;
	public int brickBlood;
	public int cementBlood;
}
