package com.pojosexample;

public class Car {
    private String doors;
    private String driver;
    private String engine;
    private int speed;

    public Car(){}
    public Car(String doors,String driver,String engine,int speed){
        this.doors=doors;
        this.driver=driver;
        this.engine=engine;
        this.speed=speed;
    }
    public void setDoors(String doors){
        this.doors=doors;
    }
    public String getDoors(){
        return doors;
    }
    public void setDriver(String driver){
        this.driver=driver;
    }
    public String getDriver(){
        return driver;
    }
    public void setEngine(String engine){
        this.engine=engine;
    }
    public String getEngine(){
        return engine;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }
    public int getSpeed(){
        return speed;
    }

    public String carFunction(){
        if(doors.equals("closed")&& driver.equals("seated")&& engine.equals("working")&& speed>=10){
            return "running";
        }
        else
            return "not running";
    }
}
