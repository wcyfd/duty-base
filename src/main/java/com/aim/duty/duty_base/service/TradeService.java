package com.aim.duty.duty_base.service;

public interface TradeService {
	public void sell(int propId, int num, int price);

	public void buy(int commodityId, int num);

	public void showCommodity();
}
