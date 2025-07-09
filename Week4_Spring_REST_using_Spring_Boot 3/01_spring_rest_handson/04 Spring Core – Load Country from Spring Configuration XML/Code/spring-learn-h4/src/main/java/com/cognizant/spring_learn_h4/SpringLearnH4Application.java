package com.cognizant.spring_learn_h4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearnH4Application {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnH4Application.class);

    public static void main(String[] args) {
        displayCountry();
    }

    public static void displayCountry() {
        LOGGER.info("START");

        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("country", Country.class);
        LOGGER.debug("Country : {}", country.toString());

        LOGGER.info("END");
    }
}
