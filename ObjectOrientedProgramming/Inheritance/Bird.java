package Inheritance;

public class Bird extends Animal{

    public String hasFeathers;

    Bird(String name, int noOfLegs, String eat, String hasFeathers){
        super(name,noOfLegs,eat);
        this.hasFeathers=hasFeathers;
    }

    public void fly(){
        System.out.println(name+" is flying");
    }

    
}
