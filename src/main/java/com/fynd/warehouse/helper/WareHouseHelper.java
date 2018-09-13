package com.fynd.warehouse.helper;

import java.util.concurrent.atomic.AtomicLong;

public class WareHouseHelper {
	private static AtomicLong numberGenerator = new AtomicLong(910000000000L);

    public static long getNext() {
        return numberGenerator.getAndIncrement();
    }
}
