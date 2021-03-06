package com.fkhwl.scf.entity.vo;

import com.fkhwl.starter.common.base.BaseVO;
import com.fkhwl.starter.common.enums.DeleteEnum;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

/**
 * <p>Company: 成都返空汇网络技术有限公司</p>
 * <p>Description: 系统配置 视图实体  </p>
 * 根据业务需求添加字段
 *
 * @author sj
 * @email sj#fkhwl.com
 * @since 2020-02-19
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ScfConfigVO extends BaseVO<Long> {
    private static final long serialVersionUID = 1L;


    @ApiModelProperty(value = "父级Id")
    private Long parentId;
    @ApiModelProperty(value = "配置键")
    private String configKey;
    @ApiModelProperty(value = "配置值")
    private String configValue;
    @ApiModelProperty(value = "常量描述")
    private String configDesc;
    @ApiModelProperty(value = "配置是否生效")
    private Integer configStatus;
    private DeleteEnum deleted;
    private Date createTime;
    private Date updateTime;
}
