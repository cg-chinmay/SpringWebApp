package jp.co.rakuten.checkout.controllers;

import java.util.List;

import jp.co.rakuten.checkout.dao.Offer;
import jp.co.rakuten.checkout.service.OffersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OfferController {
	
private OffersService offersService;
    
    @Autowired
    public void setOffersService(OffersService offersService) {
        this.offersService = offersService;
    }
	@RequestMapping("/offers")
    public String showOffers(Model model){
        
        List<Offer> offers = offersService.getCurrent();
        model.addAttribute("offers", offers);
        return "Offers";
    }
    @RequestMapping("/createOffer")
    public String showCreateOffers(Model model){
    	return "CreateOffers";
    }
}
