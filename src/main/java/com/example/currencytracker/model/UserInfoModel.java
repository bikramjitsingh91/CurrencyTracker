package com.example.currencytracker.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Date;

@AllArgsConstructor
@Data
public class UserInfoModel {
    public Integer id;
    public String name;
    public String age;
    public BigDecimal salary;
    public Date dateCreatedAt;
}
