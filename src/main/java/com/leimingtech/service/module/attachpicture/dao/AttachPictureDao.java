package com.leimingtech.service.module.attachpicture.dao;

import java.util.List;

import com.leimingtech.core.entity.base.AttachPicture;
import com.leimingtech.service.utils.page.Pager;

public interface AttachPictureDao {
	/**
	 * 保存图片库图片属性
	 * @param attachPicture
	 */
	public void save(AttachPicture attachPicture);
	
	/**
	 * 修改图片库图片属性
	 * @param attachPicture
	 */
	public void update(AttachPicture attachPicture);
	
	/**
	 * 根据id删除图片空间中图片数据
	 */
	public void delete(Integer id);
	
	/**
	 * 查询分页条数(包括查询条件)
	 * @param pager
	 * @return
	 */
	public int findCount(Pager pager);
	
	/**
	 * 分页查询
	 * @param pager
	 * @return
	 */
	public List<AttachPicture> findPageList(Pager pager);
	
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	public AttachPicture findById(Integer id);
	
	/**
	 * 查询所有不含分页
	 * @return
	 */
	public List<AttachPicture> findList();
	
	/**
	 * 根据店铺id查询
	 * @return
	 */
	public List<AttachPicture> findListByStoreID(Integer storeid);
}
