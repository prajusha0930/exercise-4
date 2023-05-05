package com.example.crud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.Service.MarketService;
import com.example.crud.model.Market;

@RestController
public class MarketController {
	    @Autowired
	    MarketService ms;
	    @GetMapping(value="/id")
	    public List<Market> all(){
	    	return ms.all();
	    }
	    @GetMapping("/id/{id}")
	    public Market getdetailsById(@PathVariable int id) {
	    	return ms.getdetailsById(id);
	    }
	    @DeleteMapping("/id/{id}")
	    public String deletedetailsById(@PathVariable int id) {
	    	 ms.deletedetailsById(id);
	    	 return "Deleted Successfully";
	    }
	    @PostMapping("/save")
	    public String saveinfo(@RequestBody Market s) {
	    	ms.saveinfo(s);
	    	return "Id details saved";
	    }
	    @PutMapping("/put")
	    public Market putinfo(@RequestBody Market b) {
	    	return ms.putinfo(b);
	    }
	    @GetMapping("/sortmarket/{field}")
	    public List<Market> sortMarkets(@PathVariable String field)
	    {
	    	return ms.sortMarkets(field);
	    }
	   /* @PutMapping(value="/updateStudent/{rno}")
	    public  Student updateStudent(@RequestBody Student s,@PathVariable int rno)
	    {
	    	
	    	return studService.updateStudent(s,rno);
	    	
	    	
	    }*/

}
