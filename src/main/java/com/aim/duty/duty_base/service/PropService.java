package com.aim.duty.duty_base.service;

import com.aim.duty.duty_base.entity.base.AbstractProp;

public interface PropService {
	AbstractProp extract(AbstractProp sourceProp, int extractCount);

}
