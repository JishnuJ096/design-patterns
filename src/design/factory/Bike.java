package design.factory;

public class Bike implements Vehicle{
    @Override
    public void build() {
        System.out.println("Building Motorcycle");
    }
}
