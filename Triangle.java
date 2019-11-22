import java.util.Scanner;
public class Triangle {
  public static void main (String [] args) {
    Scanner scan = new Scanner (System.in);
    System.out.println("This program calculates the area "
    + "and the perimeter of a given triangle.");
    
    System.out.println("Please enter the three lengths"
    + " of the triangle's sides");
    
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int e = a + b + c; // extent
    int se = e / 2 ; // semi extent
    
    if (a <= 0 || b <= 0 || c <= 0) {
      System.out.println("צלע משולש לא יכולה להיות שלילית או אפס");
    }
    
    if ((Math.abs(a - b) < c) && (c < (a + b))) {
      System.out.println(e);
      System.out.println(Math.sqrt(se * ((se - a) * (se - b) * (se - c))));
    } else {
      System.out.println ("ערכי צלעות לא תקינים");
    } 
  }  
} 
