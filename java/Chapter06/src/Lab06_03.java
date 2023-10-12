
public class Lab06_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
        int dice1, dice2, dice3;

        while(true) {
                count ++;

        dice1 = (int)(Math.random() * 6 + 1);
        dice2 = (int)(Math.random() * 6 + 1);
        dice3 = (int)(Math.random() * 6 + 1);

        if ((dice1 == dice2) && (dice2 == dice3))
                break;
        }
        
        System.out.printf("Three of dices are all %d.\n", dice1);
        System.out.printf("Threw the dices %d times when we got all the same numbers.\n", count);
        
	}

}
