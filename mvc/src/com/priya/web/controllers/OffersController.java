package com.priya.web.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.priya.web.dao.Offer;
import com.priya.web.services.OffersService;

@Controller
public class OffersController {

	private OffersService offerService;

	@Autowired
	public void setOfferService(OffersService offerService) {
		this.offerService = offerService;
	}

	@RequestMapping("/offers")
	public String showOffers(Model model) {
		List<Offer> offers = offerService.getCurrent();
		model.addAttribute("offers", offers);
		return "offers";
	}

	@RequestMapping("/createoffer")
	public String createOffer(Model model) {

		Offer offer = new Offer();
		model.addAttribute("offer", offer);

		return "createoffer";
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String showTest(@RequestParam("id") String id) {
		System.out.println("ID is:" + id);
		return "home";
	}

	@RequestMapping(value = "/doCreate", method = RequestMethod.POST)
	public String doCreate(Model model, @Valid Offer offer,
			BindingResult binding) {
		if (binding.hasErrors()) {
			return "createoffer";
		}
		offerService.create(offer);
		return "created";
	}

}
