package com.ni.cj.src;

public interface Transation {
	public static final Balance b=new Balance();
	public abstract void process(int amt); 
}
