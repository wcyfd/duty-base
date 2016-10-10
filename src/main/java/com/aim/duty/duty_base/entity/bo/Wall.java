package com.aim.duty.duty_base.entity.bo;

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

	@Override
	public Wall clone() throws CloneNotSupportedException {
		Wall wall = (Wall) super.clone();
		wall.brickList = new TreeMap<>();
		wall.cementList = new TreeMap<>();

		for (Map.Entry<Integer, Brick> entrySet : brickList.entrySet()) {
			int index = entrySet.getKey();
			Brick brick = entrySet.getValue().clone();
			wall.brickList.put(index, brick);
		}
		for (Map.Entry<Integer, Cement> entrySet : cementList.entrySet()) {
			int index = entrySet.getKey();
			Cement cement = entrySet.getValue().clone();
			wall.cementList.put(index, cement);
		}
		return wall;
	}

}
