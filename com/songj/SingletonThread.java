package com.songj;

import static java.lang.Thread.sleep;

public class SingletonThread {
 
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		thread.setName("单线程");
		System.out.println(thread.getName()+"正在运行");
		for (int i = 0; i < 10; i++) {
			System.out.println("线程正在休眠："+i);
			try {
				sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("线程出现错误！");
			}
		}
		
	}
}