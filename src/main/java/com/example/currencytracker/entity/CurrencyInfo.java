package com.example.currencytracker.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "CurrencyInfo")
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class CurrencyInfo {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    public int id;
    @NonNull
    @Column(name = "base_curr")
    public String baseCurr;
    @NonNull
    @Column(name = "USD")
    public BigDecimal usd;
    @NonNull
    @Column(name = "EUR")
    public BigDecimal eur;
    @NonNull
    @Column(name = "CAD")
    public BigDecimal cad;
    @NonNull
    @Column(name = "GBP")
    public BigDecimal gbp;
    @NonNull
    @Column(name = "BGN")
    public BigDecimal bgn;
    @NonNull
    @Column(name = "JPY")
    public BigDecimal jpy;
    @NonNull
    @Column(name = "date_created_at")
    public LocalDateTime dateCreatedAt;
}
