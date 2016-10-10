package com.aim.duty.duty_base.service;

import com.aim.duty.duty_base.entity.base.AbstractProp;

public class PropServiceImpl implements PropService {

	@Override
	public AbstractProp extract(AbstractProp sourceProp, int extractCount) {
		// TODO Auto-generated method stub
		int sourceNum = sourceProp.getNum();
		int deltaCount = sourceNum - extractCount;
		try {
			AbstractProp extractProp = sourceProp.clone();
			
			extractProp.setNum(deltaCount >= 0 ? extractCount : sourceProp.getNum());
			sourceProp.setNum(deltaCount >= 0 ? deltaCount : 0);
			
			return extractProp;
		} catch (CloneNotSupportedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return null;
	}
}
