
package doanvat.webmvc.dao;

import doanvat.webmvc.model.Admin;
import java.util.List;

public interface AdminDao { 
	void insert(Admin admin); 
 
	void edit(Admin admin); 
	
	void delete(String id); 
 
	Admin get(int id); 
	 
	Admin get(String name); 
 
	List<Admin> getAll(); 
	
} 
