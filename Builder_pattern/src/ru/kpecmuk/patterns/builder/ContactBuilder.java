package ru.kpecmuk.patterns.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author kpecmuk
 * @since 04.03.2018
 */

public final class ContactBuilder {
    private static final Logger log = LoggerFactory.getLogger(ContactBuilder.class);

    private int age;
    private String name;
    private String phone;
    private String address;
    private String mail;

    public Contact build() {
        return new Contact(this);
    }

    public ContactBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public ContactBuilder age(final int age) {
        this.age = age;
        return this;
    }

    public ContactBuilder phone(final String phone) {
        this.phone = phone;
        return this;
    }

    public ContactBuilder address(final String address) {
        this.address = address;
        return this;
    }

    public ContactBuilder mail(final String mail) {
        this.mail = mail;
        return this;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getMail() {
        return mail;
    }
}
