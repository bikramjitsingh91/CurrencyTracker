package com.example.currencytracker.services;

import com.example.currencytracker.entity.CurrencyInfo;
import com.example.currencytracker.model.CurrencyInfoModel;
import com.example.currencytracker.model.CurrencyInfoResModel;
import com.example.currencytracker.model.UserInfoModel;

import java.util.List;

public interface CurrencyInfoService {

    CurrencyInfoResModel saveCurrencyInfoToDB(CurrencyInfoModel currencyInfoModel);

    CurrencyInfoResModel getCurrencyInfoFromDB();

    boolean clearCurrencyStore();

}
