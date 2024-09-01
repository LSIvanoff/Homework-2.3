public class Main {
    public static void main(String[] args) {
//        final Bicycle b1 = new Bicycle("b1", 2);
//        final Bicycle b2 = new Bicycle("b2", 2);
//        final Car c1 = new Car("c1", 4);
//        final Car c2 = new Car("c2", 4);
        final Truck t1 = new Truck("t1", 8, new SmallTrailer());
        final Truck t2 = new Truck("t2", 8, new BigTrailer());

        final Checkable[] wheeledTransports = {t1, t2};
        for (Checkable wheeledTransport : wheeledTransports) {
            wheeledTransport.check();
        }
    }
}