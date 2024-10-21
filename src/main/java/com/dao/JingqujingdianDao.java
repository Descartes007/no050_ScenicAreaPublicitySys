package com.dao;

import com.entity.JingqujingdianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JingqujingdianVO;
import com.entity.view.JingqujingdianView;


/**
 * 景区景点
 * 
 * @author 
 * @email 
 * @date 2021-03-15 19:46:55
 */
public interface JingqujingdianDao extends BaseMapper<JingqujingdianEntity> {
	
	List<JingqujingdianVO> selectListVO(@Param("ew") Wrapper<JingqujingdianEntity> wrapper);
	
	JingqujingdianVO selectVO(@Param("ew") Wrapper<JingqujingdianEntity> wrapper);
	
	List<JingqujingdianView> selectListView(@Param("ew") Wrapper<JingqujingdianEntity> wrapper);

	List<JingqujingdianView> selectListView(Pagination page,@Param("ew") Wrapper<JingqujingdianEntity> wrapper);
	
	JingqujingdianView selectView(@Param("ew") Wrapper<JingqujingdianEntity> wrapper);
	
}
