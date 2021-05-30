package com.pluralsight.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class InitDestroyMethodBeanDemo implements InitializingBean, DisposableBean {

	private String fName;
	private String lName;
	private Address address;
	
	public InitDestroyMethodBeanDemo(Address address) {
		this.address = address;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("using interface init");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("using interface Destory");	
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	@Override
	public String toString() {
		return "InitDestoryMethodBeanDemo [fName=" + fName + ", lName=" + lName + "]";
	}
	
	

}
