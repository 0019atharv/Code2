import java.util.Scanner;
class Q13{
	public static void main(String[] args){
		Scanner sc = new  Scanner(System.in );
		System.out.println("Enter the age : ");
		int age = sc.nextInt();
		System.out.println("Enter the sex M/F : ");
		String sex = sc.next();
		System.out.println("Enter the Maritial Status Y/N : ");
		String maritial = sc.next();
		if ((sex).compareTo("F")==0 ){
			System.out.println("She Will Work In Urban Areas");}
		else{
			if (age>=20 && age<=40){
				System.out.println("Employee Can Work Anywhere");}
			else if (age>=40 && age<=60){
				System.out.println("Employee Can Work Only In Urban Areas ");}
			else{
				System.out.println("Please Input valid Age");}
		}		
		
}
}