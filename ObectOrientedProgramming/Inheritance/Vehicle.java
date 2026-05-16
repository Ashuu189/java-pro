package Inheritance;
public class Vehicle {
public String name;
public String model;


Vehicle(){
    this.name="";
    this.model="";

}

Vehicle(String name, String model){
    this.name=name;
    this.model=model;
}


public void engineStart(){
    System.out.printf("Engine Started of %s %s \n",name,model);

}

public void engineStop(){
    System.out.printf("Engine Stopped of %s %s \n",name,model);
}


}