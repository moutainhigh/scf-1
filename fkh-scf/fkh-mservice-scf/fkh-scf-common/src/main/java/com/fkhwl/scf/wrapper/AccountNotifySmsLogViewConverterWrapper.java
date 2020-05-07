package com.fkhwl.scf.wrapper;

import com.fkhwl.scf.entity.dto.AccountNotifySmsLogDTO;
import com.fkhwl.scf.entity.vo.AccountNotifySmsLogVO;
import com.fkhwl.starter.common.mapstruct.ViewConverterWrapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * <p>Company: 成都返空汇网络技术有限公司</p>
 * <p>Description: 短信提醒记录 视图层转换器, 提供 vo 和 dto 互转 </p>
 * form 和 dto 互转需要在此接口中自己添加.
 *
 * @author Administrator
 * @version 1.0.0
 * @email "mailto:Administrator@fkhwl.com"
 * @date 2020.04.08 16:01
 */
@Mapper
public interface AccountNotifySmsLogViewConverterWrapper extends ViewConverterWrapper<AccountNotifySmsLogVO, AccountNotifySmsLogDTO> {

    AccountNotifySmsLogViewConverterWrapper INSTANCE = Mappers.getMapper(AccountNotifySmsLogViewConverterWrapper.class);
}


