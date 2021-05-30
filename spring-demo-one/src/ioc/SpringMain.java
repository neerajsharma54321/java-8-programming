package ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String s[]) {
		
		ClassPathXmlApplicationContext context = null;
		try {
			
			context = new ClassPathXmlApplicationContext("applicationContext.xml");
			Coach c = context.getBean("myCoach", Coach.class);
			String data = c.workout();
			System.out.println("data is ="+data);
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			if(context != null)
				context.close();
		}
	}
}
