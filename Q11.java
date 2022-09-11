import java.util.Scanner;
class Q11{
	public static void main(String[] args){
		Scanner sc = new  Scanner(System.in );
		System.out.println("Enter the Character: ");
		char character = sc.next().charAt(0);
		if (character>='a' && character<='z'){
			System.out.println("Character is in lower case ");}
		else if (character>='A' && character<='Z'){
			System.out.println("Character is in Upper case ");}

}
}