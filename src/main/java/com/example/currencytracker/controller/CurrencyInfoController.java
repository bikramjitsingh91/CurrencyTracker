package com.example.currencytracker.controller;

import com.example.currencytracker.services.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class CurrencyInfoController {

    public UserInfoService userInfoService;

    @Autowired
    public CurrencyInfoController(UserInfoService userInfoService){
        this.userInfoService = userInfoService;
    }

    @GetMapping(value = "/currencyinfo")
    public String getAppInfo() {

        return "currency info";
    }

    @GetMapping(value = "/defaultUser")
    public ResponseEntity addDefaultUser() {
        System.out.println("Arrived");
        boolean res = userInfoService.addUserInfo();
        if(res)
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
