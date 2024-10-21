package com.dao;

import com.entity.DiscussjingqujingdianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjingqujingdianVO;
import com.entity.view.DiscussjingqujingdianView;


/**
 * 景区景点评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-15 19:46:55
 */
public interface DiscussjingqujingdianDao extends BaseMapper<DiscussjingqujingdianEntity> {
	
	List<DiscussjingqujingdianVO> selectListVO(@Param("ew") Wrapper<DiscussjingqujingdianEntity> wrapper);
	
	DiscussjingqujingdianVO selectVO(@Param("ew") Wrapper<DiscussjingqujingdianEntity> wrapper);
	
	List<DiscussjingqujingdianView> selectListView(@Param("ew") Wrapper<DiscussjingqujingdianEntity> wrapper);

	List<DiscussjingqujingdianView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjingqujingdianEntity> wrapper);
	
	DiscussjingqujingdianView selectView(@Param("ew") Wrapper<DiscussjingqujingdianEntity> wrapper);
	
}
