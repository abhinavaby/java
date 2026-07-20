public class static_method_class {
     static int numOfFriends;
     String name;
    static_method_class(String name){
        this.name=name;
        numOfFriends++;
    }

    static void friends(){
        System.out.println("you have "+numOfFriends+" friends"); // this. not needed here


    }
}
