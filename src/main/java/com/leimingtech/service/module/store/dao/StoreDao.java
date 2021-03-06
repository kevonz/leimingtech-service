package com.leimingtech.service.module.store.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.leimingtech.core.entity.base.Store;
import com.leimingtech.core.entity.vo.StoreVo;
import com.leimingtech.service.utils.page.Pager;

/**
 * 
 * 
 * @项目名称：leimingtech-seller
 * @类名称：StoreDao
 * @类描述：
 * @创建人：shining
 * @创建时间：2014年12月2日 上午11:19:31
 * @修改人：shining
 * @修改时间：2014年12月2日 上午11:19:31
 * @修改备注：
 * @version
 * 
 */
public interface StoreDao {
	/**
	 * 根据店铺id获取店铺信息，不包括店铺等级信息
	 * @param id
	 * @return
	 */
	public Store findById(@Param("id") Integer id);
	
	/**
	 * 根据店铺di获取店铺信息，包括店铺等级信息
	 * @param id
	 * @return
	 */
	public StoreVo findVoById(@Param("id") Integer id);
	
	/**
	 * 修改店铺信息
	 * @param store
	 */
	public void updateStore(Store store);

    /**
     * 修改商店客户
     * @param store
     */
    void updateStoreCus(Store store);
	/**
	 * 根据会员I获取店铺
	 * @param id
	 * @return
	 */
	public Store findByMemberId(Integer id);
	
	/**
	 * 保存店铺信息
	 * @param store
	 */
	public void save(Store store);
	
	/**
	 * 根据店铺名字获取店铺信息
	 * @param storename
	 * @return
	 */
	public Store findByStorename(String storename);
	
	/**
     * 查询条数
     * @param pager
     * @return
     */
    int queryCount(Store store);
    
    /**
     * 查询店铺分页数据
     * @param pager
     * @return
     */
    List<Store> queryList(Pager pager);
    /**
     * 修改店铺收藏的数量
     * @param map
     * 
     */
    void updateStoreCount(Map<String,String> map);
    /**
	 * 根据id获取店铺
	 * @param id
	 * @return
	 */
	public Store findByIds(Store store);
	 /**
	  * 
	  * @Title: delete 
	  * @Description: TODO(根据ID 删除) 
	  * @param @param id    设定文件 
	  * @return void    返回类型 
	  */
	public void delete(@Param("id") Integer id);
	
}
