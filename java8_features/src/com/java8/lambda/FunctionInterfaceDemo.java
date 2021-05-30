package com.java8.lambda;

public class FunctionInterfaceDemo {

	public static void main(String[] args) {
		
		// without lambda expression
		FunctionalInterfaceWithoutBody functionalInterfaceWithoutBody = new FunctionalInterfaceWithoutBody() {
			@Override
			public void draw() {
				System.out.println("without java 8 lambda expression");
			}
		};
		 
		FunctionalInterfaceWithoutBody lambdaExWithNoBody = () -> {
			System.out.println("Hello in the world functional interface without no body of parameter");
		};
		

		FunctionalInterfaceWithOneParam functionalInterfaceWithOneParam = (point) -> {
			System.out.println("Number of points are = "+point);
		};
		
		FunctionInterfaceWithMoreParam functionInterfaceWithMoreParam = (one, two, three) -> {
			System.out.println("point 1= "+one+", point 2 = "+two+", point 3 ="+three);
		};
		
		functionalInterfaceWithoutBody.draw();
		
		lambdaExWithNoBody.draw();
		
		functionalInterfaceWithOneParam.draw(5);
		
		functionInterfaceWithMoreParam.draw(4, 5, 6);
		
		// functional interface demo wihtout return type 
		System.out.println("without return type specification\n");
		Add add = (a, b) -> (a + b);
		System.out.println("add "+add.perform(4, 5));
		
		// functional interface with type specificaion
		System.out.println("With type param and return type\n");
		Subtract subtract = (int a, int b) -> {
			return a-b;
		};
		System.out.println("subtract = "+subtract.perform(5, 6));
		
		
		System.out.println("With type param and without return type\n");
		Multiply multiply = (int a, int b) -> (a*b);
		System.out.println("Multiplication = "+multiply.perform(5, 6));
		
		// multiple statement example
		
		System.out.println("mulitple line statment.");
		Multiply multiply2 = (int a, int b) -> {
			System.out.println("it is multiple number of line statment");
			int c= 5;
			return a * b * c;
		};
		
		System.out.println(multiply2.perform(5, 5));
		
	}

}


interface FunctionalInterfaceWithoutBody{
	void draw();
}

interface FunctionalInterfaceWithOneParam{
	void draw(int numberOfPoints);
}

interface FunctionInterfaceWithMoreParam{
	void draw(int firstPoint, int secondPoint, int thirdPoint);
}

interface PerformTask {
	int perform(int a, int b);
}

interface Add extends PerformTask {
}

interface Subtract extends PerformTask{
}

interface Multiply extends PerformTask{
	
}