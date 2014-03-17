import java.util.*;

public class Airplane{

	private String wSeats[];
	private String aSeats[];
	private final int TOTAL_WIN_SEATS=6;
	private final int TOTAL_AISLE_SEATS=6;
	
	public Airplane() {
	 wSeats=new String[TOTAL_WIN_SEATS];
	 aSeats=new String[TOTAL_AISLE_SEATS];
	 for(int i=0;i<wSeats.length;i++) {
		wSeats[i]=new String("NA");  
	 }
	 for(int i=0;i<wSeats.length;i++) {
		aSeats[i]=new String("NA");  
	 }
	}
	
	public String makingReservation(String type){
	 Random rand=new Random();
	 String resr="";
	 if(type.equals("W")){
	 	for(int i=0;i<wSeats.length;i++) {
		   if(wSeats[i].equals("NA")){
		   		if(i/3==0){
		   		resr="A"+i+(rand.nextInt(899)+100);
		   		wSeats[i]=resr;
		   		}
		   		else{
		   		resr="D"+(i-3)+(rand.nextInt(899)+100);
				wSeats[i]=resr;
				}
				break;
		   }
	    }
	 }
	if(type.equals("A")){
	 	for(int i=0;i<wSeats.length;i++) {
		   if(wSeats[i].equals("NA")){
		   		if(i/3==0){
		   		resr="A"+i+(rand.nextInt(899)+100);
		   		aSeats[i]=resr;
		   		}
		   		else{
		   		resr="D"+(i-3)+(rand.nextInt(899)+100);
		   		aSeats[i]=resr;
		   		}
		   		break;
		   }
	    }
	   
	 }	
		return resr;
	 
	}
	
	public boolean cancelReservation(String val){
	 for(int i=0;i<wSeats.length;i++) {
	   if(wSeats[i].equals(val)){
		   	wSeats[i]="NA";
		   	return true;
		     		   
	   }
	 }
	 for(int i=0;i<aSeats.length;i++) {
		  if(aSeats[i].equals(val)){
		   	aSeats[i]="NA";
		   	return true;
		     		   
		  }
	}
	 
	 return false;
		
}

	public void DisplayOpenSeats(){
	
		int aisleTotal=0, winTotal=0;
		for(int i=0;i<wSeats.length;i++){
			if(wSeats[i].equals("NA") )
				winTotal++;
		}
		for(int i=0;i<aSeats.length;i++){
			if(aSeats[i].equals("NA") )
				aisleTotal++;
		}
		System.out.println("Open Window Seats " +winTotal+"; Open Aisle Seats " +aisleTotal);
	}

public boolean search(String val){
	for(int i=0;i<wSeats.length;i++) {
	   if(wSeats[i].equals(val)){
		   
		   	return true;
		     		   
	   }
	 }
	for(int i=0;i<aSeats.length;i++) {
	  if(aSeats[i].equals(val)){
		  
		   	return true;
		     		   
		  }
	}
		return false;
	}
	
public static void main (String args[]){
	Scanner scan= new Scanner(System.in);
	Airplane a=new Airplane();
	while(true) {
	System.out.println("A dd R emove S earch D isplay E xit");
	String line=scan.nextLine();
	if(line.equals("A")) {
		System.out.println("W indow A isle");
		line=scan.nextLine();
		if(line.equals("W") || line.equals("A")) {
			System.out.println(a.makingReservation(line));
		}
		else{
			System.out.println("ERROR:only put W or A");
			continue;
		}
	}
	
	if(line.equals("R")){
		System.out.println("Enter confirmation");
		line=scan.nextLine();
		if(a.cancelReservation(line)){
			System.out.println("OK");
		}else{
			System.out.println("ERROR:Wrong confirmation");
		}
		
	}
	
	if(line.equals("D")){
		a.DisplayOpenSeats();
	}
	
	if(line.equals("S")){
		System.out.println("Enter confirmation");
		line=scan.nextLine();
		if(a.search(line)){
			System.out.println("FOUND");
		}else{
			System.out.println("NOT FOUND");
		}
		
	}
	
	if(line.equals("E")){
		break;
		
	}
	
  }


}


}