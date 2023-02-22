package com.example.singapourprojectkafka.stock;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryStock extends CrudRepository<Stock,Integer> {




}
