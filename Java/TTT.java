import java.util.*;
public class TTT {
public static void main(String [] args){
	Scanner scan=new Scanner(System.in);
System.out.println("This is is tic tac to there are two players pick a number 1-9 please");
int Player1;

int Player2;
char p1,p2,p3,p4,p5,p6,p7,p8,p9;
p1='1';
p2='2';
p3='3';
p4='4';
p5='5';
p6='6';
p7='7';
p8='8';
p9='9';
System.out.print(p1+"|"+p2+"|"+p3+"\n______\n"+p4+"|"+p5+"|"+p6+"\n______\n"+p7+"|"+p8+"|"+p9);

while (true){

System.out.println("\nPlease input your choice Player 1");
Player1=scan.nextInt();

	
 if (Player1==1){p1='x';}
 if (Player1==2){p2='x';}
 if (Player1==3){p3='x';}
 if (Player1==4){p4='x';}
 if (Player1==5){p5='x';}
 if (Player1==6){p6='x';}
 if (Player1==7){p7='x';}
 if (Player1==8){p8='x';}
 if (Player1==9){p9='x';}

 
System.out.println("\nPlease input your choice Player 2");
 Player2=scan.nextInt();
 if (Player2==1){p1='o';}
 if (Player2==2){p2='o';}
 if (Player2==3){p3='o';}
 if (Player2==4){p4='o';}
 if (Player2==5){p5='o';}
 if (Player2==6){p6='o';}
 if (Player2==7){p7='o';}
 if (Player2==8){p8='o';}
 if (Player2==9){p9='o';}

 

 System.out.println(p1+"|"+p2+"|"+p3);
 System.out.println(p4+"|"+p5+"|"+p6);
 System.out.println(p7+"|"+p8+"|"+p9);
  

 
 	if (p1==p2 && p1==p3){
 	if (p1=='x'){
	 System.out.println("Player 1 wins");
	 System.exit(0);
 	}
 	else{
 		System.out.println("Player 2 wins");
 		System.exit(0);
 	}
 	}
 if (p1==p5 && p1==p9){
	 if (p1=='x'){
		 System.out.println("Player 1 wins");
		 System.exit(0);
	 }
	else{
		System.out.println("Player 2 wins");
		System.exit(0);
	}
 	}
	if (p3==p6 && p3==p9){
	if (p3=='x'){
		 System.out.println("Player 1 wins");
		 System.exit(0);
		 }
	else{
		System.out.println("Player 2 wins");
		System.exit(0);
		}	 
	    }	 
	 if (p3==p5 && p3==p7){
	 if (p3=='x'){
		System.out.println("Player 1 wins");
		 System.exit(0);
		 }
	else{
		System.out.println("Player 2 wins");
		System.exit(0);
		}	 
	    }	 
	 if (p4==p5 && p4==p6){
		 if (p4=='x'){
		System.out.println("Player 1 wins");
		System.exit(0);
		 }
	 else{
		System.out.println("Player 2 wins");
		System.exit(0);
		}	 
	    }	 
	 if (p7==p8 && p7==p9){
	 if (p7=='x'){
		 System.out.println("Player 1 wins");
		 System.exit(0);
		 }
	else
		{System.out.println("Player 2 wins");
		System.exit(0);
		}	 
	    }	 
	if (p2==p5 && p2==p8){
	if (p2=='x'){
		System.out.println("Player 1 wins");
		System.exit(0);
		 }
	else{
		System.out.println("Player 2 wins");
		System.exit(0);
		}	 
	    }
//If a Tie

	if (p1!='1' && p2!='2' && p3!='3' && p4!='4' && p5!='5'&& p6!='6' && p7!='7'&& p8!='8'&& p9!='9')
	{
		System.out.println("Tie GAME");
		System.exit(0);
	}
	

}	 
}
}

