package Inheritance;

public class MotorCycle extends Vehicle {
    public String handleBarStyle;

    MotorCycle(String name, String model, String handleBarStyle){
        super(name,model);
        this.handleBarStyle=handleBarStyle;
        
    }

    public void startHandleBarLight(){
        System.out.println("HandleBar Light Started in "+name+" "+model);
    }
     
}
