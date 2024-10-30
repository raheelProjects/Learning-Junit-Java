import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.BinaryOperator;

public class MathCheck {

	public MathCheck() {
	}
	
	public static int getExponentail(int base , int exponentailPower) {
		int value = 1;
		for(int i=1;i<=exponentailPower;i++) {
			value *=base;
		}
		return value;
	}
	
	public static int sumOfArray(List<Integer> numbers) {
		BinaryOperator<Integer> thisone = (first,acc)-> acc+first ;
		Optional<Integer> res= numbers.stream().reduce(thisone);
		if(res.isEmpty()) {
			return -1;
		}
		 return res.get();
	}
	
	public static ArrayList<String> tableGenerator(int input){
	
		ArrayList<String> table = new ArrayList();
		
		for (int x=1; x<11; x++) {
			table.add(tableformat(input,x));
		}
		return table;
	}
	
	public static ArrayList<String> tableGenerator() {
		ArrayList<String> table = new ArrayList();
		try {
			
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter The number for generating its table: ");
			int numb = scan.nextInt();
			
			for (int x=1; x<11; x++) {
				table.add(tableformat(numb,x));
			}
			
			
		}catch(InputMismatchException e) {
			 
		}
		
		
		return table;
		
	}
	
	private static String tableformat(int fnum, int snum) {
		return String.format("%d x %d = %d", fnum,snum,fnum*snum);
	}

}
