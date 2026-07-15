public class class_2_using_constructors {
    String name ;
    int age ;
    double cgpa;
    boolean isEnrolled;

    class_2_using_constructors(String name, int age, double cgpa){
        this.name=name;
        this.age=age;
        this.cgpa=cgpa;
        this.isEnrolled=true;

    }

    void studying(){
        System.out.println(this.name+" is studying");

    }

}
