package in.athenaeum.jpmcspringjune2025;

import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class SampleApi {
    private final MessageSource messageSource;

    public SampleApi(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @GetMapping
    public String get(@RequestHeader(name = "Accept-Language", required = false) Locale locale) {
        return messageSource.getMessage("greeting.hello", null, locale);
    }
}
