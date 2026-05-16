package Inheritance;

public class Animal {
    public String name;
    public int noOfLegs;
    public String eat;
    
    // Animal(){
    // this.name="";
    // this.noOfLegs="";
    // this.eat="";
    // }

    Animal(String name, int noOfLegs, String eat){
    this.name=name;
    this.noOfLegs=noOfLegs;
    this.eat=eat;
}


    void eat(){
        System.out.println(name+" is eating "+eat);
    }


}
