package day08_IfStatements;

public class SalaryCalculator {
    public static void main(String[] args) {

        int hourlyRate = 50,
            weeklyHours = 45;

        double stateTaxRate = 6.5,
               fedealTax = 26.2;

        //----------------
        int salaryBeforeTax = hourlyRate * weeklyHours * 52;
        double stateTax = salaryBeforeTax * stateTaxRate / 100;
        double federalTax = salaryBeforeTax * fedealTax / 100;
        double totalTax  = stateTax * fedealTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;
//--------------------------------------------------------------------
        System.out.println("Gross pay is: $" + salaryBeforeTax);
        System.out.println("State tax = $" + stateTax);
        System.out.println("Fedarel tax = $" + federalTax);
        System.out.println("Total tax = $" + totalTax);
        System.out.println("Net income = $" + salaryAfterTax);




    }
}
