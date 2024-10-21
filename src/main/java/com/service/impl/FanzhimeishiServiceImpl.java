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


import com.dao.FanzhimeishiDao;
import com.entity.FanzhimeishiEntity;
import com.service.FanzhimeishiService;
import com.entity.vo.FanzhimeishiVO;
import com.entity.view.FanzhimeishiView;

@Service("fanzhimeishiService")
public class FanzhimeishiServiceImpl extends ServiceImpl<FanzhimeishiDao, FanzhimeishiEntity> implements FanzhimeishiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FanzhimeishiEntity> page = this.selectPage(
                new Query<FanzhimeishiEntity>(params).getPage(),
                new EntityWrapper<FanzhimeishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FanzhimeishiEntity> wrapper) {
		  Page<FanzhimeishiView> page =new Query<FanzhimeishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FanzhimeishiVO> selectListVO(Wrapper<FanzhimeishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FanzhimeishiVO selectVO(Wrapper<FanzhimeishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FanzhimeishiView> selectListView(Wrapper<FanzhimeishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FanzhimeishiView selectView(Wrapper<FanzhimeishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
