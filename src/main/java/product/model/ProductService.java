package product.model;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("productService")
public class ProductService implements IProductService {

	@Autowired
	private IProductDao productDao;

	@Override
	public Product selectByID(int id) {
		System.out.println("ProductService : selectByID");
		return productDao.selectByID(id);
	}
	
	@Override
	public List<Product> selectAll() {
		System.out.println("ProductService : selectAll");
		return productDao.selectAll();
	}

	@Override
	public Product insert(Product product) {
		return productDao.insert(product);
	}

	@Override
	public Product update(int id, String name, String type, int stock, double cost, double price, String Description) {
		System.out.println("ProductService: " + "update: ");
		return productDao.update(id, name, type, stock, cost, price, Description);
	}

	@Override
	public boolean delete(int id) {
		return productDao.delete(id);
	}
}
