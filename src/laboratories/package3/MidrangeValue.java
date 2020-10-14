package laboratories.package3;
import java.util.Scanner;

public class MidrangeValue {
	public static void main(String[] args){
		int panjangarray;
		int sizearray;
		double result;
		int elemNo=0;
		System.out.print("How many number(s) want to be evaluated: \n");
		Scanner sc= new Scanner(System.in);
		sizearray=sc.nextInt();
		int inputan[] = new int[sizearray];
		System.out.print("Put Your "+sizearray+" number(s) below \n");
		Scanner sc1= new Scanner(System.in);
		while(sc1.hasNextInt()) 
		{
			inputan[elemNo]=sc1.nextInt(); 
			elemNo=elemNo+1;
		}
		if(elemNo==0){
			System.err.print("No data Available\n");
			System.exit(1);
		}
		sc1.close();
		sc.close();
		panjangarray=inputan.length;
		result=0.5*(inputan[0]+inputan[panjangarray-1]);
		System.out.print("panjang array "+panjangarray+"\n");
		System.out.print("minimal Value "+inputan[0]+"\n");
		System.out.print("maximal value "+inputan[panjangarray-1]+"\n");
		System.out.print("the mid range is "+result);
		System.exit(0);
	}

}
