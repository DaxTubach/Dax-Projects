import java.util.*;
public class rps {
public static void main(String [] args) {


	Random gen= new Random();
	Scanner scan=new Scanner(System.in);
	System.out.println("Please choose 1-3: 1=Rock 2=Paper 3=Scissor 4=Lizard 5=Spock ");
	int choice=scan.nextInt();
	System.out.print("You choose " +choice);
	if (choice==1)
		{System.out.println(" ROCKS");}
	if (choice==2)
		{System.out.println(" PAPER");}
	if (choice==3)
		{System.out.println(" SCISSORS");}
	if (choice==4)
		{System.out.println(" LIZARD");}
	if (choice==5)
		{System.out.println(" SPOCK");}
	int rand=gen.nextInt(5)+1;
	System.out.print("The computer chooses " +rand);
	
	if (rand==1)
		{System.out.println(" ROCKS");}
	if (rand==2)
		{System.out.println(" PAPER");}
	if (rand==3)
		{System.out.println(" SCISSORS");}
	if (rand==4)
		{System.out.println(" LIZARD");}
	if (rand==5)
		{System.out.println(" SPOCK");}	
		
	
		
	if (choice==rand)
		{
			System.out.print("Draw");
		}
	if (choice==1 && rand==3)
		{System.out.print("Winner");}
	if (choice==3 && rand==1)
		{System.out.print("Loser");}
	if (choice==2 && rand==3)
		{System.out.print("Loser");}
	if (choice==2 && rand==1)
		{System.out.print("Winner");}
	if (choice==1 && rand==2)
		{System.out.print("Loser");}
	if (choice==3 && rand==2)
		{System.out.print("Winner");}
	if (choice==1 && rand==5)
		{System.out.print("Loser");}
	if (choice==1 && rand==4)
		{System.out.print("Winner");}
	if (choice==3 && rand==5)
		{System.out.print("Loser");}
	if (choice==4 && rand==3)
		{System.out.print("Loser");}
	if (choice==2 && rand==4)
		{System.out.print("Loser");}
	if (choice==2 && rand==5)
		{System.out.print("Winner");}
	if (choice==3 && rand==4)
		{System.out.print("Winner");}
	if (choice==4 && rand==1)
		{System.out.print("Loser");}
	if (choice==4 && rand==5)
		{System.out.print("Winner");}
	if (choice==4 && rand==2)
		{System.out.print("Winner");}
	if (choice==5 && rand==2)
		{System.out.print("Loser");}
	if (choice==5 && rand==4)
		{System.out.print("Loser");}
	if (choice==5 && rand==3)
		{System.out.print("Winner");}
	if (choice==5 && rand==1)
		{System.out.print("Winner");}
}
}
