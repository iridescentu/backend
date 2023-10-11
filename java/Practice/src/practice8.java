import java.util.Scanner;
public class practice8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your membership class(admin, member, non-member): ");
		String user = s.nextLine();
		
		switch(user) {
		case "admin":
			System.out.println("Membership management, post management, post creation, post inquiry, comment creation.");
			break;
		case "member":
			System.out.println("Post management, post creation, post inquiry, comment creation.");
			break;
		case "non-member":
			System.out.println("Post inquiry.");
			break;
		}
		
		s.close();
		
		}
	}

