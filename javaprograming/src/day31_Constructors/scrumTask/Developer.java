package day31_Constructors.scrumTask;

public class Developer {

    public String name;
    public int employeeID;
    public String jopTitle;
    public double salary;

    public Developer(String name, int employeeID, String jopTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jopTitle = jopTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jopTitle='" + jopTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }

    public void coding(){
        System.out.println(name+ " is coding");
    }

    public void unitTesting(){
        System.out.println(name+ " is unit testing");
    }

    public void fixingBug(){
        System.out.println(name+ " is fixing bug");
    }





}
