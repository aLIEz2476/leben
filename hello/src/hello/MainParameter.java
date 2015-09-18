package hello;

public class MainParameter {

	public static void main(String[] args) {
		double sum=0.0;
		for(int i=0;i<args.length;i++){
			sum+=Double.parseDouble(args[i]);
			System.out.print(args[i]+" ");
		}
		System.out.println("\n");
		System.out.println("ÇÕ°è : " + sum);
		System.out.println("Æò±Õ : " + sum/args.length);
		System.out.println("\n201202032 ±èÁ¤È¯");
	}
}
