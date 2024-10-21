package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FanzhizhoubianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FanzhizhoubianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FanzhizhoubianView;


/**
 * 繁峙周边
 *
 * @author 
 * @email 
 * @date 2021-03-15 19:46:55
 */
public interface FanzhizhoubianService extends IService<FanzhizhoubianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FanzhizhoubianVO> selectListVO(Wrapper<FanzhizhoubianEntity> wrapper);
   	
   	FanzhizhoubianVO selectVO(@Param("ew") Wrapper<FanzhizhoubianEntity> wrapper);
   	
   	List<FanzhizhoubianView> selectListView(Wrapper<FanzhizhoubianEntity> wrapper);
   	
   	FanzhizhoubianView selectView(@Param("ew") Wrapper<FanzhizhoubianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FanzhizhoubianEntity> wrapper);
   	
}

