package com.dao;

import com.entity.FanzhimingrenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FanzhimingrenVO;
import com.entity.view.FanzhimingrenView;


/**
 * 繁峙名人
 * 
 * @author 
 * @email 
 * @date 2021-03-15 19:46:55
 */
public interface FanzhimingrenDao extends BaseMapper<FanzhimingrenEntity> {
	
	List<FanzhimingrenVO> selectListVO(@Param("ew") Wrapper<FanzhimingrenEntity> wrapper);
	
	FanzhimingrenVO selectVO(@Param("ew") Wrapper<FanzhimingrenEntity> wrapper);
	
	List<FanzhimingrenView> selectListView(@Param("ew") Wrapper<FanzhimingrenEntity> wrapper);

	List<FanzhimingrenView> selectListView(Pagination page,@Param("ew") Wrapper<FanzhimingrenEntity> wrapper);
	
	FanzhimingrenView selectView(@Param("ew") Wrapper<FanzhimingrenEntity> wrapper);
	
}
