package in.athenaeum.jpmcspringjune2025;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("de")
public class DieselEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Diesel Engine starts...");
    }

    @Override
    public void stop() {

    }
}
