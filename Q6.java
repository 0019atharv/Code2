import java.util.Scanner;
class Q6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age of Person1 : ");
		int P1 = sc.nextInt();
		System.out.println("Enter age of Person2 : ");
		int P2 = sc.nextInt();
		System.out.println("Enter age of Person3 : ");
		int P3 = sc.nextInt();
		if (P1>P2 & P1>P3){
			System.out.println("P1 is Oldest");
			if (P2<P1 & P2<P3){
				System.out.println("P2 is Youngest ");}
			else{
				System.out.println("P3 is Youngest ");}}
		else if (P2>P1 & P2>P3){
			System.out.println("P2 is Oldest");
			if (P1<P2 & P1<P3){
				System.out.println("P1 is Youngest ");}
			else{
				System.out.println("P3 is Youngest ");}}
		else if (P3>P1 & P3>P2){
			System.out.println("P3 is Oldest");
			if (P2<P1 & P2<P3){
				System.out.println("P2 is Newest");}
			else{
				System.out.println("P1 is Newest");}}
}
}