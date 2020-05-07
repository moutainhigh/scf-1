package com.fkhwl.scf.web.excelExport;

import com.fkhwl.scf.utils.Excel;

import java.io.*;
import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

/**
 * <p>Title: com.fkhwl.scf.web.excelExport</p>
 * <p>Company: 成都返空汇网络技术有限公</p>
 * <p>Copyright  2014 返空汇 All Rights Reserved</p>
 * <p>Description: 资金方导出收款记录</p>
 * author: suj
 * emali: suj@fkhwl.com
 * version: 1.0
 * date: 2020年04月09日 21点31分
 * updatetime:
 * reason:
 */
@Data
public class PayeeBillExcel implements Serializable {
//    @Excel(name = "收款状态")
//    private String statusToExcel;
    @Excel(name = "客户名称")
    private String companyBorrowerName;
//    @Excel(name = "交易对手")
//    private String counterpartyName;
    @Excel(name = "本次还款总额(元)")
    private BigDecimal totalBalance;

    @Excel(name = "本次还款本金(元)")
    private BigDecimal repayBalance;
    @Excel(name = "本次还款利息(元)")
    private BigDecimal interestRateBalance;
    @Excel(name = "本次还款宽限利息(元)")
    private BigDecimal graceRateBalance;
    @Excel(name = "本次还款逾期利息(元)")
    private BigDecimal overdueRateBalance;
    @Excel(name = "还款时间")
    private Date repayDate;
    @Excel(name = "处理时间")
    private Date updateTime;

    private Integer status;

    public String getStatusToExcel(){
        if(status==1){
            return "未处理";
        }else if(status==2){
            return "已确认收款";
        }else if(status==3){
            return "已拒绝";
        }
        return "";
    }
}
