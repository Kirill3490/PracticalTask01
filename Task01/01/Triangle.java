import java.util.Scanner;
public class Triangle{
    private double sideA;
    private double sideB;
    private double sideC;
    
    Scanner scanner = new Scanner(System.in);
    
    public void setSideA(){
        System.out.println("Enter side A:");
        this.sideA = scanner.nextDouble();
    } 
    public double getSideA(){
        return sideA;
    }
    public void setSideB(){
        System.out.println("Enter side B:");
        this.sideB = scanner.nextDouble();
    } 
    public double getSideB(){
        return sideB;
    }
    public void setSideC(){
        System.out.println("Enter side C:");
        this.sideC = scanner.nextDouble();
    } 
    public double getSideC(){
        return sideC;
    }
    
    public void check(){
        if(sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA){
            System.out.println("Triangle exist");
        } else {
            System.out.println("Triangle can\'t exist");
        }
    }
}