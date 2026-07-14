public class class_oops1 {
   //car
    String make = "Ford";
    String mode = "Mustang";
    int year = 2026;                   //attributes
    double price = 580000;
    boolean isRunning = false;

    void start() {
        isRunning = true;
        System.out.println("you start the engine");

    }
    void stop(){
        isRunning = false;
        System.out.println("you stop the engine");
    }
}
