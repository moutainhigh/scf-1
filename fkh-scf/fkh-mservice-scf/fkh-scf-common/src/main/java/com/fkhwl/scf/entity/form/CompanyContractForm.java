package com.fkhwl.scf.entity.form;

import com.fkhwl.starter.common.base.BaseForm;
import com.fkhwl.starter.common.enums.DeleteEnum;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

/**
 * <p>Company: 成都返空汇网络技术有限公司</p>
 * <p>Description: 主体合同：资方与借款方签订的合同 视图实体 (根据业务需求添加字段) </p>
 *
 * @author Administrator
 * @version 1.0.0
 * @email "mailto:Administrator@fkhwl.com"
 * @date 2020.03.03 15:12
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@ApiModel("新增/更新主体合同")
public class CompanyContractForm extends BaseForm<Long> {
    private static final long serialVersionUID = 1L;

    /** 资方企业ID */
    @ApiModelProperty(value = "资方企业ID")
    private Long companyCapitalId;
    /** 借款方企业ID */
    @ApiModelProperty(value = "借款方企业ID")
    private Long companyBorrowerId;
    /** 借款方企业ID：合同主体名称 */
    @ApiModelProperty(value = "借款方企业ID：合同主体名称")
    private String companyBorrowerName;
    /** 合同编号 */
    @ApiModelProperty(value = "合同编号")
    private String contractNumber;
    /** 合同开始时间 */
    @ApiModelProperty(value = "合同开始时间")
    private Date startTime;
    /** 合同结束时间 */
    @ApiModelProperty(value = "资方企业ID")
    private Date endTime;
    /** 管理费率 */
    @ApiModelProperty(value = "管理费率")
    @Builder.Default
    private BigDecimal manageRate = BigDecimal.ZERO;
    /** 利率 */
    @ApiModelProperty(value = "利率")
    @Builder.Default
    private BigDecimal interestRate = BigDecimal.ZERO;
    /** 总额度 */
    @ApiModelProperty(value = "总额度")
    @Builder.Default
    private BigDecimal totalBalance = BigDecimal.ZERO;
    /** 合同文件链接地址 */
    @ApiModelProperty(value = "同文件链接地址")
    private String contractLink;
    /** 合同多个 */
    @ApiModelProperty(value = "合同多个 ")
    private List<ContractInfoForm> contractInfos;

    /** 企业所有已审核放款成功的总金额：累计 */
    @ApiModelProperty(value = "企业所有已审核放款成功的总金额：累计 ")
    @Builder.Default
    private BigDecimal loanSuccessBalance = BigDecimal.ZERO;
    /** 可用余额 */
    @ApiModelProperty(value = "可用余额")
    @Builder.Default
    private BigDecimal remainingBalance = BigDecimal.ZERO;
    /** 企业已归还金额：累计 */
    @ApiModelProperty(value = "企业已归还金额：累计")
    @Builder.Default
    private BigDecimal returnedBalance = BigDecimal.ZERO;
    /** 未还,在途,还需要归还的金额：累计 */
    @ApiModelProperty(value = "未还,在途,还需要归还的金额：累计 ")
    @Builder.Default
    private BigDecimal needReturnBalance = BigDecimal.ZERO;

    /** 可分配的分项额度：总额度-已分配的分享额度总和 */
    @ApiModelProperty(value = "可分配的分项额度：总额度-已分配的分享额度总和 ")
    @Builder.Default
    private BigDecimal remainingSubitemBalance = BigDecimal.ZERO;

    /** 已分配的分享额度总和：交易对手的分享额度总和 */
    @ApiModelProperty(value = "已分配的分享额度总和：交易对手的分享额度总和")
    @Builder.Default
    private BigDecimal hadSubitemBalance = BigDecimal.ZERO;

    @ApiModelProperty(value = " 状态：0：初始化（待审核），1：正常（审核通过），2：异常（审核不通过）")
    private Integer status;

    @ApiModelProperty(value = "开户银行户主名称")
    private String bankAccountName;
    @ApiModelProperty(value = "客户开户银行")
    private String bankName;
    @ApiModelProperty(value = "开户银行卡号")
    private String bankAccountNo;
    @ApiModelProperty(value = "一级项目经理")
    private String projectMgName;
    @ApiModelProperty(value = "二级项目经理")
    private String projectSecondMgName;
    @ApiModelProperty(value = "部门经理")
    private String departmentManager;
    @ApiModelProperty(value = "经办部门")
    private String departmentName;
    private String branchBankName;

    private DeleteEnum deleted;
    private Date createTime;
    private Date updateTime;

    public interface UpdateGroup {

    }
    public interface CreateGroup {

    }
}
