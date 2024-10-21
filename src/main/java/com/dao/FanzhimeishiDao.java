package com.dao;

import com.entity.FanzhimeishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FanzhimeishiVO;
import com.entity.view.FanzhimeishiView;


/**
 * 繁峙美食
 * 
 * @author 
 * @email 
 * @date 2021-03-15 19:46:55
 */
public interface FanzhimeishiDao extends BaseMapper<FanzhimeishiEntity> {
	
	List<FanzhimeishiVO> selectListVO(@Param("ew") Wrapper<FanzhimeishiEntity> wrapper);
	
	FanzhimeishiVO selectVO(@Param("ew") Wrapper<FanzhimeishiEntity> wrapper);
	
	List<FanzhimeishiView> selectListView(@Param("ew") Wrapper<FanzhimeishiEntity> wrapper);

	List<FanzhimeishiView> selectListView(Pagination page,@Param("ew") Wrapper<FanzhimeishiEntity> wrapper);
	
	FanzhimeishiView selectView(@Param("ew") Wrapper<FanzhimeishiEntity> wrapper);
	
}
