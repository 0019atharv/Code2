import java.util.Scanner;
class Q3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the quantity: ");
		int q = sc.nextInt();
		int cost = q*100;
		int discount = cost*10/100;
		int afterdiscount = cost-discount;
		if (cost>1000){
			System.out.println("Cost of the product:  "+ afterdiscount );}
		}
}