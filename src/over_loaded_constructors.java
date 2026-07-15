public class over_loaded_constructors {
    String name;
    String email;
    int age;

    over_loaded_constructors(String name){
        this.name=name;
        this.email="nil";
        this.age=0;
    }

    over_loaded_constructors(){
        this.name="nil";
        this.email="nil";
        this.age=0;
    }


    over_loaded_constructors(String name,String email){
        this.name=name;
        this.email=email;
        this.age=0;
    }
    over_loaded_constructors(String name,String email,int age){
        this.name=name;
        this.email=email;
        this.age=age;
    }
}
