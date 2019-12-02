package com.macro.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.macro.mall.dao.*;
import com.macro.mall.dto.PetSummaryParam;
import com.macro.mall.dto.PmsProductParam;
import com.macro.mall.dto.PmsProductQueryParam;
import com.macro.mall.dto.PmsProductResult;
import com.macro.mall.mapper.*;
import com.macro.mall.model.*;
import com.macro.mall.service.PetSummaryService;
import com.macro.mall.service.PmsProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 商品管理Service实现类
 * Created by macro on 2018/4/26.
 */
@Service
public class PetSummaryServiceImpl implements PetSummaryService {
    private static final Logger LOGGER = LoggerFactory.getLogger(PetSummaryServiceImpl.class);
    @Autowired
    private PetSummaryMapper petSummaryMapper;


    @Override
    public int create(PetSummaryParam petSummaryParam) {
        int count;
        //创建商品
        PetSummary petSummary = petSummaryParam;
        petSummaryParam.setId(null);
        petSummaryMapper.insertSelective(petSummaryParam);

        count = 1;
        return count;
    }

    @Override
    public List<PetSummary> list(PetSummaryParam petSummaryParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        PetSummaryExample petSummaryExample = new PetSummaryExample();
        PetSummaryExample.Criteria criteria = petSummaryExample.createCriteria();
        //criteria.andD  .andDeleteStatusEqualTo(0);
        return petSummaryMapper.selectByExample(petSummaryExample);
    }

}
