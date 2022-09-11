import java.util.Scanner;
class Q1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length : ");
		int l = sc.nextInt();
		System.out.println("Enter the breadth : ");
		int b = sc.nextInt();
		if (l==0 | b==0){
			System.out.println("Not Square Square ");}
		else if (l==b){
			System.out.println("It is an Square ");}
		else{
			System.out.println("Not Square"); }
}
}