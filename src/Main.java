import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int a ,b, c, d, e;
	int x;
	Scanner in=new Scanner(System.in);
	System.out.print("請輸入x:");
	x=in.nextInt();
	a=x/10000;
	b=x/1000%10;
	c=x/100%10;
	d=x/10%10;
	e=x%10;
	System.out.printf("%d %d %d %d %d", a,b,c,d,e);
	in.close();

    }
}
