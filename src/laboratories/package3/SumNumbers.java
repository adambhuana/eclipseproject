package laboratories.package3;
import java.util.Scanner;

public class SumNumbers {
	public static void main(String[] args){
		int inputan=0;
		int ambil;
		int elemNo=0;
		Scanner sc= new Scanner(System.in);
		while(sc.hasNextInt()) 
		{
			ambil=sc.nextInt(); 
			if(ambil>10)
			{
				inputan=inputan+ambil;
			}
			else
			{
				System.out.print("Put Number Greater Than 10:\n");
				continue;
			}
			elemNo=elemNo+1;
		}
		if(elemNo==0){
			System.err.print("No data Available\n");
			System.exit(1);
		}
		sc.close();
		System.out.print("The sum value is "+inputan+"\n");
		System.exit(0);
	}

}
