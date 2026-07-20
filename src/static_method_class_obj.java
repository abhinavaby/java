public class static_method_class_obj {
    public static void main(String[] args) {
        static_method_class obj=new static_method_class("rohan");
        static_method_class obj2=new static_method_class("abel");
        static_method_class obj3=new static_method_class("ronaldo");
        static_method_class obj4=new static_method_class("rohith");

        System.out.println(obj.numOfFriends);
        System.out.println(obj2.numOfFriends);
        System.out.println(obj3.numOfFriends);      // it's correct, but it is best done good to call by the class
        System.out.println(obj4.numOfFriends);

        // the right way
        System.out.println(" ");
        System.out.println(static_method_class.numOfFriends);
        static_method_class.friends();
    }

}
