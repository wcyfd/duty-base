package com.aim.duty.duty_base.cache;

import java.util.HashMap;
import java.util.Map;

import com.aim.duty.duty_base.entity.base.GameObject;
import com.aim.duty.duty_base.entity.bo.Brick;
import com.aim.duty.duty_base.entity.bo.Cement;
import com.aim.duty.duty_base.service.prop.PropConstant;

public class ConstantCache {

	public static Map<Byte,Class<? extends GameObject>> salePropClassMap = new HashMap<>();
	
	public static void init(){
		salePropClassMap.put(PropConstant.BRICK, Brick.class);
		salePropClassMap.put(PropConstant.CEMENT, Cement.class);
	}
}
