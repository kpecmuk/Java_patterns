package ru.kpecmuk.patterns.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author kpecmuk
 * @since 04.03.2018
 */

public class BuilderRunner {
    private static final Logger log = LoggerFactory.getLogger(BuilderRunner.class);

    public static void main(String[] args) {

        Contact contact = new ContactBuilder()
                .name("Alex")
                .address("Yar")
                .age(34)
                .build();

    }
}
