import java.util.Arrays;


public class array_of_objects_obj {
    public static void main(String[] args) {
        array_of_obj_class obj = new array_of_obj_class("mustang","red");
        array_of_obj_class obj2 = new array_of_obj_class("BMW","white");
        array_of_obj_class obj3 = new array_of_obj_class("AUDI","pink");

        array_of_obj_class[] car = {obj,obj2,obj3};

        for(int i=0;i<car.length;i++){
            car[i].drive();
        }
        System.out.println(" ");
        for(array_of_obj_class c:car){
            c.drive();
        }
//               OR
//        Car[] cars = {new Car("Mustang", "Red"),
//                new Car("Corvette", "Blue"),
//                new Car("Charger", "Yellow")};
//
//        for(Car car : cars){
//            car.color = "black";
//        }
//
//        for(Car car : cars){
//            car.drive()
//        }



    }
}
