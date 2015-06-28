package com.caslaner.designpatterns.singleton.service;

import java.util.Map;

public class CacheSynchronized {

	private static CacheSynchronized cacheSynchronized = null;

	private Map<String, String> basicCache = null;

	private CacheSynchronized() {
	}

	public static CacheSynchronized get() throws InterruptedException {
		//double checked locking
		if (cacheSynchronized == null) {
			synchronized (CacheSynchronized.class) {
				if (cacheSynchronized == null) {
					Thread.sleep(2000);
					cacheSynchronized = new CacheSynchronized();
				}
			}
		}
		return cacheSynchronized;
	}

	public void put(String key, String value) {

		basicCache.put(key, value);
	}

	public String get(String key) {
		return basicCache.get(key);
	}

	public void remove(String key) {
		basicCache.remove(key);
	}
}
