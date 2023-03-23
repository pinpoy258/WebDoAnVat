
package doanvat.webmvc.service.impl;

import doanvat.webmvc.dao.OrderedDao;
import doanvat.webmvc.dao.impl.OrderedDaoImpl;
import doanvat.webmvc.model.Ordered;
import doanvat.webmvc.service.OrderedService;
import java.util.List;

public class OrderedServiceImpl implements OrderedService{
	OrderedDao orderDao = new OrderedDaoImpl();
	@Override
	public void insert(Ordered ordered) {
		orderDao.insert(ordered);
	}

	@Override
	public void edit(Ordered ordered) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Ordered get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ordered get(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ordered> getAll() {
		return orderDao.getAll();
	}

}
