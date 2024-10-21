package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FanzhimingrenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FanzhimingrenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FanzhimingrenView;


/**
 * 繁峙名人
 *
 * @author 
 * @email 
 * @date 2021-03-15 19:46:55
 */
public interface FanzhimingrenService extends IService<FanzhimingrenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FanzhimingrenVO> selectListVO(Wrapper<FanzhimingrenEntity> wrapper);
   	
   	FanzhimingrenVO selectVO(@Param("ew") Wrapper<FanzhimingrenEntity> wrapper);
   	
   	List<FanzhimingrenView> selectListView(Wrapper<FanzhimingrenEntity> wrapper);
   	
   	FanzhimingrenView selectView(@Param("ew") Wrapper<FanzhimingrenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FanzhimingrenEntity> wrapper);
   	
}

