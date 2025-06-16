package in.athenaeum.jpmcspringjune2025;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class SampleApi {
    private final MessageSource messageSource;
    private final ApplicationContext applicationContext;

    public SampleApi(MessageSource messageSource, ApplicationContext applicationContext) {
        this.messageSource = messageSource;
        this.applicationContext = applicationContext;
    }

    @GetMapping
    public String get(@RequestHeader(name = "Accept-Language", required = false) Locale locale, @RequestParam(required = false) String engineType) {
        if (engineType == null) {
            engineType = "petrolEngine";
        }
        
        Engine engine = applicationContext.getBean(engineType, Engine.class);
        engine.start();
        
        return messageSource.getMessage("greeting.hello", null, locale);
    }
}
