
/**
 * Write a description of class Sale here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;

public class Sale {
   public String firstName;
   public String lastName;
   public String address;
   public String city;
   public String state;
   public int zip;
   public String phoneNum;
   Random random = new Random();
   public int custNum;
   private int total = 0;
   public DefDesign design;
   
public int setCustomNum() {
    custNum = random.nextInt(100000);
    custNum += 1;
    return custNum;
}

public void displayPrices() {
    System.out.println("Our prices go as displayed:");
    System.out.println("Design    Base Price    Feature 1    Feature 2    Feature 3    Feature 4    Feature 5");
    System.out.println("Nature     300            10            15           20           25           30");
    System.out.println("Tech       350            20            30           40           50           60"); 
    System.out.println("Business   375            30            40           50           60           70");
    System.out.println("Music      400            85            95           110          130          210");
    System.out.println("Naughty    500            100           200          300          400          500");
}

//Choose the design you would like: 1.) Nature  2.) Tech  3.) Business  4.) Music  5.) Naughty
public void requestSale(int designChoice) {   
    System.out.println("Which design type would you like?: 1.) Nature  2.) Tech  3.) Business  4.) Music  5.) Naughty");
    if(designChoice == 1) {
     design = new DefDesign(300,10,15,20,25,30);
     total += design.getBasePrice();
    } else if(designChoice == 2) {
     design = new DefDesign(350,20,30,40,50,60);
     total += design.getBasePrice();
    } else if(designChoice == 3) {
     design = new DefDesign(375,30,40,50,60,70);
     total += design.getBasePrice();
    } else if(designChoice == 4) {
     design = new DefDesign(400,85,95,110,160,210);
     total += design.getBasePrice();
    } else if(designChoice == 5) {
     design = new DefDesign(500,100,200,300,400,500);
     total += design.getBasePrice();
    } else {
     System.out.println("That is not a valid number. Please try again.");
    }
}

    //Choose the amount of features you would like to add to your website(1-5).
public void designFeatures(int featAmount) {
    if(featAmount == 1) {
    total += design.getFeat1();
    } else if(featAmount == 2) {
    total += design.getFeat2();
    } else if(featAmount == 3) {
    total += design.getFeat3();
    } else if(featAmount == 4) {
    total += design.getFeat4();
    } else if(featAmount == 5) {
    total += design.getFeat5();
    } else {
     System.out.println("That is not a valid number. Please try again.");   
    }
}

public void printReciept() {
   System.out.println("Thank you for your purchase "+firstName+" "+lastName+".");
   System.out.println("Your total is: "+total+".");   
}
}
