import java.util.Scanner;
public class Number{
    private double firstNumber;
    private double secondNumber;
    
    Scanner scanner = new Scanner(System.in);
    
    public void setFirstNumber(){
        System.out.println("Enter first number:");
        this.firstNumber = scanner.nextDouble();
    }
    
    public double getFirstNumber(){
        return firstNumber;
    }
    public void setSecondNumber(){
        System.out.println("Enter second number:");
        this.secondNumber = scanner.nextDouble();
    }
    
    public double getSecondNumber(){
        return firstNumber;
    }
    
    public void changePlace(){
        firstNumber += secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber -= secondNumber;
    }
    
    public void print(){
        System.out.printf("First number: %.5f\nSecond number: %.5f", firstNumber, secondNumber);
    }
    
}