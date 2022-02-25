package com.example.currencytracker.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "UserInfo")
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class UserInfo {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    public int id;
    @NonNull
    @Column(name = "age")
    public int age;
    @NonNull
    @Column(name = "salary")
    public BigDecimal salary;
    @NonNull
    @Column(name = "name")
    public String name;
    @NonNull
    @Column(name = "date_created_at")
    public Date dateCreatedAt;

}
