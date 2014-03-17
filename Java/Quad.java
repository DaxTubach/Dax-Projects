import java.util.Scanner;

public class Quad { 

public static void main(String[] args) {	

System.out.println ("Please enter a value for a");
Scanner sc = new Scanner(System.in);
double a = sc.nextDouble(); 
System.out.println(a);

System.out.println ("Please enter a value for b");
double b = sc.nextDouble(); 
System.out.println(b);

System.out.println ("Please enter a value for c");
double c = sc.nextDouble(); 
System.out.println(c);


double x = 0;	
x = (-b + (Math.sqrt((b*b - ((4 * a * c))))))/ (2 * a);

double y = 0;	
y = (-b - (Math.sqrt((b*b - ((4*a*c))))))/ (2 * a);


if (((b*b - ((4 * a * c))) < 0) == true) {	
System.out.println ("There are no real roots");
}
if (((b*b - ((4 * a * c))) < 0) == false) {
System.out.println ("The Roots are " + x + " or " + y );
}
}
} 
