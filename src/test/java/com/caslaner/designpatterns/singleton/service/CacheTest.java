package com.caslaner.designpatterns.singleton.service;

import org.junit.*;

public class CacheTest {

	@Test
	public void synchronizedTest() {
		System.out.println("synchronizedTest Started...");
		Thread thread1 = new Thread(new TestThread("Thread 1", CacheSynchronized.class));
		Thread thread2 = new Thread(new TestThread("Thread 2", CacheSynchronized.class));

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void unSynchronizedTest() {
		System.out.println("unSynchronizedTest Started...");
		Thread thread1 = new Thread(new TestThread("Thread 1", CacheUnSynchronized.class));
		Thread thread2 = new Thread(new TestThread("Thread 2", CacheUnSynchronized.class));

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}
