package product.model;

import java.util.List;

public interface IProductTypeService {

	ProductType selectByID(int id);

	List<ProductType> selectAll();

	ProductType insert(ProductType productType);

}