package com.nit.service;

import java.util.List;

import com.nit.entity.Invoice;

public interface IInvoiceService {
	
	public Invoice saveInvoice(Invoice invoice);
	public List<Invoice> getAllInvoice();
	public Invoice getInvoiceById(Long id);
	public void deleteInvoiceById(Long id);
	public void updateInvoiceById(Invoice invoice);

}
