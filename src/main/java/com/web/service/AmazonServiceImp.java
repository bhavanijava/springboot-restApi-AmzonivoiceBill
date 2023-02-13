package com.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.Amazon;
import com.web.repo.AmazonRepo;

@Service
public class AmazonServiceImp implements AmazonService {
	@Autowired
	private AmazonRepo repo;
	
	@Override
	public Amazon savePro(Amazon a) {
		Double total=a.getPrice()*a.getQuantity();
		Double disc=(double) 0;
		Double invoicebill=(double) 0;
		if(total<2500)
		{
			disc=0.1*total;
			invoicebill=total-disc;
		}
		else if(total>=2500&&total<5000)
		{
			disc=0.15*total;
			invoicebill=total-disc;
		}
		else
		{
			disc=0.3*total;
			invoicebill=total-disc;
		}
		a.setTotal(total);
		a.setDisc(disc);
		a.setInvoicebill(invoicebill);
		
		return repo.save(a);
	}

	@Override
	public void deletePro(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public List<Amazon> getAll() {
		return (List<Amazon>) repo.findAll();
	}

	@Override
	public Amazon getPro(Integer id) {
		return repo.findById(id).get();
	}

	@Override
	public Amazon updateStd(Amazon a, Integer id) {
		
		Optional<Amazon> optional=repo.findById(id);
		Amazon a1=optional.get();
		
		a1.setCname(a.getCname());
		a1.setPname(a.getPname());
		a1.setPrice(a.getPrice());
		a1.setQuantity(a.getQuantity());
		
		Double total=a1.getPrice()*a1.getQuantity();
		Double disc=(double) 0;
		Double invoicebill=(double) 0;
		if(total<2500)
		{
			disc=0.1*total;
			invoicebill=total-disc;
		}
		else if(total>=2500&&total<5000)
		{
			disc=0.15*total;
			invoicebill=total-disc;
		}
		else
		{
			disc=0.3*total;
			invoicebill=total-disc;
		}
		a1.setTotal(total);
		a1.setDisc(disc);
		a1.setInvoicebill(invoicebill);
		
		
		

		
		return repo.save(a1);
	}

}
