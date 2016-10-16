package com.aim.duty.duty_base.entity.base;

import com.google.protobuf.ByteString;

public interface CustomSerializable<T> {
	public ByteString serialize();

	public T deserialize(ByteString data);
}
