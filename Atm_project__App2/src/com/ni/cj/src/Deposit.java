package com.ni.cj.src;

public class Deposit implements Transation {

	@Override
	public void process(int amt) throws IllegalArgumentException{
		
		if(amt<0)
			throw new IllegalArgumentException("Amount must be greater then 0");
		else {
			b.bal+=amt;
			System.out.println("Current Balance  :"+b.getBal());
		}
	}
}
