package com.ghprint.cms.model.production;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/3/1.
 */
public class ProductionInfoView implements Serializable {

   

    private TProductionStandard productionStandard;

    private  TCustomerInfo customerInfo;

    private  TProductInfo productInfo;

    private  TPrintingData printingData;

    private  TPrintingProcedure printingProcedure;

    private  TPrintingProcedureafter printingProcedureafter;

    public  ProductionInfoView (){}

    public TProductionStandard getProductionStandard() {
        return productionStandard;
    }

    public void setProductionStandard(TProductionStandard productionStandard) {
        this.productionStandard = productionStandard;
    }

    public TCustomerInfo getCustomerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(TCustomerInfo customerInfo) {
        this.customerInfo = customerInfo;
    }

    public TProductInfo getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(TProductInfo productInfo) {
        this.productInfo = productInfo;
    }

    public TPrintingData getPrintingData() {
        return printingData;
    }

    public void setPrintingData(TPrintingData printingData) {
        this.printingData = printingData;
    }

    public TPrintingProcedure getPrintingProcedure() {
        return printingProcedure;
    }

    public void setPrintingProcedure(TPrintingProcedure printingProcedure) {
        this.printingProcedure = printingProcedure;
    }

    public TPrintingProcedureafter getPrintingProcedureafter() {
        return printingProcedureafter;
    }

    public void setPrintingProcedureafter(TPrintingProcedureafter printingProcedureafter) {
        this.printingProcedureafter = printingProcedureafter;
    }

   

    @Override
    public String toString() {
        return "ProductionInfoView{" +
                "productionStandard=" + productionStandard +
                ", customerInfo=" + customerInfo +
                ", productInfo=" + productInfo +
                ", printingData=" + printingData +
                ", printingProcedure=" + printingProcedure +
                ", printingProcedureafter=" + printingProcedureafter +
                '}';
    }
}