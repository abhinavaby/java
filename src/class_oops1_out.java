public class class_oops1_out {
    public static void main(String[] args) {
        class_oops1 car = new class_oops1();
        System.out.println(car.mode);
        System.out.println(car.price);
        System.out.println(car.isRunning);
        System.out.println(car.make);

        car.isRunning = true;
        System.out.println(car.isRunning);

        System.out.println(" ");
        car.stop();
        System.out.println("car is running: "+car.isRunning);
        System.out.println(" ");
        car.start();
        System.out.println("car is running: "+  car.isRunning);


    }
}
