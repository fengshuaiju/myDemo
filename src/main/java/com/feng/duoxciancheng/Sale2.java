package com.feng.duoxciancheng;

public class Sale2 implements Runnable{

	
	private Ticket ticketIn;
	
	private Sale2(){
	}
	
	private Sale2(Ticket ticket){
		this.ticketIn = ticket;
	}
	
	public static Sale2 getSale(Ticket ticket){
		return new Sale2(ticket);
	}
	
	
	@Override
	public void run() {
		while (ticketIn.getLeft() > 0) {
			try {
				Thread.sleep(1L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ticketIn.sale();
		}
		
	}

}
