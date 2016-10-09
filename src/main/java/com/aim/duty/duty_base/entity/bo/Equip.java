package com.aim.duty.duty_base.entity.bo;

import java.util.HashMap;
import java.util.Map;

import com.aim.duty.duty_base.entity.base.AbstractProp;
import com.aim.duty.duty_base.entity.base.Constant;

public class Equip extends AbstractProp {

	private Map<String, Integer> attributeMap = new HashMap<>();

	@Override
	public boolean isChange() {
		// TODO Auto-generated method stub
		return false;
	}

	public Map<String, Integer> getAttributeMap() {
		return attributeMap;
	}

	@Override
	protected byte getInitPropType() {
		// TODO Auto-generated method stub
		return Constant.EQUIP;
	}

}
