package com.caslaner.designpatterns.singleton.service;

public class TestThread implements Runnable {

	private Class<?> type = null;
	private String threadName = null;

	public TestThread(String threadName, Class clazz) {
		this.type = clazz;
		this.threadName = threadName;
	}

	@Override
	public void run() {
		Object cache = null;
		try {
			if (type.equals(CacheSynchronized.class)) {
				cache = CacheSynchronized.get();
			} else if (type.equals(CacheUnSynchronized.class)) {
				cache = CacheUnSynchronized.get();
			}
			System.out.println(threadName + " instance is : " + cache);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
