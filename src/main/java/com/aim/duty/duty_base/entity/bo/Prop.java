package com.aim.duty.duty_base.entity.bo;

import com.aim.duty.duty_base.entity.base.AbstractProp;
import com.aim.duty.duty_base.entity.base.Constant;

public class Prop extends AbstractProp {

	private int propId;
	private int num;

	@Override
	public boolean isChange() {
		// TODO Auto-generated method stub
		return false;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getPropId() {
		return propId;
	}

	public void setPropId(int propId) {
		this.propId = propId;
	}

	@Override
	protected byte getInitPropType() {
		// TODO Auto-generated method stub
		return Constant.PROP;
	}

}
