package com.dao;

import com.entity.FanzhizhoubianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FanzhizhoubianVO;
import com.entity.view.FanzhizhoubianView;


/**
 * 繁峙周边
 * 
 * @author 
 * @email 
 * @date 2021-03-15 19:46:55
 */
public interface FanzhizhoubianDao extends BaseMapper<FanzhizhoubianEntity> {
	
	List<FanzhizhoubianVO> selectListVO(@Param("ew") Wrapper<FanzhizhoubianEntity> wrapper);
	
	FanzhizhoubianVO selectVO(@Param("ew") Wrapper<FanzhizhoubianEntity> wrapper);
	
	List<FanzhizhoubianView> selectListView(@Param("ew") Wrapper<FanzhizhoubianEntity> wrapper);

	List<FanzhizhoubianView> selectListView(Pagination page,@Param("ew") Wrapper<FanzhizhoubianEntity> wrapper);
	
	FanzhizhoubianView selectView(@Param("ew") Wrapper<FanzhizhoubianEntity> wrapper);
	
}
