package controllers;
//import java.util.*;
import play.mvc.*;
//import models.Form;


import models.Product;
import play.data.Form;
import play.mvc.Result;
import play.mvc.Controller;
import views.html.products.*;

import java.util.List;



public class Products extends Controller {
	  public static final Form<Product> productForm=Form.form(Product.class);

	  public Result list() {
		    List<Product> products = Product.findAll();
		    return ok(list.render(products));
	  }


		public Result newProduct(){
			return ok(details.render(productForm));
		}
		public Result details(String ean){
			return TODO;
		}
		public Result save(){
			return TODO;
		}
}
