package Inheritance;

    interface LandVehicle{

        default void move(){
            System.out.println("Land vehicle is moving");
        }   
    }

    interface WaterVehicle{
        default void waterInfo(){
            System.out.println("Water vehicle is moving");
        }
    }

    class AmphibiousVehicle implements LandVehicle, WaterVehicle {
      public void AmphibiousVehicleInfo(){
            System.out.println("Amphibious vehicle can move on land and water");
        }
    }


public class multipleInheritance {
    public static void main(String[] args) {
        AmphibiousVehicle av = new AmphibiousVehicle();
        av.move(); // From LandVehicle
        av.waterInfo(); // From WaterVehicle
        av.AmphibiousVehicleInfo(); // Specific to AmphibiousVehicle
    }
}