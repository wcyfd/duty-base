package com.aim.duty.duty_base.entity.base;

import com.aim.duty.duty_base.entity.protobuf.serial.Serial;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;

public abstract class AbstractProp extends GameEntity {

	protected int propType = -1;

	public AbstractProp() {
		propType = propType == -1 ? getInitPropType() : this.propType;
	}

	public int getPropType() {
		return propType;
	}

	public AbstractProp clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (AbstractProp) super.clone();
	}

	protected abstract int getInitPropType();

	@Override
	public abstract boolean isChange();

//	@Override
//	public ByteString serialize() {
//		// TODO Auto-generated method stub
//		ByteString data = Serial.AbstractProp.newBuilder().setSuperClassData(super.serialize()).setPropType(propType)
//				.build().toByteString();
//		return data;
//	}
//
//	@Override
//	public void deserialize(ByteString data) {
//		// TODO Auto-generated method stub
//		try {
//			Serial.AbstractProp ser = Serial.AbstractProp.parseFrom(data);
//			super.deserialize(ser.getSuperClassData());
//			this.propType = ser.getPropType();
//		} catch (InvalidProtocolBufferException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

}
