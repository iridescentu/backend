import java.util.Scanner;
public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int select;

        System.out.println("1. Input \n2. Change \n3. Check \n4. Delete \n5. Close");
        System.out.println("Select the menu number:");
        select = s.nextInt();

        switch(select) {
                case 1:
                       	System.out.println("This is input menu.");
                        break;
                case 2:
                       	System.out.println("This is change menu.");
                        break;
                case 3:
                       	System.out.println("This is check menu.");
                        break;
                case 4:
                       	System.out.println("This is delete menu.");
                        break;
                case 5:
                       	System.out.println("This is close menu.");
                        break;
                default:
                        System.out.println("You chose wrong number.");
                }



        s.close();

	}

}
