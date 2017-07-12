package com.bluemoon.service;

import com.bluemoon.dao.ElasticAccountInfoRepository;
import com.bluemoon.entity.AccountInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lsh on 2017/7/11.
 */
@Service("esAccountInfoServiceImpl")
public class ESAccountInfoServiceImpl implements ESAccountInfoService {

    @Autowired
    private ElasticAccountInfoRepository elasticAccountInfoRepository;

    public AccountInfo queryAccountInfoById(String id) {
        return elasticAccountInfoRepository.findOne(id);
    }

    @Override
    public AccountInfo queryAccountInfoByName(String accountName) {
        return elasticAccountInfoRepository.findByAccountName(accountName);
    }
}
