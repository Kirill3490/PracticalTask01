public class Main{
    public static void main(String[] args){
        CandyList candyList = new CandyList();
        candyList.setChocolateCandyWeight();
        candyList.setChocolateCandyPrice();
        candyList.setJelatinCandyWeight();
        candyList.setJelatinCandyPrice();
        candyList.printPricePerKilo();
        candyList.priceDifference();            
    }
}