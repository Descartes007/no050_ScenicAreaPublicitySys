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


import com.dao.DiscussfanzhizhoubianDao;
import com.entity.DiscussfanzhizhoubianEntity;
import com.service.DiscussfanzhizhoubianService;
import com.entity.vo.DiscussfanzhizhoubianVO;
import com.entity.view.DiscussfanzhizhoubianView;

@Service("discussfanzhizhoubianService")
public class DiscussfanzhizhoubianServiceImpl extends ServiceImpl<DiscussfanzhizhoubianDao, DiscussfanzhizhoubianEntity> implements DiscussfanzhizhoubianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussfanzhizhoubianEntity> page = this.selectPage(
                new Query<DiscussfanzhizhoubianEntity>(params).getPage(),
                new EntityWrapper<DiscussfanzhizhoubianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussfanzhizhoubianEntity> wrapper) {
		  Page<DiscussfanzhizhoubianView> page =new Query<DiscussfanzhizhoubianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussfanzhizhoubianVO> selectListVO(Wrapper<DiscussfanzhizhoubianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussfanzhizhoubianVO selectVO(Wrapper<DiscussfanzhizhoubianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussfanzhizhoubianView> selectListView(Wrapper<DiscussfanzhizhoubianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussfanzhizhoubianView selectView(Wrapper<DiscussfanzhizhoubianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
