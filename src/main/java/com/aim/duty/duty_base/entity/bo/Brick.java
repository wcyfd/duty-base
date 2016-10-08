package com.aim.duty.duty_base.entity.bo;

import com.aim.duty.duty_base.entity.base.AbstractMagicProp;

public class Brick extends AbstractMagicProp {

	private int mineId;

	private int blood;

	public int getMineId() {
		return mineId;
	}

	public void setMineId(int mineId) {
		this.mineId = mineId;
	}

	public int getBlood() {
		return blood;
	}

	public void setBlood(int blood) {
		this.blood = blood;
	}

	@Override
	public boolean isChange() {
		// TODO Auto-generated method stub
		return false;
	}
}
