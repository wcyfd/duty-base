package com.aim.duty.duty_base.entity.bo;

import com.aim.duty.duty_base.entity.base.AbstractMagicProp;

public class Wall extends AbstractMagicProp {

	private int brickCount;
	private int blood;

	@Override
	public boolean isChange() {
		// TODO Auto-generated method stub
		return false;
	}

	public int getBrickCount() {
		return brickCount;
	}

	public void setBrickCount(int brickCount) {
		this.brickCount = brickCount;
	}

	public int getBlood() {
		return blood;
	}

	public void setBlood(int blood) {
		this.blood = blood;
	}

}
