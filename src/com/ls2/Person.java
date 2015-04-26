package com.ls2;

import com.sun.corba.se.impl.io.ObjectStreamClass;
import jdk.nashorn.internal.runtime.regexp.joni.ast.Node;

public class Person {
    private final String name;
    private final Position position;
    private final String phone;
    private final String email;

    public Person(String name, Position position, String phone, String email) {
        this.name = name;
        this.position = position;
        this.phone = phone;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public Position getPos() {
        return position;
    }

    public String getPhone() {
        return phone;
    }

    public String getMail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person that = (Person) o;

        if (!name.equals(that.name)) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        return !(email != null ? !email.equals(that.email) : that.email != null);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
}

