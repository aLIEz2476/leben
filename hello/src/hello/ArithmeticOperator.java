package hello;
import java.util.Scanner;
public class ArithmeticOperator {
	public static void main(String[] args){
		System.out.println("\n 201202032, ����ȯ\n");
		int time, second, minute, hour;
		Scanner sc=new Scanner(System.in);
		System.out.print("�ʸ� �Է��ϼ��� : ");
		time=sc.nextInt();
		second=time%60;
		minute=(time/60)%60;
		hour=(time/60)/60;
		System.out.print(time+"�ʴ� ");
		System.out.print(hour+"�ð� ");
		System.out.print(minute + "�� ");
		System.out.println(second + "���Դϴ�.\n");
		
	}

}
