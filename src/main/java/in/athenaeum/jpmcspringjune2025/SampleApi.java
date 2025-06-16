package in.athenaeum.jpmcspringjune2025;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class SampleApi {
    private final MessageSource messageSource;
    private final Engine engine;

    public SampleApi(MessageSource messageSource, @Qualifier("de") Engine engine) {
        this.messageSource = messageSource;
        this.engine = engine;
    }

    @GetMapping
    public String get(@RequestHeader(name = "Accept-Language", required = false) Locale locale) {
        engine.start();
        return messageSource.getMessage("greeting.hello", null, locale);
    }
}
