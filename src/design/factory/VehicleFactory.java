package design.factory;

public class VehicleFactory {
    Vehicle getVehicle(String type){
        if(type.equalsIgnoreCase("Bike")){
            return new Bike();
        } else if (type.equalsIgnoreCase("Car")) {
            return new Car();
        }
        return null;
    }
}
