package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Invoice;

public interface IinvoiceRepository extends JpaRepository<Invoice, Long> {

}
