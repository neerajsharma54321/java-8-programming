package bean.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String s[]) {
		
		ClassPathXmlApplicationContext context = null;
		try {
			
			context = new ClassPathXmlApplicationContext("beanLifeCycleApplicationContext.xml");
			
			// constructor should be called only once because we are using the same reference and scope is singleton.
			Coach c1 = context.getBean("cricketCoach", Coach.class);
			
			
			System.out.println(c1);	
			
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			if(context != null)
				context.close();
		}
	}
}
