package com.example.crud.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.crud.model.Market;
import com.example.crud.repository.Marketrepository;

@Service
public class MarketService {
    @Autowired
    Marketrepository mr;
	public List<Market> all() {
		// TODO Auto-generated method stub
		return mr.findAll();
	}
	public Market getdetailsById(@PathVariable int id) {
		// TODO Auto-generated method stub
		return mr.findById(id).orElse(null);
	}
	public void deletedetailsById(int id) {
		// TODO Auto-generated method stub
		      mr.deleteById(id);
	}
	public Market saveinfo(Market s) {
		// TODO Auto-generated method stub
		return mr.save(s);
	}
	public Market putinfo(Market b) {
		// TODO Auto-generated method stub
		return mr.save(b);
	}
	public List<Market> sortMarkets(String field) {
		// TODO Auto-generated method stub
		return mr.findAll(Sort.by(Direction.DESC,field));
	}
	/*public  Student updateStudent(Student s,int rno) {
		Optional<Student> optional=studRepository.findById(rno);
		Student obj=null;
		if(optional.isPresent())
		{
			obj=optional.get();
			
		studRepository.save(s);
		}
		return obj;
	
		
	}*/
	
}
	

