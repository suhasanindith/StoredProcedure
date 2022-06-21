package com.cg.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import com.cg.Model.City;
import com.cg.Service.ICityService;

@CrossOrigin
@Controller
public class StoredProcedureController {
	 @Autowired
	    private ICityService cityService;

	    @GetMapping("/showCities")
	    public String findCities(Model model) {

	        var cities = (List<City>) cityService.findAll();

	        model.addAttribute("cities", cities);

	        return "showCities";
	    }

}
