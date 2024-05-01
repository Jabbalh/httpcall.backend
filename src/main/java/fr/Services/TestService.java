package fr.Services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.stereotype.Service;

@Service(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TestService {

    public String hello()
    {
        return "Hello world";
    }

}
