import java.util.ArrayList;
import java.util.Date;

public class Post  {
	int day1,month1,year1,hour1,min1,sec1;
	String text;
	  ArrayList<Post> ListofPosts = new ArrayList<Post>();
	  
	public  Post(int day, int month, int year,int hour,int min,int sec ,String Text)
	{
		 day1=day;
		 month1=month;
		 year1=year;
		 hour1=hour;
		 min1=min;
		 sec1=sec;
		 text=Text;
		 
		
	}

	public int getDay1() {
		return day1;
	}

	public void setDay1(int day1) {
		this.day1 = day1;
	}

	public int getMonth1() {
		return month1;
	}

	public void setMonth1(int month1) {
		this.month1 = month1;
	}

	public int getYear1() {
		return year1;
	}

	public void setYear1(int year1) {
		this.year1 = year1;
	}

	public int getHour1() {
		return hour1;
	}

	public void setHour1(int hour1) {
		this.hour1 = hour1;
	}

	public int getMin1() {
		return min1;
	}

	public void setMin1(int min1) {
		this.min1 = min1;
	}

	public int getSec1() {
		return sec1;
	}

	public void setSec1(int sec1) {
		this.sec1 = sec1;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public ArrayList<Post> getListofPosts() {
		return ListofPosts;
	}

	public void setListofPosts(ArrayList<Post> listofPosts) {
		ListofPosts = listofPosts;
	}
	
	


}
