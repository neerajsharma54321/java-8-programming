package com.pluralsight.lifecycle;

public class InitAndDestroy {
	
	private int id; 
	private Address address;
	
	public InitAndDestroy() {}
	
	public InitAndDestroy(int id, Address address) {
		this.id = id;
		this.address = address;
	}
	
	public void afterPropSet() {
		System.out.println("I'm in the init");
	}
	
	public void cleanup() {
		System.out.println("I'm performing destory");
	}

	@Override
	public String toString() {
		return "InitAndDestory [id=" + id + ", address=" + address + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}


