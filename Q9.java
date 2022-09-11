import java.util.Scanner;
class Q9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number Of Classes Held : ");
		int held = sc.nextInt();
		System.out.println("Enter the Number Of Classes Attended : ");
		int attend = sc.nextInt();
		float attendance =(attend*100)/held ;
		if (attendance>=75){
			System.out.println("Student Is Allowed To Sit In Exam");}
		else{
			System.out.println("Do You Have Medical Y/N");
			String medical = sc.next();
			if ((medical).compareTo("Y")==0){
				System.out.println("Student Is Allowed To Sit In Exam");}
			else{
				System.out.println("Student Is Not Allowed To Sit In Exam");}}
}
}