import java.util.*;
public class Closed_Group  {
	private String name,c;
	private ArrayList<User> MemberCG=new ArrayList<>();
	
	public Closed_Group(String Name,String C)
	{
		
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
			
		if (MemberCG.contains(user)) return true;
		else return false;
		
				
		
	}

	public void AddMemberToCG(User user)
	{
		 int temp=0;
		if (MemberCG.isEmpty()) {
			MemberCG.add(user);
			
		}
		else 
		{
			for (int i=0;i<MemberCG.size();i++)
			{
				if (user.Arefriends(MemberCG.get(i))) {
					MemberCG.add(user);
					temp=1;
					
				}
				
			}
		
			
			
			
		}
		
		
	}
	public void printMembers()
	{
		System.out.println("Members of group " +name);
		for (int i=0;i<MemberCG.size();i++)
		{
			
		}
		
	}
	
	

}
