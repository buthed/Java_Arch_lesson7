package com.tematihonov;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class User {
    String name;
    String position;
    int experience;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}

