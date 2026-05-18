package Inheritance;

public class Car extends Vehicle{

  public int numberOfDoors;
  public String transmissionType;


  Car(String name, String model, int numberOfDoors, String transmissionType){
    super(name,model);
    this.numberOfDoors=numberOfDoors;
    this.transmissionType=transmissionType;
    
  }

  public void startAc(){
    System.out.println("AC Started in "+name+" "+model);
  }


}
    

