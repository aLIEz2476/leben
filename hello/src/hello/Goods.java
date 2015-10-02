package hello;

public class Goods {
	String name;
	int price;
	int numberOfStock;
	int sold;

	public static void main(String[] args) {
		System.out.println("\n201202032 김정환\n");
		Goods camera=new Goods();
		camera.name="Nikon";
		camera.price=40000;
		camera.numberOfStock=30;
		camera.sold=50;
		System.out.println("상품 이름 : "+camera.name);
		System.out.println("상품 가격: "+camera.price);
		System.out.println("재고 수량 : "+camera.numberOfStock);
		System.out.println("팔린 수량 : "+camera.sold);
	}
}
