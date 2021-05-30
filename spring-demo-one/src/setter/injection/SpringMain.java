package setter.injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String s[]) {
		
		ClassPathXmlApplicationContext context = null;
		try {
			
			context = new ClassPathXmlApplicationContext("applicationContext.xml");
			Coach c = context.getBean("cricketCoach", Coach.class);
			String data = c.workout();
			String fortuneData = c.getDailyFortune();
			System.out.println("data is ="+data+"\n, fortune Data ="+fortuneData);
			System.out.println(c);
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			if(context != null)
				context.close();
		}
	}
}
