package in.athenaeum.jpmcspringjune2025;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("petrolEngine")
public class PetrolEngine implements Engine {
    public PetrolEngine() {
        System.out.println("PetrolEngine constructor");
    }


    @Override
    public void start() {
        System.out.println("Petrol Engine starts...");
    }

    @Override
    public void stop() {

    }
}
