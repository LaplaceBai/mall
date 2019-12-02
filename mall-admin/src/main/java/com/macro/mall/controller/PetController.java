package com.macro.mall.controller;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.dto.PetSummaryParam;
import com.macro.mall.dto.UmsAdminLoginParam;
import com.macro.mall.dto.UmsAdminParam;
import com.macro.mall.model.PetSummary;
import com.macro.mall.model.UmsAdmin;
import com.macro.mall.model.UmsPermission;
import com.macro.mall.model.UmsRole;
import com.macro.mall.service.PetSummaryService;
import com.macro.mall.service.UmsAdminService;
import com.macro.mall.util.RestUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 宠物管理管理
 * Created by macro on 2018/4/26.
 */
@Controller
@Api(tags = "PetController", description = "宠物后台管理")
@RequestMapping("/pet")
public class PetController {

    String DogApi = "http://api.apishop.net/common/dogFamily/queryDogListByKeyword";
    String CatApi = "";

    @Autowired
    private PetSummaryService petSummaryService;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult add() {
        PetSummaryParam petSummaryParam = new PetSummaryParam();
        petSummaryParam.setName("流氓猫咪");
        int count = petSummaryService.create(petSummaryParam);
        return CommonResult.success(petSummaryParam);
    }


    @RequestMapping(value = "/getPetList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getPetList() {
        PetSummaryParam petSummaryParam = new PetSummaryParam();

        List<PetSummary> petSummaryList = petSummaryService.list(petSummaryParam,45,1);

        return CommonResult.success(petSummaryList);
    }


    @RequestMapping(value = "/testAPI", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult testApi() {

        RestUtil restUtil = new RestUtil();
        try {
            String resultString = restUtil.load(
                    DogApi,
                    "apiKey=p6frwq59f23405931fc398029d6be749c72a98d045b386b&page=1&pageSize=200&keyword=");
            Object resultObj =  new JSONObject(resultString).get("result");
            JSONArray petFamilyList =  new JSONObject(resultObj).getJSONArray("petFamilyList");

            System.out.println("petFamilyList:"+petFamilyList);
            int i=0;
            for(i=0;i<petFamilyList.size();i++){
                JSONObject cat = new JSONObject(petFamilyList.get(i));
                PetSummaryParam petSummaryParam = new PetSummaryParam();
                petSummaryParam.setName(cat.get("name").toString());
                petSummaryParam.setCoverurl(cat.get("coverURL").toString());
                petSummaryParam.setType("DOG");
                petSummaryParam.setEngname(cat.get("engName").toString());
                petSummaryParam.setPetid(cat.get("petID").toString());
                petSummaryParam.setPrice(cat.get("price").toString());
                int count = petSummaryService.create(petSummaryParam);
                System.out.println("ID: "+i+ " cat: "+cat);
            }
            return CommonResult.success(petFamilyList);


        }catch (Exception e){
            return CommonResult.success(e);
        }



    }
}
