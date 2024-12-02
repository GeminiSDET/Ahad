package eCom;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ECommerceAPITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RequestSpecification req=new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
		.setContentType(ContentType.JSON).build();
		
		pojoLoginRequest loginRequest=new pojoLoginRequest();
		loginRequest.setUserEmail("azarriju88@gmail.com");
		loginRequest.setUserPassword("Azar~!@#4");
		
		RequestSpecification reqLogin =given().log().all().spec(req).body(loginRequest);
		pojoLoginResponse loginResponse=reqLogin.when().post("api/ecom/auth/login").then().log().all().extract().as(pojoLoginResponse.class);
		
		System.out.println(loginResponse.getToken());
		String token=loginResponse.getToken();
		System.out.println(loginResponse.getUserId());
		String userId=loginResponse.getUserId();
		
		//Add Product
		RequestSpecification addProductBasereq=new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				.addHeader("Authorization", token).build();
		RequestSpecification reqAddProduct=given().log().all().spec(addProductBasereq)
		.param("productName", "Phone")
		.param("productAddedBy", userId)
		.param("productCategory", "fashion")
		.param("productSubCategory", "shirts")
		.param("productPrice", "11500")
		.param("productDescription", "Addias Originals")
		.param("productFor", "women")
		.multiPart("productImage",new File("/Users/azarahmed/Downloads/Photos_Videos/Azar_Pic.jpeg"));

		String addProductResponse=reqAddProduct.when().post("api/ecom/product/add-product")
		.then().log().all().extract().response().asString();
		
		JsonPath js=new JsonPath(addProductResponse);
		String productId=js.get("productId");
		
		//Create order
		RequestSpecification createOrderBasereq=new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				.addHeader("Authorization", token).setContentType(ContentType.JSON).build();
		
		pojoOrderDetails orderDetail= new pojoOrderDetails();
		orderDetail.setCountry("India");
		orderDetail.setProductOrderedId(productId);
		
		List <pojoOrderDetails> orderDetailList = new ArrayList<pojoOrderDetails>();
		orderDetailList.add(orderDetail);
		
		
		
		pojoOrders orders = new pojoOrders();
		orders.setOrders(orderDetailList);
		
		RequestSpecification createOrderReq=given().log().all().spec(createOrderBasereq)
		.body(orders);
		String responseAddOrder=createOrderReq.when().post("/api/ecom/order/create-order").then().log().all().extract().response().asString();
		System.out.println(responseAddOrder);
		
	}

}
