package design.factory;

public class Car implements Vehicle{
    @Override
    public void build() {
        System.out.println("Building car");
    }
}
