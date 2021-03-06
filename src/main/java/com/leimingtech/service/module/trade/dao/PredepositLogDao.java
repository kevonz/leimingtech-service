package com.leimingtech.service.module.trade.dao;

import java.util.List;

import com.leimingtech.core.entity.base.PredepositLog;

/**
 * 预存款变更日志表
 * @author liukai
 */
public interface PredepositLogDao {
	/**
	 * 保存预存款变更日志表
	 * @param predepositLog
	 */
	void savePdl(PredepositLog predepositLog);
	
	/**
	 * 修改预存款变更日志表
	 * @param predepositLog
	 */
	void updatePdl(PredepositLog predepositLog);
	
	/**
	 * 通过id删除预存款变更日志表
	 * @param lgId
	 */
	void deletePdl(Integer lgId);
	
	/**
	 * 通过id查找预存款变更日志表
	 * @param lgId
	 * @return
	 */
	PredepositLog findPdlById(Integer lgId);
	
	/**
	 * 根据用户id查询预存款变更日志表
	 * @param lgMemberId
	 * @return
	 */
	List<PredepositLog> findByMemberId(Integer lgMemberId);
}
