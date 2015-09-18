package hello;

public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("201202032, 김정환\n");
		
		int sum=0;
		for(int i=1;i<=100;i++){
			if(i%2==1)
				continue;
			else
				sum=sum+i;
		}
		System.out.println("1부터 100까지 짝수의 합은 "+sum);

	}

}
