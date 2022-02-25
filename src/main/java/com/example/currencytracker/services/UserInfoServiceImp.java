package com.example.currencytracker.services;

import com.example.currencytracker.entity.UserInfo;
import com.example.currencytracker.model.UserInfoModel;
import com.example.currencytracker.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserInfoServiceImp implements UserInfoService{

    @Autowired
    public UserInfoRepository userInfoRepository;

    public UserInfoServiceImp(UserInfoRepository userInfoRepository){
        this.userInfoRepository = userInfoRepository;
    }

    @Override
    public boolean addUserInfo(UserInfoModel userInfo) {
        return false;
    }

    @Override
    public boolean addUserInfo() {
        long millis=System.currentTimeMillis();
        Date date = new Date(millis);
        BigDecimal sal = new BigDecimal(12.56);
        UserInfo userInfo = new UserInfo(11,22,sal,"Test",date);
        try{

            userInfoRepository.save(userInfo);

            System.out.println("DB Success!!!!!!!!!!!!!!!!1111");
            System.out.println("DB Fetch!!!!!!!!!!!!!!!!1111");
            userInfoRepository.findAll().forEach(x -> System.out.println(x.toString()));
            System.out.println("DB Fetch Success!!!!!!!!!!!!!!!!1111");
        }catch (Exception ex){
            System.out.println("DB call Failed " + ex.getMessage());
        }
        return false;
    }

    @Override
    public List<UserInfoModel> getUserInfoData() {
        return null;
    }
}
