package com.kodilla.hibernate.invoice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.List;


@Entity
@Table(name = "INVOICE")
public class Invoice {
    private int id;
    private String number;
    private List <Item> items;

    public Invoice(){}

    public Invoice(String number, List<Item> items) {
        this.number = number;
        this.items = items;
    }

    @Id
    @GeneratedValue
    @NotNull
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

/*    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }*/
}
