package ch08.sec12;

public class InstanceofExample {
    public static void main(String[] args) {
        //구현객체생성
        Taxi taxi = new Taxi();
        Bus bus= new Bus();
        //ride() 메소드호출시구현객체를매개값으로전달
        ride(taxi);
        System.out.println();
        ride(bus);
    }
    public static void ride(Vehicle vehicle) {
        //방법1
         /*if(vehicle instanceof Bus) {
         Bus bus = (Bus) vehicle;
         bus.checkFare();
         }*/
        //방법2
        if(vehicle instanceof Bus bus) {
            bus.checkFare();
        }
        vehicle.run();
    }
}
