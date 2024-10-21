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


import com.dao.DiscussfanzhimingrenDao;
import com.entity.DiscussfanzhimingrenEntity;
import com.service.DiscussfanzhimingrenService;
import com.entity.vo.DiscussfanzhimingrenVO;
import com.entity.view.DiscussfanzhimingrenView;

@Service("discussfanzhimingrenService")
public class DiscussfanzhimingrenServiceImpl extends ServiceImpl<DiscussfanzhimingrenDao, DiscussfanzhimingrenEntity> implements DiscussfanzhimingrenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussfanzhimingrenEntity> page = this.selectPage(
                new Query<DiscussfanzhimingrenEntity>(params).getPage(),
                new EntityWrapper<DiscussfanzhimingrenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussfanzhimingrenEntity> wrapper) {
		  Page<DiscussfanzhimingrenView> page =new Query<DiscussfanzhimingrenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussfanzhimingrenVO> selectListVO(Wrapper<DiscussfanzhimingrenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussfanzhimingrenVO selectVO(Wrapper<DiscussfanzhimingrenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussfanzhimingrenView> selectListView(Wrapper<DiscussfanzhimingrenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussfanzhimingrenView selectView(Wrapper<DiscussfanzhimingrenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
