package project;

import org.springframework.context.annotation.*;

@Configuration
public class SpringConfig {

    @Bean
    public SpringExampleBean springExampleBean(){
        return new SpringExampleBean();
    }

    @Bean
    public MyPostProcessor myPostProcessor(){
        return new MyPostProcessor();
    }
}
