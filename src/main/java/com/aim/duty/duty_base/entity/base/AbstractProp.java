package com.aim.duty.duty_base.entity.base;

public abstract class AbstractProp extends GameObject {

	private int id;
	private int num;
	protected byte propType = -1;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

//	public void setPropType(byte propType) {
//		this.propType = propType;
//	}

	public byte getPropType() {
		return propType == -1 ? getInitPropType() : this.propType;
	}

	protected abstract byte getInitPropType();

	@Override
	public abstract boolean isChange();

}
