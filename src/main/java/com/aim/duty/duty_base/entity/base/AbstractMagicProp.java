package com.aim.duty.duty_base.entity.base;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.aim.duty.duty_base.entity.bo.Magic;

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

}
