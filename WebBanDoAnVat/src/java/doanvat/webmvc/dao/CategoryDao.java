
package doanvat.webmvc.dao;

import doanvat.webmvc.model.Catalog;
import doanvat.webmvc.model.Product;
import java.util.List;

public interface CategoryDao {
	void insert(Catalog category);

	void edit(Catalog category);

	void delete(String id);

	Catalog get(int id);
	
	Catalog get(String name);

	List<Catalog> getAll();
	
	List<Catalog> getCateByProduct(int id);

}
