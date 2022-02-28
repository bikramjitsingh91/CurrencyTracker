package com.example.currencytracker.model;

import com.example.currencytracker.entity.CurrencyInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CurrencyInfoResModel {
    public List<CurrencyInfo> currencyInfoList;
}
