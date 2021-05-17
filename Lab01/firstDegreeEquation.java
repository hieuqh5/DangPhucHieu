import java.util.Scanner;
public class firstDegreeEquation {
	public static void main(String[] args) {
	System.out.print("Nhap vao so a : ");
	double a,b;
	Scanner sc = new Scanner(System.in);
	do {
	a = sc.nextDouble();
	if(a==0) {
		System.out.println("Xin moi nhap lai : ");
	   }
	}while(a==0);
	System.out.print("Nhap vao so b : ");
	b= sc.nextDouble();
	System.out.println("Ket qua cua phuong trinh bac nhat la : " + -b/a);
	}
}
