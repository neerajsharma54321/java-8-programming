package bean.scope.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String s[]) {
		
		ClassPathXmlApplicationContext context = null;
		try {
			
			context = new ClassPathXmlApplicationContext("beanScopeapplication.xml");
			
			// constructor should be called only once because we are using the same reference and scope is singleton.
			Coach c1 = context.getBean("cricketCoach", Coach.class);
			System.out.println(c1);
			Coach c2 = context.getBean("cricketCoach", Coach.class);
			System.out.println(c2);		
			
			// constructor will be called every time because we are using prototpe scope.
			Coach c3 = context.getBean("cricketCoachP", Coach.class);
			System.out.println(c3);	
			Coach c4= context.getBean("cricketCoachP", Coach.class);
			System.out.println(c4);	
			
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			if(context != null)
				context.close();
		}
	}
}
