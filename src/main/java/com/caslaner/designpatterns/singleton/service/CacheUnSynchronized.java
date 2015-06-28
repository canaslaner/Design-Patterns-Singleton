package com.caslaner.designpatterns.singleton.service;

import java.util.Map;

public class CacheUnSynchronized {

	private static CacheUnSynchronized cacheSynchronized = null;

	private Map<String, String> basicCache = null;

	private CacheUnSynchronized() {
	}

	public static CacheUnSynchronized get() {
		if (cacheSynchronized == null) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			cacheSynchronized = new CacheUnSynchronized();
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
