package com.aim.duty.duty_base.entity.bo;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.aim.duty.duty_base.entity.base.AbstractProp;
import com.aim.duty.duty_base.entity.base.Constant;

public class Wall extends AbstractProp {

	@Override
	protected byte getInitPropType() {
		// TODO Auto-generated method stub
		return Constant.WALL;
	}

	@Override
	public boolean isChange() {
		// TODO Auto-generated method stub
		return false;
	}

	private Map<Integer, Brick> brickList = new TreeMap<>();
	private Map<Integer, Cement> cementList = new TreeMap<>();
	private int capacity;
	private int blood;

	public int getBlood() {
		return blood;
	}

	public void setBlood(int blood) {
		this.blood = blood;
	}

	public Map<Integer, Brick> getBrickMap() {
		return brickList;
	}

	public Map<Integer, Cement> getCementMap() {
		return cementList;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
