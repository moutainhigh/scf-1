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
 * <p>Description: 放款管理导出表格</p>
 * author: suj
 * emali: suj@fkhwl.com
 * version: 1.0
 * date: 2020年03月18日 17点31分
 * updatetime:
 * reason:
 */
@Data
public class LoanListExcel implements Serializable {

    @Excel(name = "放款申请编号")
    private String creditApplyNo;

    @Excel(name = "客户名称")
    private String companyBorrowerName;

    @Excel(name = "交易对手")
    private String counterpartyName;
    @Excel(name = "申请融资额度（元）")
    private BigDecimal applyBalance;
    @Excel(name = "应收账款转让金额（元）")
    private BigDecimal transferBalance;

    @Excel(name = "放款金额")
    private BigDecimal loanBalance;
    @Excel(name = "放款时间")
    private Date loanTime;

//
//    @Excel(name = "附件路径（暂定，可能需要修改）")
//    private String attachment;
//    @Excel(name = "应收账款id")
//    private Long counterpartyId;
//    @Excel(name = "到期日")
//    private Date dueDate;
//    @Excel(name = "利息金额")
//    private BigDecimal interestBalance;
//    @Excel(name = "有效转让金额")
//    private BigDecimal transferBalance;
//    @Excel(name = "是否生效")
//    private Boolean isValid;
//    @Excel(name = "实际比例")
//    private BigDecimal factRatio;
//    @Excel(name = "管理费用")
//    private BigDecimal manageBalance;
//
//    @Excel(name = "分项剩余限额：分项额度的可用余额")
//    private BigDecimal subitemRemainBalance;
}
