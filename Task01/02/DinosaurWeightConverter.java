import java.util.Scanner;
public class DinosaurWeightConverter{
    private double dinosaurWeight;
     Scanner scanner = new Scanner(System.in);
    
    public void setDinosaurWeight(){
        System.out.println("Enter Dinosaur mass in gram:");
        this.dinosaurWeight = scanner.nextDouble();
    }
    
    public double getDinosaurWeight(){
        return dinosaurWeight;
    }
    
    public void convertKg(){
        double weightKg = getDinosaurWeight()/1000;
        System.out.printf("Dinosaur mass in kg: %.3f\n",weightKg);  
    }
    
    public void convertCentner(){
        double weightCentner = getDinosaurWeight()/100000;
        System.out.printf("Dinosaur mass in centner: %.5f\n",weightCentner);  
    }
    
    public void convertTon(){
        double weightTon = getDinosaurWeight()/1000000;
        System.out.printf("Dinosaur mass in ton: %.6f\n",weightTon);  
    }
    
    public void converterSelection(){
        System.out.printf("Select the converter:\n1)Kg converter\n2)Centner converter \n3)Ton converter\n4)All converter\n");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                convertKg();
                break;
            case 2: 
                convertCentner();
                break;
            case 3:
                convertTon();
                break;
            case 4:
                convertKg();
                convertCentner();
                convertTon();
                break;
            default:
                System.out.println("You select non exist converter");
                break;
        }
    }
}