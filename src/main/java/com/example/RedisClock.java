package com.example;

import java.time.Clock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.springframework.beans.factory.annotation.Autowired;

import com.feng.liu.SysoTest;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class RedisClock implements Runnable {

	private final ReentrantLock clock = new ReentrantLock();

	private static int ticket = 10;

	private Jedis resource = new Jedis();

	public RedisClock(Jedis resource) {
		this.resource = resource;
	}

//	@Override
//	public void run() {
//
//		while (true) {
//
//			System.out.println(Thread.currentThread().getName() + "进来啦！！！！！");
//			boolean tryLock = clock.tryLock();
//
//			if (tryLock) {
//
//				System.out.println(Thread.currentThread().getName() + "拿到锁！！！！！");
//
//				clock.lock();
//
//				if (ticket > 0) {
//					try {
//						System.out.println(Thread.currentThread().getName() + "锁上了！！！！！");
//
//						System.out.println(Thread.currentThread().getName() + "--正在销售第" + ticket + "张票");
//						--ticket;
//						System.out.println(Thread.currentThread().getName() + "--还剩" + ticket + "张票");
//
//					} catch (Exception e) {
//
//						e.printStackTrace();
//
//					} finally {
//						clock.unlock();
//					}
//				} else {
//					break;
//				}
//
//			}
//		}
//	}

	@Override
	public void run() {
		
		// 使用 redis 作为锁
		while(ticket > 0){
			
			//Long sadd = resource.sadd("name", "femg");
			
			resource.lpush(Thread.currentThread().getName()+"", System.currentTimeMillis()+"");
			
//			System.out.println(Thread.currentThread().getName() + "ssssssss" + sadd);
//			
//			resource.del("name");
			
//			if (sadd > 0) {
//				
//				if (ticket > 0) {
//					
//					System.out.println(Thread.currentThread().getName() + "--正在销售第" + ticket + "张票");
//					--ticket;
//					System.out.println(Thread.currentThread().getName() + "--还剩" + ticket + "张票");
//					
//				}else{
//					resource.del("name");
//					System.out.println(Thread.currentThread().getName()+"break 了！！！");
//					break;
//				}
//			}
		}
		
	 }

}
