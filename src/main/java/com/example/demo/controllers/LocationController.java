package com.example.demo.controllers;

//import com.example.demo.service.LocationService;
import com.example.demo.entities.Location;
import com.example.demo.service.LocationService;
import com.example.demo.util.EmailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class LocationController {

@Autowired
  private  LocationService locationService;

@Autowired
   private EmailUtil emailUtil;

    @RequestMapping("/showCreate")
    public String showCreate(){
        return "createLocation";
    }

    @RequestMapping("/saveLoc")
    public String saveLocation(@ModelAttribute("location")Location location, ModelMap modelMap){
       Location locationSaved;
        locationSaved = locationService.saveLocation(location);
        String msg="Location saved with id: "+locationSaved.getId();
        modelMap.addAttribute("msg", msg);
        emailUtil.sendEmail("springjuma@gmail.com","location saved","how are you my boy");
        return "createLocation";

    }

    @RequestMapping("/displayLocations")
    public String displayLocations(ModelMap modelMap){
      List<Location> locations= locationService.getAllLocations();
      modelMap.addAttribute("locations",locations);
      return "displayLocations";
    }

    @RequestMapping("/deleteLocation")
    public String deleteLocation(@RequestParam("id") int id,ModelMap modelMap){
        Location location=locationService.getLocationById(id);
        locationService.deleteLocation(location);
        List<Location> locations=locationService.getAllLocations();
        modelMap.addAttribute("locations",locations);
        return "displayLocations";

    }

    @RequestMapping("/updateLocation")
    public String showUpdate(@RequestParam("id") int id,ModelMap modelMap){
        Location location=locationService.getLocationById(id);
        modelMap.addAttribute("location",location);
        return "updateLocation";
    }


    @RequestMapping("/updateLoc")
    public String updateLocation(@ModelAttribute("location")Location location , ModelMap modelMap){
        locationService.updateLocation(location);

        List<Location> locations=locationService.getAllLocations();
        modelMap.addAttribute("locations",locations);

        return "displayLocations";

    }

}
