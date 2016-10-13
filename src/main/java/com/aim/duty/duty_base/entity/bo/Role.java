package com.aim.duty.duty_base.entity.bo;

import java.util.HashMap;
import java.util.Map;

import com.aim.duty.duty_base.entity.base.AbstractProp;
import com.aim.duty.duty_base.entity.base.GameEntity;

public class Role extends GameEntity {

	private String name;
	private String account;
	private Map<Integer, AbstractProp> propMap = new HashMap<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public Map<Integer, AbstractProp> getPropMap() {
		return propMap;
	}

	@Override
	public boolean isChange() {
		// TODO Auto-generated method stub
		return false;
	}

}
