import java.util.Comparator;
import java.util.stream.IntStream;

public class int_reverse {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		  int[] arr1 = new int[] {3,1,9,7,4,2};  // ���� ���� 

	        int[] arr2 = IntStream.of(arr1).boxed().sorted(Comparator.reverseOrder()).mapToInt(i -> i).toArray(); //��������
	        System.out.println("�������� ������ :");
	        
	        for(int nr : arr2)
	        {
	            System.out.print(nr+" ");
	        }
	        
	        System.out.println();
	        System.out.println("-------------------");
	   
	        int[] arr3 = IntStream.range(0, arr2.length).map(i -> arr2[arr2.length-i-1]).toArray(); //��������
	        System.out.println("�������� ������ :");

	        for(int or : arr3)
	        {
	            System.out.print(or+" ");
	        }
	  }
}