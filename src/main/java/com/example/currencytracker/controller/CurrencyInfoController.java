package com.example.currencytracker.controller;

import com.example.currencytracker.entity.CurrencyInfo;
import com.example.currencytracker.model.CurrencyInfoModel;
import com.example.currencytracker.model.CurrencyInfoResModel;
import com.example.currencytracker.services.CurrencyInfoService;
import com.example.currencytracker.services.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@CrossOrigin
@RestController
public class CurrencyInfoController {

    public UserInfoService userInfoService;
    public CurrencyInfoService currencyInfoService;

    @Autowired
    public CurrencyInfoController(UserInfoService userInfoService,
                                  CurrencyInfoService currencyInfoService){
        this.userInfoService = userInfoService;
        this.currencyInfoService = currencyInfoService;
    }

    @PostMapping(value = "/saveCurrencyInfo")
    public ResponseEntity<CurrencyInfoResModel> saveCurrencyInfo(@RequestBody CurrencyInfoModel currencyInfoModel) {
        System.out.println("currencyInfo " + currencyInfoModel.toString());
        CurrencyInfoResModel res = currencyInfoService.saveCurrencyInfoToDB(currencyInfoModel);
        return ResponseEntity.ok(res);
    }

    @DeleteMapping(value = "/clearCurrencyStore")
    public ResponseEntity clearCurrencyStore() {
       boolean res = currencyInfoService.clearCurrencyStore();
        if(res)
            return new ResponseEntity<>(HttpStatus.OK);

        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @GetMapping(value = "/defaultUser")
    public ResponseEntity addDefaultUser() {
        System.out.println("Arrived");
        boolean res = userInfoService.addUserInfo();
        if(res)
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = "/getCurrencyInfo")
    public ResponseEntity<CurrencyInfoResModel> getCurrencyInfo() {
       // System.out.println("currencyInfo " + currencyInfoModel.toString());
        CurrencyInfoResModel res = currencyInfoService.getCurrencyInfoFromDB();
        return ResponseEntity.ok(res);
    }
}
