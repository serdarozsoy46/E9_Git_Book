package day31_Constructors.scrumTask;

public class Tester {

    public String name;
    public int employeeID;
    public String jopTitle;
    public double salary;

    public Tester(String name, int employeeID, String jopTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jopTitle = jopTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jopTitle='" + jopTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }

    public void smokeTesting(){
        System.out.println(name+" is smoke testing");
    }
    public void creatingTicket(){
        System.out.println(name+" is creating ticket");
    }


}
