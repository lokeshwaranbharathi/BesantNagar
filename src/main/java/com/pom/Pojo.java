package com.pom;

public class Pojo {
	private int var;

	public Pojo(int i) {
		this.var=i;
		System.out.println("the pojo value is "+ var);
	}

	public int getVar() {
		return var;
	}

	public void setVar(int var) {
		this.var = var;
	}
	

}
