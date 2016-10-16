package com.aim.duty.duty_base.entity.bo;

import com.aim.duty.duty_base.entity.base.GameEntity;

public class BaseRole extends GameEntity {

	private String name;
	private String account;

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

	@Override
	public boolean isChange() {
		// TODO Auto-generated method stub
		return false;
	}

}
