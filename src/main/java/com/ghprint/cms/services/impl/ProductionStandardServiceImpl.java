package com.ghprint.cms.services.impl;

import com.ghprint.cms.model.production.TProductionStandard;
import com.ghprint.cms.serviceDao.TProductionStandardMapper;
import com.ghprint.cms.services.ProductionStandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/3/12.
 */
@Service
public class ProductionStandardServiceImpl  implements ProductionStandardService {
    @Autowired
    private TProductionStandardMapper productionStandardMapper;

    @Override
    public Integer addProductionStandardService(TProductionStandard productionStandard) {
        Integer record = productionStandardMapper.insertSelective(productionStandard);
        return record;
    }
}