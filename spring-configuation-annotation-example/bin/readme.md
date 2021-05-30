FAQ: Problems with Injecting Values - Value not returning from ${foo.email}

Question

I am running the code for Java Configuration and injecting values from props file. However, I'm getting:

${foo.email}
${foo.team}

Instead of the actual property values. How can I resolve this?

Answer

This is an issue with Spring versions.

If you are using Spring 4.2 and lower, you will need to add the code in bold.

---

package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
// @ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
    
    // add support to resolve ${...} properties
    @Bean
    public static PropertySourcesPlaceholderConfigurer
                    propertySourcesPlaceHolderConfigurer() {
        
        return new PropertySourcesPlaceholderConfigurer();
    }
    
    // define bean for our sad fortune service
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }
    
    // define bean for our swim coach AND inject dependency
    @Bean
    public Coach swimCoach() {
        SwimCoach mySwimCoach = new SwimCoach(sadFortuneService());
        
        return mySwimCoach;
    }
    
}
----

In Spring 4.3 and higher, they removed this requirement. As a result, you don't need this code.

In the video, I show Spring 4.3, that's why this code is not displayed.

Let me know if that clears it up.

:-)

