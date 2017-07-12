package com.bluemoon.service;

import com.bluemoon.entity.AccountInfo;

/**
 * Created by lsh on 2017/7/11.
 */
public interface  ESAccountInfoService {
    AccountInfo queryAccountInfoById(String id);

    AccountInfo queryAccountInfoByName(String accountName);
}
