package hello;
import java.util.Scanner;
public class ScannerExam {
	public static void main(String[] args){
		System.out.println("201202032, 김정환");
		Scanner a=new Scanner(System.in);
		System.out.println("나이, 체중, 신장을 빈칸으로 분리하여 순서대로 입력하세요.");
		System.out.println("당신의 나이는 "+a.nextInt()+"살입니다.");
		System.out.println("당신의 체중는 "+a.nextDouble()+"Kg입니다.");
		System.out.println("당신의 신장는 "+a.nextDouble()+"Cm입니다.");
		
	}

}
