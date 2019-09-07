import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int n1 = (n/100);
      int n2 = (n%10);
    System.out.println(n1 + n2);
	}
}