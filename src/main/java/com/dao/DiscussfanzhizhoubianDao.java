package com.dao;

import com.entity.DiscussfanzhizhoubianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussfanzhizhoubianVO;
import com.entity.view.DiscussfanzhizhoubianView;


/**
 * 繁峙周边评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-15 19:46:55
 */
public interface DiscussfanzhizhoubianDao extends BaseMapper<DiscussfanzhizhoubianEntity> {
	
	List<DiscussfanzhizhoubianVO> selectListVO(@Param("ew") Wrapper<DiscussfanzhizhoubianEntity> wrapper);
	
	DiscussfanzhizhoubianVO selectVO(@Param("ew") Wrapper<DiscussfanzhizhoubianEntity> wrapper);
	
	List<DiscussfanzhizhoubianView> selectListView(@Param("ew") Wrapper<DiscussfanzhizhoubianEntity> wrapper);

	List<DiscussfanzhizhoubianView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussfanzhizhoubianEntity> wrapper);
	
	DiscussfanzhizhoubianView selectView(@Param("ew") Wrapper<DiscussfanzhizhoubianEntity> wrapper);
	
}
