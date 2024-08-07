package com.reportsapi.service;

import java.util.List;

import com.reportsapi.request.SearchRequest;
import com.reportsapi.response.SearchResponse;

import jakarta.servlet.http.HttpServletResponse;


public interface ReportService {
     
	public List<String> getUniquePlanNames();
	
	public List<String> getUniquePlanStatus();
	
	public List<SearchResponse> search(SearchRequest request);
	
	public void generateExcel(HttpServletResponse response) throws Exception;
	
	public void generatePdf(HttpServletResponse response) throws Exception;	
	
}
