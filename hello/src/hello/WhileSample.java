package hello;
import java.util.Scanner;

public class WhileSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("201202032, ����ȯ\n");
		
		Scanner rd=new Scanner(System.in);
		int n=0;
		double sum=0;
		int i=0;
		
		while((i=rd.nextInt())!=0){
			sum=sum+i;
			n++;
		}
		System.out.println("�Էµ� ���� ������ "+n+"���̸� ����� "+sum/n+"�Դϴ�.");
		
		

	}

}
