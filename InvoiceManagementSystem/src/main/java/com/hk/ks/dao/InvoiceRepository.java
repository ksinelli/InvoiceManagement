package com.hk.ks.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hk.ks.entities.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}
