package com.tiger.hilt.binds;

import javax.inject.Inject;

public class ChinaCar {

    private Engine engine;

    @Inject
    public ChinaCar(Engine engine) {
        this.engine = engine;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


    @Override
    public String toString() {
        return "ChinaCar{" +
                "name='" + name + '\'' +
                '}';
    }
}
