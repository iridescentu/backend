import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Lottery02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random(System.nanoTime());
		List<Integer> result = new ArrayList<Integer>();
		int num;
		
		for (int i = 0; i < 6; i++) {
			while (true) {
				num = random.nextInt(45) + 1;
				if (result.contains(num)) {
					continue;
				} else {
					result.add(num);
					System.out.print(num + " ");
					break;
				}
			}
		}
		System.out.println("");
	}

}
