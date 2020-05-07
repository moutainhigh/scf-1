package com.fkhwl.scf.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.fkhwl.scf.entity.dto.CreditApplyDetailDTO;
import com.fkhwl.scf.entity.dto.ReviewPageDTO;
import com.fkhwl.scf.entity.dto.SubjectClaimsOrderDTO;
import com.fkhwl.scf.entity.vo.ReviewPageVo;

import java.util.List;
import java.util.Map;

/**
 * <p>Company: 成都返空汇网络技术有限公司</p>
 * <p>Description: 用款申请详情 服务接口 </p>
 *
 * @author ASpiralMoon
 * @email ASpiralMoon@fkhwl.com
 * @since 2020-02-18
 */
public interface CreditApplyDetailService {
    /**
     * 分页查询标的债权订单
     *
     * @param page   分页信息
     * @param params 查询参数
     * @return 返回分页标的债权订单数据 page
     */
    IPage<CreditApplyDetailDTO> listPage(IPage<CreditApplyDetailDTO> page, Map<String, Object> params);

    /**
     * 获取标的债权订单详情
     *
     * @param id  标的债权订单id
     * @return 角色详情DTO optional
     */
    CreditApplyDetailDTO getDetail(Long id);

    /**
     * 新增和更新标的债权订单
     *
     * @param creditApplyDetailDTO 标的债权订单实体
     */
    void saveOrUpdate(CreditApplyDetailDTO creditApplyDetailDTO);

    /**
     * 删除标的债权订单
     *
     * @param id 标的债权订单id
     */
    void delete(Long id);
    /**
    * 审核页面数据
     * @param params
    * @return: java.util.List<com.fkhwl.scf.entity.vo.ReviewPageVo>
    * @Author: liuan
    * @Date: 2020/3/1 13:42
    */
    List<ReviewPageDTO> reviewPage(Map<String, Object> params);
}

