package TestClass.test2;

import TestClass.test1.Person;

public class Sportsman extends Person {
    Sportsman(String name){
        setName(name);

    }
    private int speedRunning;

    public int getSpeedRunning() {
        return speedRunning;
    }

    public void setSpeedRunning(int speedRunning) {
        this.speedRunning = speedRunning;
    }

    @Override
    protected void displayInfo() {
        super.displayInfo();
        System.out.println("Speed - "+ speedRunning ); ;
    }
    @Override
    public void say(){
        super.say();
        System.out.println("Hello, I`m Sportsman");
    }
}
