package com.aim.duty.duty_base.entity.base;

import com.aim.duty.duty_base.entity.protobuf.serial.Serial;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;

public abstract class GameEntity extends GameObject {

	private int id;
	private boolean change;

	public abstract boolean isChange();

	public void setChange(boolean change) {
		this.change = change;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	@Override
	public GameEntity clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (GameEntity) super.clone();
	}

	@Override
	public ByteString serialize() {
		// TODO Auto-generated method stub
		ByteString data = Serial.GameEntity.newBuilder().setChange(this.change).setId(this.id).setSuperClassData(super.serialize())
				.build().toByteString();
		return data;
	}

	@Override
	public void deserialize(ByteString data) {
		try {
			Serial.GameEntity ser = Serial.GameEntity.parseFrom(data);

			this.setId(ser.getId());
			this.setChange(ser.getChange());
			super.deserialize(ser.getSuperClassData());
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}

}
