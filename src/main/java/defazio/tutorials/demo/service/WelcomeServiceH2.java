package defazio.tutorials.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("default")
public class WelcomeServiceH2 implements WelcomeService {
    @Value("${prop.yaml}")
    private String propYaml;
    @Override
    public String welcome() {
        return "Profile: default database:H2 yaml:"+propYaml;
    }
}
