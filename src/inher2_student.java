public class inher2_student extends inher2_person {
    double cgpa;
    inher2_student(String first,String last,double cgpa) {
        super(first,last);
        this.cgpa = cgpa;

    }
    void showGpa(){
        System.out.println(cgpa);
    }
   }





