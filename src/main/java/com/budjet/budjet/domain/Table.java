package com.budjet.budjet.domain;




public class Table {


    private  Integer id;


    public Table(Integer id, String name, Long balance) {

        this.id = id;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
