package com.aim.duty.duty_base.entity.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.aim.duty.duty_base.entity.bo.Magic;
import com.aim.duty.duty_base.entity.protobuf.serial.Serial;
import com.aim.duty.duty_base.entity.protobuf.serial.Serial.AbstractMagicProp.MagicSet;
import com.aim.duty.duty_base.entity.protobuf.serial.Serial.AbstractMagicProp.MagicSet.Builder;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;

public abstract class AbstractMagicProp extends AbstractProp {
	/** 魔法总计 */
	private Map<Integer, Magic> magicMap = new HashMap<>();
	/** 魔法集 */
	private Map<Integer, Set<Magic>> magicDetailMap = new HashMap<>();

	public Map<Integer, Magic> getMagicMap() {
		return magicMap;
	}

	public Map<Integer, Set<Magic>> getMagicDetailMap() {
		return magicDetailMap;
	}

	/**
	 * 添加魔法
	 * 
	 * @param m
	 * @author wcy 2016年10月8日
	 */
	public void addMagic(Magic m) {
		Set<Magic> magicSet = magicDetailMap.get(m.getMagicId());
		if (magicSet == null) {
			magicSet = new HashSet<>();
			magicDetailMap.put(m.getMagicId(), magicSet);
		}
		magicSet.add(m);

		Magic magic = magicMap.get(m.getMagicId());
		if (magic == null) {
			magic = new Magic();
			magicMap.put(m.getMagicId(), magic);
		}

		magic.setDuration(magic.getDuration() + m.getDuration());
		magic.setValue(magic.getValue() + m.getValue());
	}

	/**
	 * 计算魔法
	 * 
	 * @author wcy 2016年10月8日
	 */
	public void calculateMagic() {
		this.magicMap.clear();
		for (Map.Entry<Integer, Set<Magic>> entrySet : magicDetailMap.entrySet()) {
			int magicId = entrySet.getKey();
			Set<Magic> magicSet = entrySet.getValue();

			Magic magic = magicMap.get(magicId);
			if (magic == null) {
				magic = new Magic();
				magicMap.put(magicId, magic);
			}
			for (Magic e : magicSet) {
				int duration = e.getDuration();
				int value = e.getValue();

				magic.setDuration(magic.getDuration() + duration);
				magic.setValue(magic.getValue() + value);
			}
		}
	}

	@Override
	public AbstractMagicProp clone() throws CloneNotSupportedException {
		AbstractMagicProp magicProp = (AbstractMagicProp) super.clone();
		magicProp.magicDetailMap = new HashMap<>();
		magicProp.magicMap = new HashMap<>();

		for (Set<Magic> magics : magicDetailMap.values()) {
			for (Magic magic : magics) {
				Magic cloneMagic = magic.clone();
				magicProp.addMagic(cloneMagic);
			}
		}
		return magicProp;
	}

	@Override
	public ByteString serialize() {
		Serial.AbstractMagicProp.Builder builder = Serial.AbstractMagicProp.newBuilder();
		builder.setSuperClassData(super.serialize());

		Map<Integer,MagicSet> magicDetailsMap = new HashMap<>();
		for (Map.Entry<Integer, Set<Magic>> entrySet : magicDetailMap.entrySet()) {
			List<ByteString> list = new ArrayList<>();
			for (Magic magic : entrySet.getValue()) {
				list.add(magic.serialize());
			}			
			magicDetailsMap.put(entrySet.getKey(), MagicSet.newBuilder().addAllMagics(list).build());
		}
		
		builder.putAllMagicDetails(magicDetailsMap);

		return builder.build().toByteString();
	}

	@Override
	public void deserialize(ByteString data) {
		try {
			Serial.AbstractMagicProp ser_abstractMagicProp = Serial.AbstractMagicProp.parseFrom(data);
			super.deserialize(ser_abstractMagicProp.getSuperClassData());
			for (Map.Entry<Integer, MagicSet> entrySet : ser_abstractMagicProp.getMagicDetailsMap().entrySet()) {
				for (ByteString serMagic : entrySet.getValue().getMagicsList()) {
					Magic magic = new Magic();
					magic.deserialize(serMagic);
					this.addMagic(magic);
				}
			}
		} catch (InvalidProtocolBufferException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
