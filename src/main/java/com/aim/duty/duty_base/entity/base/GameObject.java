package com.aim.duty.duty_base.entity.base;

import com.aim.duty.duty_base.entity.protobuf.serial.Serial;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;

public abstract class GameObject implements Cloneable{

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
//	public ByteString serialize(){
//		return Serial.GameObject.newBuilder().build().toByteString();
//	}
//	
//	public void deserialize(ByteString data){		
//		try {
//			Serial.GameObject ser = Serial.GameObject.parseFrom(data);
//
//		} catch (InvalidProtocolBufferException e) {
//			e.printStackTrace();
//		}
//	}
	
}
