package com.example.currencytracker.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CurrencyInfoModel {
    public String baseCurr;
    public BigDecimal usd;
    public BigDecimal eur;
    public BigDecimal cad;
    public BigDecimal gbp;
    public BigDecimal bgn;
    public BigDecimal jpy;
}
