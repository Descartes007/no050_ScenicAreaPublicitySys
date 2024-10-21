package com.dao;

import com.entity.FanzhilishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FanzhilishiVO;
import com.entity.view.FanzhilishiView;


/**
 * 繁峙历史
 * 
 * @author 
 * @email 
 * @date 2021-03-15 19:46:55
 */
public interface FanzhilishiDao extends BaseMapper<FanzhilishiEntity> {
	
	List<FanzhilishiVO> selectListVO(@Param("ew") Wrapper<FanzhilishiEntity> wrapper);
	
	FanzhilishiVO selectVO(@Param("ew") Wrapper<FanzhilishiEntity> wrapper);
	
	List<FanzhilishiView> selectListView(@Param("ew") Wrapper<FanzhilishiEntity> wrapper);

	List<FanzhilishiView> selectListView(Pagination page,@Param("ew") Wrapper<FanzhilishiEntity> wrapper);
	
	FanzhilishiView selectView(@Param("ew") Wrapper<FanzhilishiEntity> wrapper);
	
}
