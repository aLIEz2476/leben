package hello;

public class NestedLoop {
	public static void main(String[] args){
		System.out.println("201202032, ±Ë¡§»Ø\n");
		int i,j;
		
		for(i=1;i<10;i++,System.out.println()){
			for(j=1;j<10;j++,System.out.println()){
				System.out.print(i+" * "+j+" = "+i*j);
			}
		}
	}

}
