package com.aim.duty.duty_base.entity.bo;

import com.aim.duty.duty_base.entity.base.AbstractMagicProp;
import com.aim.duty.duty_base.entity.base.Constant;

public class Cement extends AbstractMagicProp {

	private int mineId;

	@Override
	public boolean isChange() {
		// TODO Auto-generated method stub
		return false;
	}

	public int getMineId() {
		return mineId;
	}

	public void setMineId(int mineId) {
		this.mineId = mineId;
	}

	@Override
	protected byte getInitPropType() {
		// TODO Auto-generated method stub
		return Constant.CEMENT;
	}
	

}
