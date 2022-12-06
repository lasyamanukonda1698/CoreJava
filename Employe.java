package JavaClass;


public class Employe {
    long id;
    String name;
    int age;
    Double salary;
    float weight;
    char group;

    Employe() {

        System.out.println("No arg constructor");
    }

    Employe(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("this is 3 arg constructor");

    }

    Employe(long id,int age, String name, Double salary, float weight, char group) {
        this(age, name);
        this.id =id;
        this.salary = salary;
        this.weight = weight;
        this.group = group;
        System.out.println("this is 6 arg constructor");

    }

    Employe(double salary) {
        this.salary = salary;
        System.out.println("this is 2 arg constructor");
    }

    Employe(String name) {
        this.name = name;
        System.out.println("this is 1 arg constructor");
    }

    public String toString(){

        return "salary is " + this.id + " name is " + this.name
                + " salary is " + this.salary + " age is "+ this.age + " weight is " + this.weight + " blood group is " + this.group;
    }


}


class Main {
    public static void main(String args[]) {
        Employe emp3 = new Employe(45000);
        Employe emp1 = new Employe(1061745,21,"lasya",25000.00,61,'A');
        Employe emp2 = new Employe(107456,24,"reddy",45000.00,66,'B');
        System.out.println(emp2);
        System.out.println(emp1);




    }
}



