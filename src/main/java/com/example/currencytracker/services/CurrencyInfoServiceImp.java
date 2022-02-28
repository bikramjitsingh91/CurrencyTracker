package com.example.currencytracker.services;

import com.example.currencytracker.entity.CurrencyInfo;
import com.example.currencytracker.model.CurrencyInfoModel;
import com.example.currencytracker.model.CurrencyInfoResModel;
import com.example.currencytracker.repository.CurrencyInfoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class CurrencyInfoServiceImp implements CurrencyInfoService {

    private CurrencyInfoRepository currencyInfoRepository;

    public CurrencyInfoServiceImp(CurrencyInfoRepository currencyInfoRepository){
        this.currencyInfoRepository = currencyInfoRepository;
    }

    @Override
    public CurrencyInfoResModel saveCurrencyInfoToDB(CurrencyInfoModel currencyInfoModel) {
        CurrencyInfo currencyInfo = new CurrencyInfo();
        currencyInfo.setBaseCurr(currencyInfoModel.getBaseCurr());
        currencyInfo.setCad(currencyInfoModel.getCad());
        currencyInfo.setBgn(currencyInfoModel.getBgn());
        currencyInfo.setEur(currencyInfoModel.getEur());
        currencyInfo.setGbp(currencyInfoModel.getGbp());
        currencyInfo.setJpy(currencyInfoModel.getJpy());
        currencyInfo.setUsd(currencyInfoModel.getUsd());
        currencyInfo.setDateCreatedAt(LocalDateTime.now());

        CurrencyInfo curr = currencyInfoRepository.save(currencyInfo);
        List<CurrencyInfo> currencyInfoList = new ArrayList<>();
        currencyInfoRepository.findAll().forEach(x -> {
            System.out.println(x.toString());
            currencyInfoList.add(x);
        });

        CurrencyInfoResModel currencyInfoResModel = new CurrencyInfoResModel(currencyInfoList);

        return currencyInfoResModel;
    }

    @Override
    public CurrencyInfoResModel getCurrencyInfoFromDB() {
        List<CurrencyInfo> currencyInfoList = new ArrayList<>();
        currencyInfoRepository.findAll().forEach(x -> {
            System.out.println(x.toString());
            currencyInfoList.add(x);
        });

        CurrencyInfoResModel currencyInfoResModel = new CurrencyInfoResModel(currencyInfoList);

        return currencyInfoResModel;
    }

    @Override
    public boolean clearCurrencyStore() {
        try{
            currencyInfoRepository.deleteAll();
            return true;
        }catch (Exception ex){
            System.out.println("Failed to delete" + ex.getMessage());
            return false;
        }

    }
}
