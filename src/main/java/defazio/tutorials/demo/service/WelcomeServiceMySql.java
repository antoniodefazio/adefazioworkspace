package defazio.tutorials.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("mysql")
public class WelcomeServiceMySql implements WelcomeService{
    @Value("${prop.yaml}")
    private String propYaml;
    @Override
    public String welcome() {
         return "MYSQL Database"+propYaml;
    }
}
