package com.bluemoon.control;

import com.bluemoon.entity.AccountInfo;
import com.bluemoon.service.ESAccountInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lsh on 2017/7/11.
 */
public class ESController {
    @Autowired
    private ESAccountInfoService esAccountInfoServiceImpl;

    @RequestMapping("/esAccountInfo")
    public String queryAccountInfo(String id, ModelMap modelMap){

        AccountInfo accountInfo = esAccountInfoServiceImpl.queryAccountInfoById(id);
        modelMap.addAttribute("esAccountInfo",accountInfo);
        modelMap.addAttribute("test_elastic","Test the elasticsearch");

        return "accountInfo";
    }

    @RequestMapping("/esAccountInfoName")
    public String queryAccountInfoByAccountName(String accountName, ModelMap modelMap){

        AccountInfo accountInfo = esAccountInfoServiceImpl.queryAccountInfoByName(accountName);
        modelMap.addAttribute("esAccountInfo",accountInfo);
        modelMap.addAttribute("test_elastic","Test the elasticsearch");

        return "accountInfo";
    }
}
