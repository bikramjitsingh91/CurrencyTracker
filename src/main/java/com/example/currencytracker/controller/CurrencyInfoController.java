package com.example.currencytracker.controller;

import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

public class CurrencyInfoController {

    @GetMapping(value = "/currencyinfo")
    public String getAppInfo() {

        return "currency info";
    }
}
