import java.util.*;
public class Group {


	
	private String name,c;
    ArrayList <User> GroupMembers=new ArrayList<>();
    
	public Group(String Name,String C){
		
		name=Name;
		c=C;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean IsMember(User user)
	{
			
		if (GroupMembers.contains(user)) return true;
		else return false;
		
				
		
	}
	
	public void AddMember(User user)
	{
		if (!IsMember(user))
			{
			GroupMembers.add(user);
		
			}
	
	}
	
	public void printMembers()
	{
		
		for (int i=0;i<GroupMembers.size();i++)
		{
			
		}
		
	}
	
	
}
