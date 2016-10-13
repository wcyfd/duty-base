package com.aim.duty.duty_base.entity.bo;

public class Architect extends Role {
	private Wall wall;

	public void setWall(Wall wall) {
		this.wall = wall;
	}

	public Wall getWall() {
		return wall;
	}

	@Override
	public void setChange(boolean change) {
		// TODO Auto-generated method stub
		super.setChange(change);
	}
}
