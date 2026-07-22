public class inher2_emp extends inher2_person {
    int salary;
    inher2_emp(String first,String last , int salary) {
        super(first,last);
        this.salary = salary;
    }
    void showSalary() {
        System.out.println("Salary is: " + salary);
    }
}
