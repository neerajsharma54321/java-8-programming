package com.java8.lambda;

public class LambdaInitialization {
	
	interface PeopleInterface{
		void setPeople(People people);
	}
	
	interface PeopleInformation{
		People getPeopleInfo(Integer id);
	}
	
	public static void main(String ...s) {
		
		PeopleInterface[] pArray = new PeopleInterface[] {(id)->{}, (id)->{}};
		
//		People p1 = new People(1, "Neeraj", "indore");
//		
//		PeopleInterface peopleInterface = (people)-> {};
//		
//		PeopleInformation peopleInformation = (id)-> {
//			return null;
//		};
		
	}
}

class People{
	int id;
	String name;
	String address;
	
	public People(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
}
