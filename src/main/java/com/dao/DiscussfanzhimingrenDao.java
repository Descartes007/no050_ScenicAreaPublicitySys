package com.dao;

import com.entity.DiscussfanzhimingrenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussfanzhimingrenVO;
import com.entity.view.DiscussfanzhimingrenView;


/**
 * 繁峙名人评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-15 19:46:55
 */
public interface DiscussfanzhimingrenDao extends BaseMapper<DiscussfanzhimingrenEntity> {
	
	List<DiscussfanzhimingrenVO> selectListVO(@Param("ew") Wrapper<DiscussfanzhimingrenEntity> wrapper);
	
	DiscussfanzhimingrenVO selectVO(@Param("ew") Wrapper<DiscussfanzhimingrenEntity> wrapper);
	
	List<DiscussfanzhimingrenView> selectListView(@Param("ew") Wrapper<DiscussfanzhimingrenEntity> wrapper);

	List<DiscussfanzhimingrenView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussfanzhimingrenEntity> wrapper);
	
	DiscussfanzhimingrenView selectView(@Param("ew") Wrapper<DiscussfanzhimingrenEntity> wrapper);
	
}
