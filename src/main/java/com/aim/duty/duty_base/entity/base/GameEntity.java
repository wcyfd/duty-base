package com.aim.duty.duty_base.entity.base;

public abstract class GameEntity extends GameObject{
	private boolean change;

	public abstract boolean isChange();

	public void setChange(boolean change) {
		this.change = change;
	}
	

}
