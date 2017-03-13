package com.ghprint.cms.services;

import com.ghprint.cms.model.production.ProductionInfoView;
import com.ghprint.cms.pagination.DataGridResult;

/**
 * Created by Administrator on 2017/3/1.
 */
public interface ProductionInfoService {

    //增加生产标准
    public ProductionInfoView addProductionitems(ProductionInfoView productionInfoView);

    //查询现有的所有生产质量标准
    public DataGridResult  getProductionList(String key , String value,Integer page , Integer rows);
}