public class array_of_obj_class {
    String model;
    String color;


    array_of_obj_class(String model,String color){
        this.model=model;
        this.color=color;
    }

    void drive(){
        System.out.println("you drive the "+this.model+" "+this.color);
    }
}
