package com.gyo.location.controllers;

import com.gyo.location.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.gyo.location.entities.Location;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class LocationController {

    @Autowired
    LocationService service;

    @RequestMapping("/showCreate")
    public String  showCreate(){

        return "createLocation";
    }

    @RequestMapping("/saveLoc")
    public  String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap){

       Location locationsaved = service.saveLocation(location);
       String msg = "Location saved with id: "+locationsaved.getId();
       modelMap.addAttribute("msg", msg);
        return "createLocation";
    }

    @RequestMapping("/displayLocations")
    public String displayLocations(ModelMap modelMap){
        List<Location> locations = service.getAllLocations();
        modelMap.addAttribute("locations", locations );
        return "displayLocations";
    }

    @RequestMapping("/deleteLocation")
    public String deleteLocation(@RequestParam("id") int id, ModelMap modelMap){
//        Location location = service.getLocationById(id); //llama a la base de datos y extrae parametros
        Location location = new Location(); //creamos el objeto y solo le asignamos el id
        location.setId(id);
        service.deleteLocation(location);
        List<Location> locations = service.getAllLocations();
        modelMap.addAttribute("locations",locations);

        return "displayLocations";
    }

    @RequestMapping("/showUpdate")
    public String showUpdate(@RequestParam("id") int id, ModelMap modelMap){
        Location location = service.getLocationById(id);
        modelMap.addAttribute("location", location);
        return "updateLocation";
    }

    @RequestMapping("/updateLoc")
    public String updateLocation(@ModelAttribute("location") Location location, ModelMap modelMap){
    service.updateLocation(location);
        List<Location> locations = service.getAllLocations();
        modelMap.addAttribute("locations", locations);
        return "displayLocations";
    }

}
