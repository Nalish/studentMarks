import java.util.Scanner;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to student Mark List Application");
		String name;
		int i,marks;
		for(i=0;i<3;i++) {
			System.out.println("Name:");
			name=input.nextLine();
			for(int j=0;j<5;j++);{
				System.out.println("Enter marks:");
				marks=input.nextInt();
				System.out.println(" marks:"+j);
				
				
			}

		}
	}

}
