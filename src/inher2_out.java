public class inher2_out {
    public static void main(String[] args) {
        inher2_person p1 = new inher2_person("abhinav","aby");
        inher2_student s1 = new inher2_student("rohan","john",1.23);
        inher2_emp emp1 = new inher2_emp("john","joseph",2000000);

        p1.show();
        s1.show();
        s1.showGpa();
        emp1.show();
        emp1.showSalary();
    }
}
