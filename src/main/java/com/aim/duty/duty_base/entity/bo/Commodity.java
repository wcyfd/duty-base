package com.aim.duty.duty_base.entity.bo;

import com.aim.duty.duty_base.entity.base.AbstractProp;
import com.aim.duty.duty_base.entity.base.Constant;
import com.aim.duty.duty_base.entity.base.GameObject;

public class Commodity extends AbstractProp {
	private int singlePrice;

	private AbstractProp prop;

	@Override
	public boolean isChange() {
		// TODO Auto-generated method stub
		return false;
	}

	public int getSinglePrice() {
		return singlePrice;
	}

	public void setSinglePrice(int singlePrice) {
		this.singlePrice = singlePrice;
	}

	@Override
	protected byte getInitPropType() {
		// TODO Auto-generated method stub
		return Constant.COMMODITY;
	}

	public AbstractProp getProp() {
		return prop;
	}

	public void setProp(AbstractProp prop) {
		this.prop = prop;
	}

	@Override
	public Commodity clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Commodity commodity = (Commodity) super.clone();
		if (prop != null) {
			commodity.setProp(prop.clone());
		}
		return commodity;
	}
}
