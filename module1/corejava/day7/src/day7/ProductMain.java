package day7;

import java.time.LocalDate;

public class ProductMain {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		p1.setProductId(10);
		p1.setProductName("Iphonex");
		p1.setProductPrice(90000);
//		LocalDate mfd = LocalDate.of(2022, 10, 30);
//		p1.setMfd(mfd);
		p1.setMfd(LocalDate.of(2022, 10, 30));
		
		System.out.println("Product Details:");
		System.out.println("Id: "+p1.getProductId());
		System.out.println("Name: "+p1.getProductName());
		System.out.println("Price: "+p1.getProductPrice());
		System.out.println("MFD: "+p1.getMfd());
	}

}
