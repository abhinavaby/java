public class over_loaded_constructors_out {
    public static void main(String[] args) {
        over_loaded_constructors obj = new over_loaded_constructors("abel");
        over_loaded_constructors obj2 = new over_loaded_constructors("rohan","r@gmail.com");
        over_loaded_constructors obj3 = new over_loaded_constructors("ronaldo","CR7@gmail.com",41);
        over_loaded_constructors obj4 = new over_loaded_constructors();

        System.out.println(obj.name);
        System.out.println(obj.email);
        System.out.println(obj.age);

        System.out.println(" ");
        System.out.println(obj2.name);
        System.out.println(obj2.email);
        System.out.println(obj2.age);

        System.out.println(" ");
        System.out.println(obj3.name);
        System.out.println(obj3.email);
        System.out.println(obj3.age);

        System.out.println(" ");
        System.out.println(obj4.name);
        System.out.println(obj4.email);
        System.out.println(obj4.age);
    }
}
