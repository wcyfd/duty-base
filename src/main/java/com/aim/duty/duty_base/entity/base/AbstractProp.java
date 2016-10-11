package com.aim.duty.duty_base.entity.base;

import com.aim.duty.duty_base.entity.protobuf.serial.Serial;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;

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

	@Override
	public ByteString serialize() {
		// TODO Auto-generated method stub
		ByteString data = Serial.AbstractProp.newBuilder().setSuperClassData(super.serialize()).setId(id).setNum(num)
				.setPropType(propType).build().toByteString();
		return data;
	}

	@Override
	public void deserialize(ByteString data) {
		// TODO Auto-generated method stub
		try {
			Serial.AbstractProp ser = Serial.AbstractProp.parseFrom(data);
			super.deserialize(ser.getSuperClassData());
			this.setId(ser.getId());
			this.setNum(ser.getNum());
			this.propType = (byte) ser.getPropType();
		} catch (InvalidProtocolBufferException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
