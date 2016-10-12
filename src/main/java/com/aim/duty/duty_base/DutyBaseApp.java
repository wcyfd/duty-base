package com.aim.duty.duty_base;

import java.util.Map;
import java.util.Set;

import com.aim.duty.duty_base.entity.bo.Brick;
import com.aim.duty.duty_base.entity.bo.Magic;
import com.google.protobuf.ByteString;

/**
 * Hello world!
 *
 */
public class DutyBaseApp {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Brick brick = new Brick();

		Magic magic = new Magic();
		magic.setDuration(29);
		magic.setMagicId(2001);
		magic.setValue(5302);
		brick.addMagic(magic);

		Magic magic2 = new Magic();
		magic2.setDuration(33);
		magic2.setMagicId(4001);
		magic2.setValue(6543);
		brick.addMagic(magic2);
		
		brick.setMineId(444);
		brick.setNum(5);

		long time1 = System.currentTimeMillis();
		ByteString data = brick.serialize();
		long time2 = System.currentTimeMillis();
		System.out.println(time2 - time1);

		Brick b = new Brick();
		time1 = System.currentTimeMillis();

		b.deserialize(data);
		time2 = System.currentTimeMillis();
		System.out.println(time2 - time1);
		Map<Integer, Set<Magic>> map = b.getMagicDetailMap();
		for (Map.Entry<Integer, Set<Magic>> entrySet : map.entrySet()) {
			Set<Magic> magicSet = entrySet.getValue();
			for (Magic m : magicSet) {
				System.out.println(m.getMagicId());
				System.out.println(m.getDuration());
				System.out.println(m.getValue());
			}

		}
		System.out.println(b.getNum());
		System.out.println(b.getMineId());
		

	}
}
