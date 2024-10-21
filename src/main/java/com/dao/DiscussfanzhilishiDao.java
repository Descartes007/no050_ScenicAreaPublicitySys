package com.dao;

import com.entity.DiscussfanzhilishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussfanzhilishiVO;
import com.entity.view.DiscussfanzhilishiView;


/**
 * 繁峙历史评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-15 19:46:55
 */
public interface DiscussfanzhilishiDao extends BaseMapper<DiscussfanzhilishiEntity> {
	
	List<DiscussfanzhilishiVO> selectListVO(@Param("ew") Wrapper<DiscussfanzhilishiEntity> wrapper);
	
	DiscussfanzhilishiVO selectVO(@Param("ew") Wrapper<DiscussfanzhilishiEntity> wrapper);
	
	List<DiscussfanzhilishiView> selectListView(@Param("ew") Wrapper<DiscussfanzhilishiEntity> wrapper);

	List<DiscussfanzhilishiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussfanzhilishiEntity> wrapper);
	
	DiscussfanzhilishiView selectView(@Param("ew") Wrapper<DiscussfanzhilishiEntity> wrapper);
	
}
