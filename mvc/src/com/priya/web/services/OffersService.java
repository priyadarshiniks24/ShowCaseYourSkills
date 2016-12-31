package com.priya.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.priya.web.dao.Offer;
import com.priya.web.dao.OffersDao;

@Service
public class OffersService {

	private OffersDao offerDao;

	@Autowired
	public void setOfferDao(OffersDao offerDao) {
		this.offerDao = offerDao;
	}
	
	public List<Offer> getCurrent(){
		return offerDao.getOffers();
	}

	public void create(Offer offer) {
		offerDao.create(offer);
	}
}
