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


import com.dao.JingqujingdianDao;
import com.entity.JingqujingdianEntity;
import com.service.JingqujingdianService;
import com.entity.vo.JingqujingdianVO;
import com.entity.view.JingqujingdianView;

@Service("jingqujingdianService")
public class JingqujingdianServiceImpl extends ServiceImpl<JingqujingdianDao, JingqujingdianEntity> implements JingqujingdianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingqujingdianEntity> page = this.selectPage(
                new Query<JingqujingdianEntity>(params).getPage(),
                new EntityWrapper<JingqujingdianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingqujingdianEntity> wrapper) {
		  Page<JingqujingdianView> page =new Query<JingqujingdianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingqujingdianVO> selectListVO(Wrapper<JingqujingdianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingqujingdianVO selectVO(Wrapper<JingqujingdianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingqujingdianView> selectListView(Wrapper<JingqujingdianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingqujingdianView selectView(Wrapper<JingqujingdianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
