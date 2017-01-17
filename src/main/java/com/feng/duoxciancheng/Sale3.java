package com.feng.duoxciancheng;

public class Sale3 implements Runnable{

	
	private Ticket ticketIn;
	
	private Sale3(){
	}
	
	private Sale3(Ticket ticket){
		this.ticketIn = ticket;
	}
	
	public static Sale3 getSale(Ticket ticket){
		return new Sale3(ticket);
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
			ticketIn.saleByClock();
		}
		
	}

}
