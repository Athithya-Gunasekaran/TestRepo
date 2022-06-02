import java.util.Date;


public class Time {
	

	public static void main(String[] args) {
		
Date today = new Date();
int hour = today.getHours();

if(hour>=4 && hour<=12)
{
	System.out.println("Good Morning");
}
else if(hour>=12 && hour<=17){
	System.out.println("Good Afternoon");
}
else{
	System.out.println("Good Night");
	
}
//today.getMinutes()
	}

}
