package com.nit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Invoice;
import com.nit.exception.InvoiceNotFoundException;
import com.nit.repository.IinvoiceRepository;

@Service
public class InvoiceService implements IInvoiceService {

	
	@Autowired
	private IinvoiceRepository invoiceRepo;
	
	@Override
	public Invoice saveInvoice(Invoice invoice) {
		
		return invoiceRepo.save(invoice);
	}

	@Override
	public List<Invoice> getAllInvoice() {
		return invoiceRepo.findAll();
	}

	@Override
	public Invoice getInvoiceById(Long id) {
		Optional<Invoice> invoice=invoiceRepo.findById(id);
		if(invoice.isEmpty()){
			throw new InvoiceNotFoundException("Invoice with id : "+id+" Not Found!");
		}
		else {
			return invoice.get();
		}
	}

	@Override
	public void deleteInvoiceById(Long id) {
		invoiceRepo.deleteById(id);
	}

	@Override
	public void updateInvoiceById(Invoice invoice) {
		invoiceRepo.save(invoice);

	}

}
