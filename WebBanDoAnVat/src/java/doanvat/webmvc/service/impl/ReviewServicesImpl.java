
package doanvat.webmvc.service.impl;

import doanvat.webmvc.dao.ReviewDao;
import doanvat.webmvc.dao.impl.ReviewDaoImpl;
import doanvat.webmvc.model.Review;
import doanvat.webmvc.service.ReviewService;
import java.util.List;

public class ReviewServicesImpl implements ReviewService {
	ReviewDao reviewDao = new ReviewDaoImpl();
	@Override
	public void insert(Review review) {
		reviewDao.insert(review);
		
	}

	@Override
	public void edit(Review review) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		reviewDao.delete(id);
	}

	@Override
	public Review get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Review get(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Review> getAll() {
		return reviewDao.getAll();
	}
	
	@Override
	public List<Review> getReviewById(int id) {
		return reviewDao.getReviewById(id);
	}
}
