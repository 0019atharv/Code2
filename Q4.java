import java.util.Scanner;
class Q4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Salary : ");
		int salary = sc.nextInt();
		System.out.println("Enter Year Of Service : ");
		int yos = sc.nextInt();
		int bonus = salary*5/100;
		int addbonus = salary+bonus;
		if (yos>5){
			System.out.println("Your Salary + Bonus:  "+addbonus);}
		else{
			System.out.println("Your Salary: "+salary); }
}
}