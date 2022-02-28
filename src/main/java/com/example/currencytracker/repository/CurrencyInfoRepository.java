package com.example.currencytracker.repository;

import com.example.currencytracker.entity.CurrencyInfo;
import com.example.currencytracker.entity.UserInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyInfoRepository extends CrudRepository<CurrencyInfo, Integer> {

}
