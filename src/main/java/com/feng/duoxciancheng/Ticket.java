package com.feng.duoxciancheng;

import java.util.concurrent.locks.ReentrantLock;

public class Ticket {
	
	private final ReentrantLock lock = new ReentrantLock();
	
	private Integer left;
	
	private String ticketName;
	
	public Ticket() {
		super();
	}
	
	public Ticket(Integer left, String ticketName) {
		super();
		this.left = left;
		this.ticketName = ticketName;
	}
	public Integer getLeft() {
		return left;
	}
	public void setLeft(Integer left) {
		this.left = left;
	}
	public String getTicketName() {
		return ticketName;
	}
	public void setTicketName(String ticketName) {
		this.ticketName = ticketName;
	}
	
	public synchronized Integer sale(){
		if(this.left > 0){
			System.out.println(Thread.currentThread().getName() + "正在售票，这是票" + this.getLeft());
			this.setLeft(-- this.left);
		}
		return this.left;
	}
	
	
	public Integer saleByClock(){
		
		lock.lock();
		
		if(this.left > 0){
			System.out.println(Thread.currentThread().getName() + "正在售票，这是票" + this.getLeft());
			this.setLeft(-- this.left);
		}
		
		lock.unlock();
		
		return this.left;
	}
	
	
}
