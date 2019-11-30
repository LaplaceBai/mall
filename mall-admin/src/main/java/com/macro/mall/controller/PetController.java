package com.macro.mall.controller;

import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.dto.PetSummaryParam;
import com.macro.mall.dto.UmsAdminLoginParam;
import com.macro.mall.dto.UmsAdminParam;
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

    @RequestMapping(value = "/testAPI", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult testApi() {

        RestUtil restUtil = new RestUtil();
        try {
            String resultString = restUtil.load(
                    "http://api.apishop.net/common/catFamily/queryCatListByKeyword",
                    "apiKey=p6frwq59f23405931fc398029d6be749c72a98d045b386b&page=1&pageSize=45&keyword=");


            return CommonResult.success(resultString);



        }catch (Exception e){
            return CommonResult.success(e);
        }



    }


    public String load22(String url,String query) throws Exception
    {
        URL restURL = new URL(url);
        /*
         * 此处的urlConnection对象实际上是根据URL的请求协议(此处是http)生成的URLConnection类 的子类HttpURLConnection
         */
        HttpURLConnection conn = (HttpURLConnection) restURL.openConnection();
        //请求方式
        conn.setRequestMethod("POST");
        //设置是否从httpUrlConnection读入，默认情况下是true; httpUrlConnection.setDoInput(true);
        conn.setDoOutput(true);
        //allowUserInteraction 如果为 true，则在允许用户交互（例如弹出一个验证对话框）的上下文中对此 URL 进行检查。
        conn.setAllowUserInteraction(false);

        PrintStream ps = new PrintStream(conn.getOutputStream());
        ps.print(query);

        ps.close();

        BufferedReader bReader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

        String line,resultStr="";

        while(null != (line=bReader.readLine()))
        {
            resultStr +=line;
        }
        System.out.println("3412412---"+resultStr);
        bReader.close();

        return resultStr;

    }
}
