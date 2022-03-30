package product.model;

import java.util.List;

public interface IProductTypeDao {

	ProductType insert(ProductType productType);

	ProductType selectByID(int id);

	List<ProductType> selectAll();

}