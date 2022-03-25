package com.sunglowsys.oneToMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
    @Id
    @Column(name = "acc_id")
    private Integer id;
    private String bank;

    public Account() {}

    public Account(Integer id, String bank) {
        this.id = id;
        this.bank = bank;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", bank='" + bank + '\'' +
                '}';
    }
}
