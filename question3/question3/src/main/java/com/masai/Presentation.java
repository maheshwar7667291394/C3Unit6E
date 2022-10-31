package com.masai;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Presentation {
	
	
	
	@Autowired
	private ProductService pService; // dependency
	
	public void insertProduct(){
	//take the input from the user (Product Details without productId, productId
	//should be generated automatically)and call the appropriate method on
		
		
	//pService object.
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter product name");
		String name=input.next();
		
		System.out.println("Entr quantity");
		int qn=input.nextInt();
		
		System.out.println("Enter price");
		int pr=input.nextInt();
		
		Product product=new Product();
		product.setProductName(name);
		product.setQuantity(qn);
		product.setPrice(pr);
				
		boolean t= pService.addProduct(product);	
		System.out.println(t);
		
		
	}
	
	
	public void printAllProduct(){
		//call the getAllProducts method on the pService object and print all
		 //product details.
		}
		public void searchProduct(){
		// take the empId from the user and call the getProductById method
		 //pService obj. And print the appropriate details.
		}
		public void GetProductsWithingPriceRange(){
		// take the price range (fromPrice and toPrice) from the user and call
		//the appropriate method on //pService object and print the Product
		//within the price range,
		}


}
