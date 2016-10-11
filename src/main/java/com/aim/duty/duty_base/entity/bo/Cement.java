package com.aim.duty.duty_base.entity.bo;

import com.aim.duty.duty_base.entity.base.AbstractMagicProp;
import com.aim.duty.duty_base.entity.base.Constant;
import com.aim.duty.duty_base.entity.protobuf.serial.Serial;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;

public class Cement extends AbstractMagicProp {

	private int mineId;

	@Override
	public boolean isChange() {
		// TODO Auto-generated method stub
		return false;
	}

	public int getMineId() {
		return mineId;
	}

	public void setMineId(int mineId) {
		this.mineId = mineId;
	}

	@Override
	protected byte getInitPropType() {
		// TODO Auto-generated method stub
		return Constant.CEMENT;
	}

	@Override
	public Cement clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Cement cement = (Cement) super.clone();
		return cement;
	}

	@Override
	public ByteString serialize() {
		// TODO Auto-generated method stub
		ByteString data = Serial.Cement.newBuilder().setMineId(mineId).setSuperClassData(super.serialize()).build()
				.toByteString();
		return data;
	}

	@Override
	public void deserialize(ByteString data) {
		try {
			Serial.Cement serCement = Serial.Cement.parseFrom(data);
			this.setMineId(serCement.getMineId());
			super.deserialize(serCement.getSuperClassData());
		} catch (InvalidProtocolBufferException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
