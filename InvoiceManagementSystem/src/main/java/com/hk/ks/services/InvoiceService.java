package com.hk.ks.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.ks.dao.InvoiceRepository;

@Service
public class InvoiceService {

	@Autowired
	InvoiceRepository invoiceRepo;
	
	
}
