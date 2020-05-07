package com.fkhwl.scf.dao;

import org.apache.ibatis.annotations.Mapper;
import com.fkhwl.scf.entity.po.AuthUserRole;
import com.fkhwl.starter.common.base.BaseDao;

/**
 * <p>Company: 成都返空汇网络技术有限公司</p>
 * <p>Description: 用户角色中间表 Dao 接口  </p>
 *
 * @author ASpiralMoon
 * @email ASpiralMoon@fkhwl.com
 * @since 2020-02-18
 */
@Mapper
public interface AuthUserRoleDao extends BaseDao<AuthUserRole> {

}
