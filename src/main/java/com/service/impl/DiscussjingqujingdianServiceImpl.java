package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussjingqujingdianDao;
import com.entity.DiscussjingqujingdianEntity;
import com.service.DiscussjingqujingdianService;
import com.entity.vo.DiscussjingqujingdianVO;
import com.entity.view.DiscussjingqujingdianView;

@Service("discussjingqujingdianService")
public class DiscussjingqujingdianServiceImpl extends ServiceImpl<DiscussjingqujingdianDao, DiscussjingqujingdianEntity> implements DiscussjingqujingdianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjingqujingdianEntity> page = this.selectPage(
                new Query<DiscussjingqujingdianEntity>(params).getPage(),
                new EntityWrapper<DiscussjingqujingdianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjingqujingdianEntity> wrapper) {
		  Page<DiscussjingqujingdianView> page =new Query<DiscussjingqujingdianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjingqujingdianVO> selectListVO(Wrapper<DiscussjingqujingdianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjingqujingdianVO selectVO(Wrapper<DiscussjingqujingdianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjingqujingdianView> selectListView(Wrapper<DiscussjingqujingdianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjingqujingdianView selectView(Wrapper<DiscussjingqujingdianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
