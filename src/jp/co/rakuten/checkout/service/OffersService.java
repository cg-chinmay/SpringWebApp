package jp.co.rakuten.checkout.service;

import java.util.List;

import jp.co.rakuten.checkout.dao.Offer;
import jp.co.rakuten.checkout.dao.OffersDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("offersService")
public class OffersService {

    private OffersDAO offersDao;
    
    @Autowired
    public void setOffersDao(OffersDAO offersDao) {
        this.offersDao = offersDao;
    }
    
    public List<Offer> getCurrent(){
        return offersDao.getOffers();
    }

	public void create(Offer offer) {
		// TODO Auto-generated method stub
		offersDao.create(offer);
	}
}
