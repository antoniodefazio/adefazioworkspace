package defazio.tutorials.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("docker")
public class WelcomeServiceDocker implements WelcomeService {
    @Value("${prop.yaml}")
    private String propYaml;
    @Override
    public String welcome() {
        return "Profile docker database: MYSQL yaml:"+propYaml;
    }
}
