package com.feng.duoxciancheng;

public class Sale1 implements Runnable{

	private Ticket ticketIn;
	
	private Sale1(){
	}
	
	private Sale1(Ticket ticket){
		this.ticketIn = ticket;
	}
	
	public static Sale1 getSale(Ticket ticket){
		return new Sale1(ticket);
	}
	
	
	
	@Override
	public void run() {
		
		System.out.println("1"+ Thread.currentThread().getName()+ "///" + ticketIn.getLeft());
		
			synchronized (ticketIn) {
				
				System.out.println("2"+ Thread.currentThread().getName()+ "///" + ticketIn.getLeft());
				
				Integer left = ticketIn.getLeft();
				
				while (left > 0) {
					System.out.println("售票员:" + Thread.currentThread().getName() + ticketIn.getTicketName() + "正在销售的票" + ticketIn.getLeft());
					ticketIn.setLeft(-- left);
				}
			}
	}

	
}
