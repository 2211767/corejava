package JavaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;






class User {
	private int id;
	private String username;
	private String email;

	public User(int id, String username, String email) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email + "]";
	}
}

public class UserCollection {
	public static void main(String[] args) {
		ArrayList<User> aluser = new ArrayList<User>();
		aluser.add(new User(4, "a", "uname4@abc.com"));
		aluser.add(new User(2, "c", "uname2@abc.com"));
		aluser.add(new User(3, "d", "uname3@abc.com"));
		aluser.add(new User(1, "b", "uname1@abc.com"));
		
		System.out.println(sortAsse(aluser));
		
		
		Collections.reverse(aluser);
		System.out.println(aluser+"reversed");
		
		//aluser.stream().forEach(user->{System.out.println(user+"888888888");});
		singleMethod(aluser);
		HashSet<User> hs = new HashSet<User>(aluser);

		for (User usr : hs) {
			System.out.println(usr + "111111111111111");
		}
		
		
	}

	private static ArrayList<User> sortAsse(ArrayList<User> aluser) {
		aluser.sort((o1, o2)
                 -> o1.getUsername().compareTo(
                     o2.getUsername()));
		return aluser;
	}

	private static void singleMethod(ArrayList<User> aluser) {
		Iterator<User> itr = aluser.iterator();
		while (itr.hasNext()) {
			User usr = itr.next();
			System.out.println(usr + "before reverse");

		}
		Collections.reverse(aluser);
		itr = aluser.iterator();
		while (itr.hasNext()) {
			User usr = itr.next();
			System.out.println(usr + "ofter reverse");
		}
		
	}
}
