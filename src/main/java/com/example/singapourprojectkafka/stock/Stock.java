package com.example.singapourprojectkafka.stock;


import jakarta.persistence.*;

@Entity
@Table(    name="stock"
)
public class Stock {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private Integer idProduct ;
    private Integer quantity;

    public Stock() {
    }

    public Integer getId() {
        return id;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "id=" + id +
                ", idProduct=" + idProduct +
                ", quantity=" + quantity +
                '}';
    }
}
