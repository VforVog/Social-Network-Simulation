import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;


public class GUI extends JFrame{

	private JPanel panel;
	private JButton button;
	private JTextField textField;
	private JLabel label;
	User user2 = new User("", "" );
	
	public GUI(User user) {
		
		user2 = user;
		
		panel = new JPanel();
		button = new JButton("Find");
		
		ButtonListener listener = new ButtonListener();
		button.addActionListener(listener);
		
		textField = new JTextField("Please enter a 	User's name", 20);
		label = new JLabel();
		
		panel.add(label);
		panel.add(textField);
		panel.add(button);
		
		this.setContentPane(panel);
		
		setVisible(true);
		setSize(400,150);
		setTitle("Find User");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
}
	
class ButtonListener implements ActionListener {
		
		 public void actionPerformed(ActionEvent e) {
			 
			boolean UserFound = false;
		
			 for(int i=0; i<user2.friendList.size(); i++) {
				 if(user2.friendList.get(i).getName().equals(textField.getText())) {
					 new UserPage(user2, user2.friendList.get(i));
					 UserFound = true;
					 dispose();
				 }
			 }
			 if(!UserFound)
				 JOptionPane.showMessageDialog(null, "User "+ textField.getText() + " not found");
				 }
		 
	}

class UserPage extends JFrame{
	
	private JPanel panel1,panel2,panel3,panel4,panel5;
	private ArrayList<User> listSuggestedFriends = new ArrayList<>();
	private JLabel labelSuggestedFriends;
	private User friend2;
	private JTextField textFieldEmail,textFieldPost;
	private JTextArea textAreaUserEmail,textAreaSuggestedFriends,textAreaPost;
	private JButton buttonReturntoSearch;
	
	
	public UserPage(User user, User userFriend) {
		
		user2 =user;
		friend2 = userFriend;
		Border blackline = BorderFactory.createLineBorder(Color.BLACK);	
		
		//Εμφάνιση ονόματος του αναζητούμενου υπόπτου
		
		panel = new JPanel();
		panel1 = new JPanel();
		textField = new JTextField(20);
		label = new JLabel();
		
		panel.add(panel1);
		panel1.add(label);
		panel1.add(textField);
		textField.setText(friend2.getName());
		textField.setEditable(false);
		
		
		
		
	  //Εμφάνιση email
		
		textAreaUserEmail = new JTextArea();
		
		panel1.add(textAreaUserEmail);
		textAreaUserEmail.setSize(50, 50);
		user2.getEmail();
	    textAreaUserEmail.append(user2.getEmail());
	    textAreaUserEmail.append("\n");
		
	    textAreaUserEmail.setEditable(false);
		
		panel1.setBorder(blackline);
		
	
		panel2 = new JPanel();
		button = new JButton("Post");
		ButtonListenerPost listener = new ButtonListenerPost();
		button.addActionListener(listener);
		
		
		textAreaPost = new JTextArea(5,20);
		
		panel.add(panel2);
		panel2.add(textAreaPost);
		textAreaPost.setEnabled(false);
		textAreaPost.setDisabledTextColor(Color.black);
		panel2.add(button);
		
		panel2.setBorder(blackline);
	
		//Εμφάνιση λίστας με τα ονόματα προτινομενων φιλων
		
		panel3 = new JPanel();
		labelSuggestedFriends = new JLabel();
		textAreaSuggestedFriends = new JTextArea(5,20);

		panel.add(panel3);
		panel3.add(labelSuggestedFriends);
		labelSuggestedFriends.setText("Suggested Friends ------->");
		panel3.add(textAreaSuggestedFriends);
		textAreaSuggestedFriends.setEnabled(false);
		textAreaSuggestedFriends.setDisabledTextColor(Color.black);
		
		listSuggestedFriends = user2.getSuggestedFriends();
		
		for(int i=0; i<listSuggestedFriends.size(); i++) {
			textAreaSuggestedFriends.append(listSuggestedFriends.get(i).getName());
			textAreaSuggestedFriends.append("\n");
		}
		
		panel3.setBorder(blackline);
	
		//Πλήκτρο "Return to Search Screen"
		
		buttonReturntoSearch = new JButton("Return to Search Screen");
		ButtonReturntoSearchScreen listenerReturn = new ButtonReturntoSearchScreen();
		buttonReturntoSearch.addActionListener(listenerReturn);
		panel.add(buttonReturntoSearch);
		
		
		
		this.setContentPane(panel);
		
		setVisible(true);
		setSize(600,650);
		setTitle("Suspect Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	class ButtonReturntoSearchScreen implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			dispose();
			new GUI(user2);
		}
		
	   }
	
	class ButtonListenerPost implements ActionListener {
		
		 public void actionPerformed(ActionEvent e) {
			 
			ArrayList<Post> ListofPosts = new ArrayList<Post>();
			String textPost = textFieldPost.getText();
			
			for(int i=0; i<friend2.ListofPosts.size(); i++) {
				
				 for(int j=0; j<ListofPosts.size(); j++) {
					 textAreaPost.append(ListofPosts.get(j).getText());
					 textAreaPost.append("\n");
				 }
			}
			button.setEnabled(false);
	   }
		 
	}

	

}
}


