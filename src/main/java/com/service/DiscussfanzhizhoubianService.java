package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussfanzhizhoubianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussfanzhizhoubianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussfanzhizhoubianView;


/**
 * 繁峙周边评论表
 *
 * @author 
 * @email 
 * @date 2021-03-15 19:46:55
 */
public interface DiscussfanzhizhoubianService extends IService<DiscussfanzhizhoubianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussfanzhizhoubianVO> selectListVO(Wrapper<DiscussfanzhizhoubianEntity> wrapper);
   	
   	DiscussfanzhizhoubianVO selectVO(@Param("ew") Wrapper<DiscussfanzhizhoubianEntity> wrapper);
   	
   	List<DiscussfanzhizhoubianView> selectListView(Wrapper<DiscussfanzhizhoubianEntity> wrapper);
   	
   	DiscussfanzhizhoubianView selectView(@Param("ew") Wrapper<DiscussfanzhizhoubianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussfanzhizhoubianEntity> wrapper);
   	
}

