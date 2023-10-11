import java.util.Scanner;
public class practice14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

        int money, coke, water, vitaminWater, menu, change;

        System.out.println("Enter your money: ");
        money = s.nextInt();

        coke = 800;
        water = 500;
        vitaminWater = 1500;

        System.out.println("Select the menu.");
        System.out.println("1. Coke(800 won) 2. Water(500 won) 3. Vitamin Water(1500 won)");
        menu = s.nextInt();

        int cheon = 0;
        int obeak = 0;
        int beak = 0;

        switch(menu) {
                case 1:
                       	change = money - coke;
                        cheon = change / 1000;
                        obeak = change % 1000 / 500;
                        beak = change % 1000 %  500 / 100;

                        System.out.println("Your change: " + change + " won.");
                        System.out.println("Your change of 1000 won: " + cheon);
                        System.out.println("Your change of 500 won: " + obeak);
                        System.out.println("Your change of 100 won: " + beak);
                        break;
                        
                case 2:
                   	change = money - water;
                    cheon = change / 1000;
                    obeak = change % 1000 / 500;
                    beak = change % 1000 %  500 / 100;

                    System.out.println("Your change: " + change + " won.");
                    System.out.println("Your change of 1000 won: " + cheon);
                    System.out.println("Your change of 500 won: " + obeak);
                    System.out.println("Your change of 100 won: " + beak);
                    break;

            case 3:
                   	change = money - vitaminWater;
                    cheon = change / 1000;
                    obeak = change % 1000 / 500;
                    beak = change % 1000 %  500 / 100;

                    System.out.println("Your change: " + change + " won.");
                    System.out.println("Your change of 1000 won: " + cheon);
                    System.out.println("Your change of 500 won: " + obeak);
                    System.out.println("Your change of 100 won: " + beak);
                    break;
                    
            default:
                System.out.println("Enter the number of the menu.");
                break;
        	}

        	s.close();

	}

}
