package devmaster.edu.vn.main;

import java.util.List;

import devmaster.edu.vn.dao.ProductDAOImpl;
import devmaster.edu.vn.entity.Product;

public class TestSelect {
	public static void main(String[] args) {
		List<Product> list = new ProductDAOImpl().getAllProduct();
		if(list == null)
			return;
		for(Product item:list) {
			System.out.printf("\n%-10s",item.getBookId());
			System.out.printf("%-15s",item.getTitle());
			System.out.printf("%15d",item.getAuthor());
			System.out.printf("%15.0f",item.getRelease());
			System.out.printf("%15.0f",item.getPrice());
			System.out.printf("%15.0f",item.getPicture());
		}
	}


}
