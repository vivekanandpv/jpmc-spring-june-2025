package in.athenaeum.jpmcspringjune2025;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

//@Component
public class AppBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("petrolEngine")) {
            System.out.println("Before Initialization of " + beanName);
        }
        
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("petrolEngine")) {
            System.out.println("After Initialization of " + beanName);
        }

        return bean;
    }
}
