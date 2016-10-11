package com.aim.duty.duty_base.entity.bo;

import com.aim.duty.duty_base.entity.base.AbstractMagicProp;
import com.aim.duty.duty_base.entity.base.Constant;
import com.aim.duty.duty_base.entity.protobuf.serial.Serial;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;

public class Brick extends AbstractMagicProp {
	private int mineId;

	public int getMineId() {
		return mineId;
	}

	public void setMineId(int mineId) {
		this.mineId = mineId;
	}

	@Override
	public boolean isChange() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected byte getInitPropType() {
		// TODO Auto-generated method stub
		return Constant.BRICK;
	}

	@Override
	public Brick clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Brick) super.clone();
	}

	@Override
	public ByteString serialize() {
		// TODO Auto-generated method stub
		return Serial.Brick.newBuilder().setMineId(mineId).setSuperClassData(super.serialize()).build().toByteString();
	}

	@Override
	public void deserialize(ByteString data) {
		// TODO Auto-generated method stub
		try {
			Serial.Brick ser = Serial.Brick.parseFrom(data);
			this.setMineId(ser.getMineId());
			super.deserialize(ser.getSuperClassData());
		} catch (InvalidProtocolBufferException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		super.deserialize(data);
	}

}
