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


import com.dao.DiscussfanzhimeishiDao;
import com.entity.DiscussfanzhimeishiEntity;
import com.service.DiscussfanzhimeishiService;
import com.entity.vo.DiscussfanzhimeishiVO;
import com.entity.view.DiscussfanzhimeishiView;

@Service("discussfanzhimeishiService")
public class DiscussfanzhimeishiServiceImpl extends ServiceImpl<DiscussfanzhimeishiDao, DiscussfanzhimeishiEntity> implements DiscussfanzhimeishiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussfanzhimeishiEntity> page = this.selectPage(
                new Query<DiscussfanzhimeishiEntity>(params).getPage(),
                new EntityWrapper<DiscussfanzhimeishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussfanzhimeishiEntity> wrapper) {
		  Page<DiscussfanzhimeishiView> page =new Query<DiscussfanzhimeishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussfanzhimeishiVO> selectListVO(Wrapper<DiscussfanzhimeishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussfanzhimeishiVO selectVO(Wrapper<DiscussfanzhimeishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussfanzhimeishiView> selectListView(Wrapper<DiscussfanzhimeishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussfanzhimeishiView selectView(Wrapper<DiscussfanzhimeishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
