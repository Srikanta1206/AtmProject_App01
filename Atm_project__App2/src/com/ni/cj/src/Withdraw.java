package com.ni.cj.src;

public class Withdraw implements Transation {
	@Override
	public void process(int amt) throws IllegalArgumentException{
		
		if(amt<b.getBal() && amt%100==0)  {
			b.bal-=amt;
			System.out.println("balance amount is  :"+b.getBal());
			System.out.println("Transation completed :");
		}
		else
			throw new IllegalArgumentException("Insufficiant fund");
	}

}
