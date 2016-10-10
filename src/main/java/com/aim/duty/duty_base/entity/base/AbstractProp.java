package com.aim.duty.duty_base.entity.base;

public abstract class AbstractProp extends GameEntity {

	private int id;
	private int num;
	protected byte propType = -1;

	public AbstractProp() {
		propType = propType == -1 ? getInitPropType() : this.propType;
	}

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

	public byte getPropType() {
		return propType;
	}

	public AbstractProp clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (AbstractProp) super.clone();
	}

	protected abstract byte getInitPropType();

	@Override
	public abstract boolean isChange();

}
