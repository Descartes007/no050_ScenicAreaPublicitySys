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


import com.dao.FanzhimingrenDao;
import com.entity.FanzhimingrenEntity;
import com.service.FanzhimingrenService;
import com.entity.vo.FanzhimingrenVO;
import com.entity.view.FanzhimingrenView;

@Service("fanzhimingrenService")
public class FanzhimingrenServiceImpl extends ServiceImpl<FanzhimingrenDao, FanzhimingrenEntity> implements FanzhimingrenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FanzhimingrenEntity> page = this.selectPage(
                new Query<FanzhimingrenEntity>(params).getPage(),
                new EntityWrapper<FanzhimingrenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FanzhimingrenEntity> wrapper) {
		  Page<FanzhimingrenView> page =new Query<FanzhimingrenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FanzhimingrenVO> selectListVO(Wrapper<FanzhimingrenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FanzhimingrenVO selectVO(Wrapper<FanzhimingrenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FanzhimingrenView> selectListView(Wrapper<FanzhimingrenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FanzhimingrenView selectView(Wrapper<FanzhimingrenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
