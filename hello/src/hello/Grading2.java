package hello;
import java.util.Scanner;

public class Grading2 {
	public static void main(String[] args){
		System.out.println("201202032, ����ȯ\n");
		
		char grade;
		Scanner a=new Scanner(System.in);
		while(a.hasNext()){
			int score=a.nextInt();
			switch(score/10){
			case 10:
			case 9:
				grade='A';
				break;
			case 8:
				grade ='B';
				break;
			case 7:
				grade='C';
				break;
			case 6:
				grade='D';
				break;
			default:
				grade = 'F';
			}
			System.out.println("������ "+grade+"�Դϴ�.");
		}
		
	}

}
