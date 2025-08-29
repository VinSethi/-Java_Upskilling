package com.sparta.vs.zoo;

public class Zookeeper extends Staff{

    public Zookeeper(String name, int year, int month, int day, String enclosure) {
        super(name, year, month, day, enclosure);
    }

    public String feedAnimal(){
        return this.getName() + "is feeding the" + this.getEnclosure();
    }

    @Override
    public String talk() {
        return "Hi I am a Zookeeper named" + this.getName();
    }
}
