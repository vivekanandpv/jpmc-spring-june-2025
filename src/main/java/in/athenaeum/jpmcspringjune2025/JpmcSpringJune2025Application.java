package in.athenaeum.jpmcspringjune2025;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SpringBootApplication
public class JpmcSpringJune2025Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(JpmcSpringJune2025Application.class, args);
//        Engine engine = context.getBean(Engine.class);
//        
//        Car car = new Car(engine);
//        
//        car.start();
    }

}
