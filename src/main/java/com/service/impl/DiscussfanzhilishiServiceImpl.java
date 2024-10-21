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


import com.dao.DiscussfanzhilishiDao;
import com.entity.DiscussfanzhilishiEntity;
import com.service.DiscussfanzhilishiService;
import com.entity.vo.DiscussfanzhilishiVO;
import com.entity.view.DiscussfanzhilishiView;

@Service("discussfanzhilishiService")
public class DiscussfanzhilishiServiceImpl extends ServiceImpl<DiscussfanzhilishiDao, DiscussfanzhilishiEntity> implements DiscussfanzhilishiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussfanzhilishiEntity> page = this.selectPage(
                new Query<DiscussfanzhilishiEntity>(params).getPage(),
                new EntityWrapper<DiscussfanzhilishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussfanzhilishiEntity> wrapper) {
		  Page<DiscussfanzhilishiView> page =new Query<DiscussfanzhilishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussfanzhilishiVO> selectListVO(Wrapper<DiscussfanzhilishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussfanzhilishiVO selectVO(Wrapper<DiscussfanzhilishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussfanzhilishiView> selectListView(Wrapper<DiscussfanzhilishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussfanzhilishiView selectView(Wrapper<DiscussfanzhilishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
