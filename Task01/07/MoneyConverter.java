import java.util.Scanner;
public class MoneyConverter{
    private double moneyCount;
    
    Scanner scanner = new Scanner(System.in);
    
    public void setMoneyCount(){
        System.out.println("Enter money count BYN:");
        this.moneyCount = scanner.nextDouble();
    } 
    public double getMoneyCount(){
        return moneyCount;
    }
    
    public double convertEUR(){
        return moneyCount / 2.4377;
    }
    
    public double convertUSD() {
        return moneyCount / 2.1564;
    }
    
    public double convertRUB() {
        return moneyCount / 3.2572 * 100;
    }

    public double convertPLN(){
        return moneyCount / 5.627 * 10;
    }
    
    public void printConvertedMoney() {
        System.out.printf("Money in EUR: %.3f\n", convertEUR());
        System.out.printf("Money in USD: %.3f\n", convertUSD());
        System.out.printf("Money in RUB: %.3f\n", convertRUB());
        System.out.printf("Money in PLN: %.3f\n", convertPLN());
    }
}