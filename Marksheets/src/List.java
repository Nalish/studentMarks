import java.util.Scanner;

	


public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner input=new Scanner(System.in);
		
		String name;
		int j,i;
		int[] Kathir= new int[5];
		int[] Lakshmi=new int[5];
		int[]Aishwarya=new int[5];
		int total1,total2,total3;
		int avg1,avg2,avg3;
		total1=Kathir[0]+Kathir[1]+Kathir[2]+Kathir[3]+Kathir[4];
		total2=	Lakshmi[0]+Lakshmi[1]+Lakshmi[2]+Lakshmi[3]+Lakshmi[4];	
		total3=Aishwarya[0]+ Aishwarya[1]+Aishwarya[2]+Aishwarya[3]+Aishwarya[4];
		
		
		
			System.out.println("Name:");
			name=input.next();
			System.out.println("Enter marks :");
			for(j=0;j<5;j++) {
			
				Kathir[j]=input.nextInt();
		}
			System.out.println("Name:");
			name=input.next();
			System.out.println("Enter marks :");
			for(i=0;i<5;i++) {
			Lakshmi[i]=input.nextInt();
			
			
			}
			System.out.println("Name:");
			name=input.next();
			System.out.println("Enter marks :");
			

			for(i=0;i<5;i++) {
			Aishwarya[i]=input.nextInt();
			}
			total1=Kathir[0]+Kathir[1]+Kathir[2]+Kathir[3]+Kathir[4];
			total2=	Lakshmi[0]+Lakshmi[1]+Lakshmi[2]+Lakshmi[3]+Lakshmi[4];	
			total3=Aishwarya[0]+ Aishwarya[1]+Aishwarya[2]+Aishwarya[3]+Aishwarya[4];
			
			avg1=total1/5;
			avg2=total2/5;
			avg3=total3/5;
		System.out.println("Welcome to student Mark List Application");
		System.out.println("");
		System.out.println("____________________________________________________________");
		System.out.println("SNo Student Name\tSub1\tSub3\tSub4\t Total\t\tavg");
		System.out.println("_____________________________________________________________");
		
		System.out.println("");
		System.out.print("1 kathir");
		System.out.print("\t\t"+Kathir[0]);
		System.out.print("\t"+Kathir[1]);
		System.out.print("\t"+Kathir[2]);
		System.out.print("\t"+Kathir[3]);
		System.out.print("\t"+Kathir[4]);
		System.out.print("\t"+total1);
		System.out.println("\t"+avg1);
		
		System.out.print("2 Lakshmi ");
		System.out.print("\t\t"+Lakshmi[0]);
		System.out.print("\t"+Lakshmi[1]);
		System.out.print("\t"+Lakshmi[2]);
		System.out.print("\t"+Lakshmi[3]);
		System.out.print("\t"+Lakshmi[4]);
		System.out.print("\t"+total2);
		System.out.println("\t"+avg2);
		System.out.print("3 Aishwarya ");
		System.out.print("\t\t"+Aishwarya[0]);
		System.out.print("\t"+Aishwarya[1]);
		System.out.print("\t"+Aishwarya[2]);
		System.out.print("\t"+Aishwarya[3]);
		System.out.print("\t"+Aishwarya[4]);
		System.out.print("\t"+total3);
		System.out.println("\t"+avg3);
		
		
		
		
		

		
	
	}
	
	
}


