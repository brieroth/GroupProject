package com.qa.controller;

import com.qa.business.iSeatsService;
import com.qa.persistence.domain.Seats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/seats")
@ResponseBody
@CrossOrigin(origins = "http://localhost:8081")
public class SeatsController {

    @Autowired
    private final iSeatsService iSeatsService;

    public SeatsController(com.qa.business.iSeatsService iSeatsService) {
        this.iSeatsService = iSeatsService;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Seats> getAllSeats(){
        return iSeatsService.findAll();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Seats add(@RequestBody Seats seats){
        return iSeatsService.save(seats);
    }

    @RequestMapping(value = "delete-all", method = RequestMethod.DELETE)
    public void deleteAllSeats(){
        iSeatsService.deleteAll();
    }

}
