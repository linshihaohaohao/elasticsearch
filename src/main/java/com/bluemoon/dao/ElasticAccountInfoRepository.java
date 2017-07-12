package com.bluemoon.dao;

import com.bluemoon.entity.AccountInfo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

/**
 * Created by lsh on 2017/7/11.
 */
@Component("elasticAccountInfoRepository")
public interface ElasticAccountInfoRepository extends ElasticsearchRepository<AccountInfo,String> {
    //TODO define the search
    AccountInfo findByAccountName(String accountName);
}
