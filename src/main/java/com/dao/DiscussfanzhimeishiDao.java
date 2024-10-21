package com.dao;

import com.entity.DiscussfanzhimeishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussfanzhimeishiVO;
import com.entity.view.DiscussfanzhimeishiView;


/**
 * 繁峙美食评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-15 19:46:55
 */
public interface DiscussfanzhimeishiDao extends BaseMapper<DiscussfanzhimeishiEntity> {
	
	List<DiscussfanzhimeishiVO> selectListVO(@Param("ew") Wrapper<DiscussfanzhimeishiEntity> wrapper);
	
	DiscussfanzhimeishiVO selectVO(@Param("ew") Wrapper<DiscussfanzhimeishiEntity> wrapper);
	
	List<DiscussfanzhimeishiView> selectListView(@Param("ew") Wrapper<DiscussfanzhimeishiEntity> wrapper);

	List<DiscussfanzhimeishiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussfanzhimeishiEntity> wrapper);
	
	DiscussfanzhimeishiView selectView(@Param("ew") Wrapper<DiscussfanzhimeishiEntity> wrapper);
	
}
