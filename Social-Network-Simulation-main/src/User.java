import java.util.*;

public class User  {
	
	private String Name;
	private String Email;
	
	
   ArrayList<User>friendList=new ArrayList<User>();
   ArrayList<User>SuggestedFriends=new ArrayList<User>();
    ArrayList<Post> ListofPosts = new ArrayList<Post>();
	private ArrayList<User> CommonFriends = new ArrayList<User>();
	private ArrayList<User> stInfected=new ArrayList<User>();
	private ArrayList<User> Infected=new ArrayList<User>();
	
	

	

	
	public User(String name,String email)
	{
		Name=name;
		Email=email;
		
	

			
	}
	
	
	
	
	public String getName() {
		return Name;
	}




	public void setName(String name) {
		Name = name;
	}




	public String getEmail() {
		return Email;
	}




	public void setEmail(String email) {
		Email = email;
	}




	public boolean  Arefriends( User user)
	{
		
    if (this.friendList.contains(user)) return true;
    else return false;
		
		
      }
        
	
	public void AddFriends(User user)
	{
		
		
		if (this.Arefriends(user)) System.out.println("User already exists");
		else {
			if (getName()!=user.getName()) {
			friendList.add(user);
			user.friendList.add(this);
			}
		}
		
		
	}
	
	
	
	

	
	
     public ArrayList<User> getCommonFriends(User user){
		
		
				
		for (int i=0;i<friendList.size();i++)
		{
			
			for(int j=0;j<user.friendList.size();j++)
			{
			
			if ((friendList.get(i)==user.friendList.get(j)) && (!(CommonFriends.contains(user.friendList.get(j))) ))
			{
				CommonFriends.add(friendList.get(i));
				
			}
			
			}
		}
	 
		return CommonFriends;
	}
		
      public void printFriends(User user)
      {
    	 
    	  
    	 for (int i=0;i<user.friendList.size();i++)
    	 {
    		 System.out.println(i+1 +": " +friendList.get(i).getName());
    	 }
    
    	  
      }
      
      
    
      
      public void UserGroups(Group g1,Closed_Group g2)
      {
    	  int x=0;
    	
    	 
      }

    	 
    	 
public   ArrayList<User> findInfected(User u)

{
	//1h επαναληψη
	 if (stInfected.isEmpty())
	  {for (int i=0;i<this.friendList.size();i++)
	  {
		 stInfected.add(friendList.get(i));
		
	  }
	 
	  }
	 
	 
	 int size=stInfected.size();
	  for (int i=0;i<size;i++)
	  {
		    
	       if(stInfected.get(i).getName().contentEquals(u.getName())  )
	       { // System.out.println("name : " +u.getName());
	      
	    	   for(int j=0;j<u.friendList.size();j++)
		          {	
	    		 
	             if ((Infected.contains(u.friendList.get(j))) ) 
				 {
				
				 //System.out.println(friendList.size());
				 
				 
				 }
			 else
		       {
				 //na mhn einai to onoma tou xrhsth px gia to paradeigma mas Gianna
				 if (u.friendList.get(j).getName()!=this.getName())
				 {
					 Infected.add(u.friendList.get(j));
				  }
		       }
		  }
	    	 
		  }
		  
	  }
	  for (int i=0;i<stInfected.size();i++)
	   {
		  Infected.add(stInfected.get(i));
		  
	   }
	  
	  return Infected;
	  
}




public ArrayList<User> getSuggestedFriends(){
	
	for(int i=0; i<friendList.size(); i++) {
		for(int j=0; j<friendList.get(i).friendList.size(); j++) {
			if(!this.Arefriends(friendList.get(i).friendList.get(j))
					&& !this.equals(friendList.get(i).friendList.get(j)) ) {
				if(!SuggestedFriends.contains(this.friendList.get(i).friendList.get(j)))
				SuggestedFriends.add(friendList.get(i).friendList.get(j));
			}
		}
	}
	return SuggestedFriends;
}
    	
    	 
    	 
}
		
	

	
	

   

