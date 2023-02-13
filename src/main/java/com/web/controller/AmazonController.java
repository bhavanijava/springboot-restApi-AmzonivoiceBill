package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.Amazon;
import com.web.service.AmazonService;

@RestController
public class AmazonController {
	
	@Autowired 
	private AmazonService service;
	
	@PostMapping("/save")
	public Amazon save(@RequestBody Amazon pd)
	{
		return service.savePro(pd);
	}
	
	@GetMapping("/getAll")
	public List<Amazon> getAllDe()
	{
		return service.getAll();
	}
	
	@GetMapping("/get/{id}")
	public Amazon getOne(@PathVariable Integer id)
	{
		return service.getPro(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Integer id)
	{
		service.deletePro(id);
	}
	
	@PutMapping("/update/{id}")
	public Amazon edit(@RequestBody Amazon product,@PathVariable Integer id)
	{
		return service.updateStd(product, id);
	}

}
