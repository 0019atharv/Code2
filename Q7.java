import java.util.Scanner;
class Q7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value : ");
		int num = sc.nextInt();
		if (num<0){
			num=num*-1;
			System.out.println("Absolute Value: "+num);}
		else{
			System.out.println("Absolute value: "+num);}	
}
}