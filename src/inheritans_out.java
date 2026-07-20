public class inheritans_out {
    public static void main(String[] args) {
        inheritans_class_dog dog = new inheritans_class_dog();
        inheritans_class_cat cat = new inheritans_class_cat();

        System.out.println(dog.isalive);
        System.out.println(cat.isalive);
        System.out.println(" ");
        dog.eat();
        cat.eat();
        System.out.println(dog.life);
        System.out.println(cat.life);
        System.out.println(" ");
        dog.speak();
        cat.speak();
    }
}
