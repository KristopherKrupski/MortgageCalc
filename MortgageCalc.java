import java.util.Scanner;
public class MortgageCalc {
    public static void main(String[] args){
        final int MONTHS_IN_YEAR = 12;
        final int RATE = 100;
        double principal, interestRate, payment, numMonths; 
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is your principal?");
        principal = input.nextDouble();
        
        System.out.println("What is your interest rate?");
        interestRate = input.nextDouble()/RATE;
        
        System.out.println("How many years do you have to repay");
        numMonths = input.nextDouble()*MONTHS_IN_YEAR;
        
        interestRate = interestRate / 12;
        
        payment = principal*(interestRate*Math.pow(1 + interestRate, numMonths)) /( Math.pow(1+interestRate, numMonths) - 1); 
        
        System.out.println("Your mortgage payment will be " + payment);
    }
}
