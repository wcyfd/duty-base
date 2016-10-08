package com.aim.duty.duty_base.entity;

public class Magic {
	/** 魔法id */
	private int id;
	/** 有效时间 */
	private int duration;
	/** 增加值 */
	private int value;

	public int getMagicId() {
		return id;
	}

	public void setMagicId(int id) {
		this.id = id;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
