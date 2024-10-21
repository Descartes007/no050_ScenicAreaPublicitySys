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


import com.dao.FanzhilishiDao;
import com.entity.FanzhilishiEntity;
import com.service.FanzhilishiService;
import com.entity.vo.FanzhilishiVO;
import com.entity.view.FanzhilishiView;

@Service("fanzhilishiService")
public class FanzhilishiServiceImpl extends ServiceImpl<FanzhilishiDao, FanzhilishiEntity> implements FanzhilishiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FanzhilishiEntity> page = this.selectPage(
                new Query<FanzhilishiEntity>(params).getPage(),
                new EntityWrapper<FanzhilishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FanzhilishiEntity> wrapper) {
		  Page<FanzhilishiView> page =new Query<FanzhilishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FanzhilishiVO> selectListVO(Wrapper<FanzhilishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FanzhilishiVO selectVO(Wrapper<FanzhilishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FanzhilishiView> selectListView(Wrapper<FanzhilishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FanzhilishiView selectView(Wrapper<FanzhilishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
