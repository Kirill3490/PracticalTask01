import java.util.Scanner;
public class Distance{
    private double distance;
     Scanner scanner = new Scanner(System.in);
    
    public void setDistance(){
        System.out.println("Enter distance between two cities in cm:");
        this.distance = scanner.nextDouble();
    }
    
    public double getDistance(){
        return distance;
    }
    
    public void convertM(){
        double distanceM = getDistance()/100;
        System.out.printf("Distance between two cities in m: %.2f\n", distanceM);  
    }
    
    public void convertKm(){
        double distanceKm = getDistance()/100000;
        System.out.printf("Distance between two cities in km: %.5f\n", distanceKm);  
    }
    
    public void converterSelection(){
        System.out.printf("Select the converter:\n1)Meter converter\n2)Kilometer converter \n3)All converter\n");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                convertM();
                break;
            case 2: 
                convertKm();
                break;
            case 3:
                convertM();
                convertKm();
                break;
            default:
                System.out.println("You select non exist converter");
                break;
        }
    }
}