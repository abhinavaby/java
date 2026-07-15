public class class_2_out {
    public static void main(String[] args) {
        class_2_using_constructors obj = new class_2_using_constructors("abhinav", 19, 9.21);
        class_2_using_constructors obj2 = new class_2_using_constructors("abel", 18, 9.88);


        System.out.println("--------------student 1-----------------");
        System.out.println("student name is "+obj.name+" and age is "+obj.age);
        System.out.println("student cgpa is "+obj.cgpa);
        System.out.println("student isEnrolled is "+obj.isEnrolled);
        obj.studying();

        System.out.println("--------------student 2-----------------");
        System.out.println("student name is "+obj2.name+" and age is "+obj2.age);
        System.out.println("student cgpa is "+obj2.cgpa);
        System.out.println("student isEnrolled is "+obj2.isEnrolled);
        obj2.studying();
    }
}
