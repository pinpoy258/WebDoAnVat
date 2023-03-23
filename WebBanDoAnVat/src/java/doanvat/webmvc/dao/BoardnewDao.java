
package doanvat.webmvc.dao;

import doanvat.webmvc.model.Boardnew;
import java.util.List;

public interface BoardnewDao {
	void insert(Boardnew boardnew);

	void edit(Boardnew boardnew);

	void delete(int id);

	Boardnew get(int id);
	
	Boardnew get(String name);

	List<Boardnew> getAll();
}
