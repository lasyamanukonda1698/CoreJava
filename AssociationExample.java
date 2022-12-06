package JavaClass;

import java.util.*;
class Employee {
    private String name;
    private double rating;
    private int startyear;

    public int getStartyear() {
        return startyear;
    }

    public void setStartyear(int startyear) {
        this.startyear = startyear;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class Company {
    private String name;
    List<Employee> employees;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getemployees() {
        return employees;
    }
    public void setemployees(List<Employee> employees) {
        this.employees = employees;
    }
}
public class AssociationExample {
    public static void main(String[] args) {
        Employee person1 = new Employee();
        person1.setName("Lasya Manukonda");
        person1.setStartyear(2019);
        person1.setRating(5);

        Employee person2 = new Employee();
        person2.setName("Usha Ravi");
        person2.setStartyear(2019);
        person2.setRating(4.9);

        Employee person3 = new Employee();
        person3.setName("shinchan");
        person3.setStartyear(2020);
        person3.setRating(4.8);

        Employee person4 = new Employee();
        person4.setName("Mr.Bean");
        person4.setStartyear(2021);
        person4.setRating(4.7);

        Employee person5 = new Employee();
        person5.setName("black panther");
        person5.setStartyear(2022);
        person5.setRating(4.6);


        List<Employee> EmployeeList = new ArrayList<Employee>();
        EmployeeList.add(person1);
        EmployeeList.add(person2);
        EmployeeList.add(person3);
        EmployeeList.add(person4);
        EmployeeList.add(person5);

        Company company = new Company();
        company.setemployees(EmployeeList);
        company.setName("private ltd");

        for(Employee emp :EmployeeList){
            System.out.println(emp.getName() + " " + emp.getRating() + " " + emp.getStartyear());
        }

        System.out.println(company.getemployees(
        )+" are employees of the company "+
                company.getName());
    }

}
