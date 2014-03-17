
public class Event {
	private int day;
	private double time; 
	private int dur;
		

public void Schedule(int _day){
	day=_day;
	System.out.println("Your apointment is at " + day);
}
public void Schedule(int _day, double _time){
	day=_day;
	time=_time;
	System.out.println("Your apointment is at "+ day+" " +" "+ time);
}
public void Schedule(int _day, double _time, int _dur){
	day=_day;
	time=_time;
	dur=_dur;
	System.out.println("Your apointment is at "+ day+" " +""+ time+" "+dur);
}
public int getDay(){
	return day;
}
public double getTime(){
	return time;
}
public int getDur(){
	return dur;
}


public static void main(String [] args){
Event e =new Event();
e.Schedule(19);
Event e1=new Event();
e1.Schedule(25 , 12.30);
Event e2=new Event();
e2.Schedule(15, 10.30 , 60);
	
	
}
}