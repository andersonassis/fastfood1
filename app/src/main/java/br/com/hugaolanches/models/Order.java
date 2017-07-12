package br.com.hugaolanches.models;

import com.orm.dsl.Table;

import java.util.List;

@Table
public class Order {

    private long id;
    private String date;
    private Double total;
    private Double shipp;
    private int status;
    private List<Product> itens;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getShipp() {
        return shipp;
    }

    public void setShipp(Double shipp) {
        this.shipp = shipp;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<Product> getItens() {
        return itens;
    }

    public void setItens(List<Product> itens) {
        this.itens = itens;
    }
}
