package com.ni.cj.src;

public class CountDigit {
	
	public int getCount(int pin) {
		int count=0;
		while(pin!=0) {
			pin/=10;
			count++;
		}
		return count;
	}
}
