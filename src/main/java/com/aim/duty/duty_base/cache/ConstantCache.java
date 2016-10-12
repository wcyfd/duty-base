package com.aim.duty.duty_base.cache;

import java.util.HashMap;
import java.util.Map;

import com.aim.duty.duty_base.entity.base.Constant;
import com.aim.duty.duty_base.entity.base.GameObject;
import com.aim.duty.duty_base.entity.bo.Brick;
import com.aim.duty.duty_base.entity.bo.Cement;

public class ConstantCache {

	public static Map<Byte,Class<? extends GameObject>> salePropClassMap = new HashMap<>();
	
	public static void init(){
		salePropClassMap.put(Constant.BRICK, Brick.class);
		salePropClassMap.put(Constant.CEMENT, Cement.class);
	}
}
