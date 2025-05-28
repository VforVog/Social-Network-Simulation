import java.util.*;
public class Main {

	public static void main(String[] args) {
		String email;
		String name;
	
		
		User [] u=new User[8];
		ArrayList<User>userList=new ArrayList<User>();
		ArrayList<User>Common=new ArrayList<>();
		ArrayList<User>PossInfected=new ArrayList<>();
		ArrayList<User>Infected=new ArrayList<>();
	
		
		//Create Users 

        name="Makis";
		email="iis1998@uom.edu.gr";		
		 u[0]=new User(name,email);
       	if (ValidEmail(email)) {
			userList.add(u[0]);
			
		 }
    
       	
       	name="Petros";
		email="ics1924@uom.edu.gr"; 
		 u[1]=new User(name,email);
       	if (ValidEmail(email)) {
			userList.add(u[1]);
			
		 }
    
       	
       	name="Maria"; 
		email="iis2012@uom.edu.gr";
	    u[2]=new User(name,email); 
       	if (ValidEmail(email)) {
			userList.add(u[2]);
			
		 }
       
       	
       	
       	name="Gianna";
		email="iis19133@uom.edu.gr";
		u[3]=new User(name,email);  
       	if (ValidEmail(email)) {
			userList.add(u[3]);
			
		 }
    
       
       	name="Nikos";
		email="dai1758@uom.edu.gr";
		u[4]=new User(name,email);
       	if (ValidEmail(email)) {
			userList.add(u[4]);
			
		 }
      
       	
       
       	name="Babis";
		email="ics19104@uom.edu.gr";
	    u[5]=new User(name,email);   
       	if (ValidEmail(email)) {
			userList.add(u[5]);
			
		 }
       	
       	
       
       	name="Stella";
		email="dai1827@uom.edu.gr";
		 u[6]=new User(name,email);
	  	if (ValidEmail(email)) {
			userList.add(u[6]);
			
		 }
	  
	  	
    		
      
       	name="Eleni";
    	email="ics2086@gmail.com";
    	u[7]=new User(name,email);
      	if (ValidEmail(email)) {
      		userList.add(u[7]);
    			
    		 }
      	
      	
     
    //Create friends
      

      	 u[0].AddFriends(u[1]);
         u[0].AddFriends(u[4]);
         u[4].AddFriends(u[5]);
         u[2].AddFriends(u[3]);
         u[2].AddFriends(u[1]);
         u[3].AddFriends(u[5]);
         u[4].AddFriends(u[2]);
         u[0].AddFriends(u[5]);
         u[4].AddFriends(u[1]);
         u[6].AddFriends(u[0]);
         
        
        
    //print common   
  

    //Common=u[4].getCommonFriends(u[3]);
   
   
   
    
    
   // Common=u[0].getCommonFriends(u[4]);
  
 
    	 
    	//print friends
  
    
    //Group
    Group g1 = new Group("WebGurus","A group for web passionates");
     g1.AddMember(u[3]); 
     g1.AddMember(u[2]);
     g1.AddMember(u[1]);
     
     
     
     //closed group
     Closed_Group g2 = new Closed_Group("ExamSolutions","Solutions to common exam questions");
     g2.AddMemberToCG(u[3]);
     g2.AddMemberToCG(u[4]);
     g2.AddMemberToCG(u[5]);
     g2.AddMemberToCG(u[4]);
    
    
    
    
    
    
    System.out.println(u[3].getName() +" has been infected.The following users have to be tested");
    
  for(int i=0;i<8;i++)
  {
	 
	 PossInfected= u[3].findInfected(u[i]);
	 if(Infected.isEmpty()) 
	 {
		      for( int x=0;x<PossInfected.size();x++)
		        {
			           Infected.add(PossInfected.get(x));
                 }
		 
	    }
	      for( int j=0;j<PossInfected.size();j++)
	       { 
		       if(!Infected.contains(PossInfected.get(j)))
		            {
			            Infected.add(PossInfected.get(j));
		            }
	        }
    	
    	
  }
          for (int i=0;i<Infected.size();i++)
               {
	               
                }

  new GUI(u[3]);
  

       
}

	
// email validation για να γινει εγγραφη χρηστη 
	public static boolean ValidEmail(String email) {
		//System.out.println("" +name +email);
		String i=email.substring(0,3);
		String e=email.substring(8,email.length());
		String h=email.substring(6,email.length());
		String j=email.substring(7,email.length());
		
		if (i.contentEquals("dai") ||i.contentEquals("iis")||i.contentEquals("ics"))
		{
			if (e.contentEquals("@uom.edu.gr") ||h.contentEquals("@uom.edu.gr") ||j.contentEquals("@uom.edu.gr") ) 
			{
			return true;
			}
			else {
				
				return false;
			}
		}
		else {;
		return false;
		}
	}
	
}
