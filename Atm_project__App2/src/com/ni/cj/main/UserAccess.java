package com.ni.cj.main;

import java.util.Scanner;

import com.ni.cj.src.CheckPinNo;
import com.ni.cj.src.CountDigit;
import com.ni.cj.src.Deposit;
import com.ni.cj.src.Withdraw;

public class UserAccess extends RuntimeException {
	
	UserAccess(){	
	}
	UserAccess(String s){
		super(s);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=0;
		pqr:
			while(true) {
				System.out.println("Enter pinNo   :");
				int pinNo=sc.nextInt();
				CountDigit cd=new CountDigit();
				int count=cd.getCount(pinNo);
				if(count==4) {
					CheckPinNo cpn=new CheckPinNo();
					boolean b=cpn.verify(pinNo);
					if(b) {
						System.out.println("*******Choice*****");
						System.out.println("1.Withdraw\n2.Deposit\n3.exit");
						System.out.println("Enter your Choice");
						switch(sc.nextInt()) {
						case 1->{
							//System.out.println("Enter your Choice");
							int amt=sc.nextInt();
							if(amt>0 && amt%100==0) {
								Withdraw w=new Withdraw();
								w.process(amt);
							}
							else {
								throw new UserAccess("Not  A Valid amount");
							}
							break pqr;
						}
						//Deposit Operation
						case 2->{
							System.out.println("Enter amt for Deposit");
							int amt=sc.nextInt();
							if(amt>0 && amt%100==0) {
								Deposit d=new Deposit();
								d.process(amt);
							}
							else 
								throw new UserAccess("Invalid amt");
							break pqr;
						}
						default->System.out.println("Invalid Choice");
					}
				}else {
						System.out.println("Invalid Pin");
						c++;
					}
			}else {
				System.out.println("Invalid Pin Length");
				c++;
			}
			//Account blocked if three time incorrect pin in a Transation
			if(c==3) {
				System.err.println("Transation blocked for 48 hours");
				break;
			}
		}
		sc.close();
	}
}
