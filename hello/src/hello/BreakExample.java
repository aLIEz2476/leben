package hello;
import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("201202032, ����ȯ\n");
		
		Scanner in = new Scanner(System.in);
		int num=0;
		
		while(true){
			if(in.nextInt()==-1)
				break;
			num++;
		}
		System.out.println("�Էµ� ���� ������ "+num);
	}

}
