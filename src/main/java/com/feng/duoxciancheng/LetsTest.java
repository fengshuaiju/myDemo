package com.feng.duoxciancheng;

public class LetsTest {

	public static void main(String[] args) {
		
		//1:在类外部写售票、减票的方法
//		Ticket ticket = new Ticket(10,"春节回家的票");
//		Sale1 sale = Sale1.getSale(ticket);
//		Thread slea1 = new Thread(sale,"售票员GG");
//		Thread slea2 = new Thread(sale,"售票员MM");
//		slea1.start();
//		slea2.start();
		
//		//2:调用售票类的方法售票，同步锁加在售票方法上
//		Ticket ticket = new Ticket(10,"春节回家的票");
//		Sale2 sale = Sale2.getSale(ticket);
//		Thread slea1 = new Thread(sale,"售票员GG");
//		Thread slea2 = new Thread(sale,"售票员MM");
//		slea1.start();
//		slea2.start();
		
		
		//3:clock同步锁
		Ticket ticket = new Ticket(10,"春节回家的票");
		Sale3 sale = Sale3.getSale(ticket);
		Thread slea1 = new Thread(sale,"售票员GG");
		Thread slea2 = new Thread(sale,"售票员MM");
		slea1.start();
		slea2.start();
		
	}
	
}
