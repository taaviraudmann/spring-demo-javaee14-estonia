package com.sda.springdemojavaee14.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j//to provide log field for us
// the same as private static final Logger log = LoggerFactory.getLogger(MyFirstRestController.class);
public class GreetingService {

    public String makeSomeGreetingToUser(String name) {
        String result = "Welcome to Spring class " + name;

        log.info(result);
        return result;
    }
}
