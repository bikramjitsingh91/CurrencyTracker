package com.example.currencytracker.services;

import com.example.currencytracker.entity.UserInfo;
import com.example.currencytracker.model.UserInfoModel;

import java.util.List;

public interface UserInfoService {

    boolean addUserInfo(UserInfoModel userInfo);

    boolean addUserInfo();

    List<UserInfoModel> getUserInfoData();
}
