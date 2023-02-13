package com.web.service;

import java.util.List;

import com.web.model.Amazon;

public interface AmazonService 
{
	public Amazon savePro(Amazon a);
	public void deletePro(Integer id);
	public List<Amazon> getAll();
	public Amazon getPro(Integer id);
	public Amazon updateStd(Amazon a,Integer id);
}
