package in.athenaeum.jpmcspringjune2025;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class PetrolEngine implements Engine {
    public PetrolEngine() {
        System.out.println("PetrolEngine constructor");
    }


    @Override
    public void start() {
        
    }

    @Override
    public void stop() {

    }
}
