package ru.kpecmuk.patterns.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author kpecmuk
 * @since 04.03.2018
 */

final class Contact {
    private static final Logger log = LoggerFactory.getLogger(Contact.class);

    private final int age;
    private final String name;
    private final String phone;
    private final String address;
    private final String mail;

    Contact(final ContactBuilder contactBuilder) {
        this.age = contactBuilder.getAge();
        this.name = contactBuilder.getName();
        this.phone = contactBuilder.getPhone();
        this.address = contactBuilder.getAddress();
        this.mail = contactBuilder.getMail();
    }
}
