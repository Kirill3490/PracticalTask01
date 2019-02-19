import java.util.Scanner;
public class CandyList{
    private double chocolateCandyWeight;
    private double chocolateCandyPrice;
    private double jelatinCandyWeight;
    private double jelatinCandyPrice;
    
    Scanner scanner = new Scanner(System.in);
    
    public void setChocolateCandyWeight(){
        System.out.println("Enter chocolate candy weight:");
        this.chocolateCandyWeight = scanner.nextDouble();
    }
    public double getChocolateCandyWeight(){
        return chocolateCandyWeight;
    }
    public void setChocolateCandyPrice(){
        System.out.println("Enter chocolate candy price:");
        this.chocolateCandyPrice = scanner.nextDouble();
    }
    public double getChocolateCandyPrice(){
        return chocolateCandyPrice;
    }
    public void setJelatinCandyWeight(){
        System.out.println("Enter jelatin candy weight:");
        this.jelatinCandyWeight = scanner.nextDouble();
    }
    public double getJelatinCandyWeight(){
        return jelatinCandyWeight;
    }
    public void setJelatinCandyPrice(){
        System.out.println("Enter jelatin candy price:");
        this.jelatinCandyPrice = scanner.nextDouble();
    }
    public double getJelatinCandyPrice(){
        return jelatinCandyPrice;
    }
    
    
    public double pricePerKiloChocolate(){
        return chocolateCandyPrice / chocolateCandyWeight;
    }
    public double pricePerKiloJelatin(){
        return jelatinCandyPrice / jelatinCandyWeight;
    }
    
    
    public void printPricePerKilo(){
        System.out.printf("Price per kilogram chocalate candy: %.3f\n", pricePerKiloChocolate());
        System.out.printf("Price per kilogram jelatin candy: %.3f\n", pricePerKiloJelatin());
    }
    
    public void priceDifference(){
        double difference = pricePerKiloChocolate() / pricePerKiloJelatin();
        if (difference > 1) {
            System.out.println("Chocolate is more expensive than zhelatin in " + difference);
        } else if (difference < 1) {
            System.out.println("Chocolate is less expensive than zhelatin in " + difference);
        } else {
            System.out.println("Prices are equals");
        }
    }
}