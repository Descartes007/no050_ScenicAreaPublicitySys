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


import com.dao.FanzhizhoubianDao;
import com.entity.FanzhizhoubianEntity;
import com.service.FanzhizhoubianService;
import com.entity.vo.FanzhizhoubianVO;
import com.entity.view.FanzhizhoubianView;

@Service("fanzhizhoubianService")
public class FanzhizhoubianServiceImpl extends ServiceImpl<FanzhizhoubianDao, FanzhizhoubianEntity> implements FanzhizhoubianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FanzhizhoubianEntity> page = this.selectPage(
                new Query<FanzhizhoubianEntity>(params).getPage(),
                new EntityWrapper<FanzhizhoubianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FanzhizhoubianEntity> wrapper) {
		  Page<FanzhizhoubianView> page =new Query<FanzhizhoubianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FanzhizhoubianVO> selectListVO(Wrapper<FanzhizhoubianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FanzhizhoubianVO selectVO(Wrapper<FanzhizhoubianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FanzhizhoubianView> selectListView(Wrapper<FanzhizhoubianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FanzhizhoubianView selectView(Wrapper<FanzhizhoubianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
