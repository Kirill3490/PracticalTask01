import java.util.Scanner;
public class File{
    private int fileSize;

    Scanner scanner = new Scanner(System.in);
    
    public void setFileSize(){
        System.out.println("Enter file size in byte:");
        this.fileSize = scanner.nextInt();
    }
    
    public int getFileSize(){
        return fileSize;
    }
    
    public void convertFileSizeKilobyte(){
        double kilobyte = (double)fileSize/1000;
        System.out.printf("File size in kilobyte: %.3f\n", kilobyte);
    }
    
    public void convertFileSizeMegabyte(){
        double megabyte = (double)fileSize/1000000;
        System.out.printf("File size in megabyte: %.6f\n", megabyte);
    }
    
    public void convertFileSizeGigabyte(){
        double gigabyte = (double)fileSize/1000000000;
        System.out.printf("File size in gigabyte: %.9f\n", gigabyte);
    }
    
    public void converterSelection(){
        System.out.printf("Select the converter:\n1)Kilobyte converter\n2)Megabyte converter \n3)Gigabyte converter\n4)All converter\n");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                convertFileSizeKilobyte();
                break;
            case 2: 
                convertFileSizeMegabyte();
                break;
            case 3:
                convertFileSizeGigabyte();
                break;
            case 4:
                convertFileSizeKilobyte();
                convertFileSizeMegabyte();
                convertFileSizeGigabyte();
                break;
            default:
                System.out.println("You select non exist converter");
                break;
        }
    }
}