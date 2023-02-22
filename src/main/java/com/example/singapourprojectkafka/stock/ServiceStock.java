package com.example.singapourprojectkafka.stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceStock {

    private RepositoryStock stockRepository;

    @Autowired
    public ServiceStock(RepositoryStock stockRepository){
        this.stockRepository=stockRepository;
    }

    // Recevoir un id
    public String majProduction(Stock addStock){
        System.out.println("sous fonction :"+addStock);
        // GET DANS LA BASE
            // Find by idProduct
            Integer qantity = 0;
            //stockRepository.;

        // GET LE STOCK QUE je dosi ajouter de AddStock
            Integer AddIdProduct = addStock.getIdProduct();
            Integer AddQuantity= addStock.getQuantity();

        Integer total = AddQuantity + qantity;

        return "rrr";
    }
}


