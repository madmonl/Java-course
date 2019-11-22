import java.util.Scanner;
    public class Triangle
{
 public static void main (String [] args)
 {
 Scanner scan = new Scanner (System.in);
    System.out.println ("This program calculates the area "
    + "and the perimeter of a given triangle. ");
    System.out.println ("Please enter the three lengths"
    + " of the triangle's sides");
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int h = a+b+c; //היקף
    int s = (h)/2 ; //חצי היקף
         if (a>0 && b>0 && c>0){
                    if (Math.abs(a-b)<c && c<(a+b)){
                        System.out.println (h);
                        System.out.println (Math.sqrt(s*((s-a)*(s-b)*(s-c))));
                    }
            else {
                System.out.println ("ערכי צלעות לא תקינים");
            }
        }
        else 
                { System.out.println ("צלע משולש לא יכולה להיות שלילית");}
 } // end of method main
} //end of class Triangle 