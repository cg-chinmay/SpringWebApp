package jp.co.rakuten.checkout.controllers;

import java.util.List;


import javax.validation.Valid;

import jp.co.rakuten.checkout.dao.Offer;
import jp.co.rakuten.checkout.service.OffersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    	model.addAttribute("offer", new Offer());
    	return "CreateOffers";
    }
    @RequestMapping(value="/doCreate", method=RequestMethod.POST)
    public String doCreate(Model model, @Valid Offer offer, BindingResult result){
        if(result.hasErrors()){
        	System.out.println("Form Not Validated");
        	List<ObjectError> errors = result.getAllErrors();
        	for(ObjectError error:errors){
        		System.out.println("Error : "+error.getDefaultMessage());
        		return "CreateOffers";
        	}
        }
        else{
        	System.out.println("Form Validated");
        }
        System.out.print("Offer : "+offer);
        return "DoCreateOffer";
    }
}
