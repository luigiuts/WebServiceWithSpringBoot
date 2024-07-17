package com.invoice.co.invoice.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.invoice.co.invoice.repositories.entities.ProductEntity;

@Repository
public interface ProductRepository extends CrudRepository<ProductEntity,Long>{
    
}
