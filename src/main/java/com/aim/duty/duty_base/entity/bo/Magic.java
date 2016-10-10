package com.aim.duty.duty_base.entity.bo;

import com.aim.duty.duty_base.entity.base.GameObject;

public class Magic extends GameObject{
	/** 魔法id */
	private int magicId;
	/** 有效时间 */
	private int duration;
	/** 增加值 */
	private int value;

	public int getMagicId() {
		return magicId;
	}

	public void setMagicId(int id) {
		this.magicId = id;
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
	
	@Override
	public Magic clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Magic) super.clone();
	}

}
