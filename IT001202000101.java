import java.util.Scanner;

class IT001202000101 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        TaxCalc IncomeTax = new TaxCalc();

        System.out.print("\nPlease enter your Annual Gross Income: ");
        double AGI = input.nextDouble();
        IncomeTax.setAGI(AGI);

        System.out.print("Please enter your Non-Taxable Income: ");
        double NTI = input.nextDouble();
        IncomeTax.setNTI(NTI);

        input.close();

        System.out.println("\nYour Annual Gross Income: " + (int)IncomeTax.getAGI());
        System.out.println("Your Non-Taxable Income: " + (int)IncomeTax.getNTI());
        System.out.println("Your Taxable Income: " + (int)IncomeTax.getTI());
        System.out.println("Your Annual Income Tax: " + (int)IncomeTax.getAIT());
        

    }
}
