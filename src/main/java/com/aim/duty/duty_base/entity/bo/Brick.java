package com.aim.duty.duty_base.entity.bo;

import com.aim.duty.duty_base.entity.base.AbstractMagicProp;
import com.aim.duty.duty_base.entity.base.Constant;

public class Brick extends AbstractMagicProp {

	private int mineId;

	public int getMineId() {
		return mineId;
	}

	public void setMineId(int mineId) {
		this.mineId = mineId;
	}

	@Override
	public boolean isChange() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected byte getInitPropType() {
		// TODO Auto-generated method stub
		return Constant.BRICK;
	}
	
	@Override
	public Brick clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Brick)super.clone();
	}

}
