package laboratories.package2;
import java.util.Scanner; //library to get input from user

public class ArithmeticMean {

	public static void main(String[] args){
		int sum=0; //initial value sum=0
		int elemNo=0; //initial value elemNo=0
		int currElem; 
		double result;
		Scanner sc= new Scanner(System.in); //waiting for user input
		while(sc.hasNextInt()) // looping while input is Integer, if input is not numeric/int, then out from looping
		{
			currElem=sc.nextInt(); //value from input user go to variable currElem
			sum=sum+currElem; //value got from 
			elemNo=elemNo+1;
		}
		if(elemNo==0){
			System.err.print("No data Available\n");
			System.exit(1);
		}
		sc.close();
		result=(double) sum/elemNo;
		System.out.print("the sum of "+elemNo);
		System.out.print(" is "+result+"\n");
		System.exit(0);
		
	}
}
