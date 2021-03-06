package com.leimingtech.service.module.goods.dao.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.leimingtech.core.entity.GoodsClass;
import com.leimingtech.service.module.goods.dao.GoodsClassDao;
import com.leimingtech.service.module.goods.dao.mapper.GoodsClassMapper;

@Repository
public class GoodsClassDaoImpl implements GoodsClassDao{

    @Resource
    private GoodsClassMapper goodsClassMapper;

	@Override
	public void save(GoodsClass goodsClass) {
		goodsClassMapper.save(goodsClass);
	}

	@Override
	public void update(GoodsClass goodsClass) {
		goodsClassMapper.update(goodsClass);
	}

	@Override
	public void delete(Integer id) {
		goodsClassMapper.delete(id);
	}

	@Override
	public int findCount(GoodsClass goodsClass) {
		return goodsClassMapper.findCount(goodsClass);
	}

	@Override
	public List<GoodsClass> findAll() {
		return goodsClassMapper.findAll();
	}

	@Override
	public GoodsClass findById(Integer gcId) {
		return goodsClassMapper.findById(gcId);
	}

	@Override
	public List<GoodsClass> findList(int parentid) {
		return goodsClassMapper.findList(parentid);
	}

	@Override
	public List<GoodsClass> findListbyishow(GoodsClass goodsClass) {
		return goodsClassMapper.findListbyishow(goodsClass);
	}

	@Override
	public List<GoodsClass> findAllbyisshow(GoodsClass goodsClass) {
		return goodsClassMapper.findAllbyisshow(goodsClass);
	}
	
	/**
     * 通过父id查询子分类
     * @param gcParentId
     * @return
     */
    public List<GoodsClass> findChild(Integer gcParentId){
    	return goodsClassMapper.findChild(gcParentId);
    }

    
    /**
     * 修改分类
     * @param goodsClass
     */
	@Override
	public void updatebyparentid(GoodsClass goodsClass) {
		goodsClassMapper.updatebyparentid(goodsClass);
	}

	@Override
	public void updatelevelbyPidAndId(GoodsClass goodsClass) {
		// TODO Auto-generated method stub
		goodsClassMapper.updatelevelbyPidAndId(goodsClass);
	}
	
	@Override
	public void updatelevelbyPidAndLevelForDel(GoodsClass goodsClass) {
		// TODO Auto-generated method stub
		goodsClassMapper.updatelevelbyPidAndLevelForDel(goodsClass);
	}
	
}
