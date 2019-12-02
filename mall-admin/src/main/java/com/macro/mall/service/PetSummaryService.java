package com.macro.mall.service;

import com.macro.mall.dto.PetSummaryParam;
import com.macro.mall.dto.PmsProductParam;
import com.macro.mall.dto.PmsProductQueryParam;
import com.macro.mall.dto.PmsProductResult;
import com.macro.mall.model.PetSummary;
import com.macro.mall.model.PmsProduct;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 商品管理Service
 * Created by macro on 2018/4/26.
 */
public interface PetSummaryService {
    /**
     * 创建商品
     */
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    int create(PetSummaryParam petSummaryParam);


    /**
     * 分页查询商品
     */
    List<PetSummary> list(PetSummaryParam petSummaryParam, Integer pageSize, Integer pageNum);


}
