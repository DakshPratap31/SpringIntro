package com.example.SpringIntro.Components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DemoBean {
    private static final Logger logger = LoggerFactory.getLogger(DemoBean.class);

    public DemoBean() {
        logger.info("DemoBean instance created!");
    }
    public void showMessage() {
        logger.info("Hello from DemoBean!");
    }
}
