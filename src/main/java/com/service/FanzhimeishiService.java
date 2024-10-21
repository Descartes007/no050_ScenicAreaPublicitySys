package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FanzhimeishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FanzhimeishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FanzhimeishiView;


/**
 * 繁峙美食
 *
 * @author 
 * @email 
 * @date 2021-03-15 19:46:55
 */
public interface FanzhimeishiService extends IService<FanzhimeishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FanzhimeishiVO> selectListVO(Wrapper<FanzhimeishiEntity> wrapper);
   	
   	FanzhimeishiVO selectVO(@Param("ew") Wrapper<FanzhimeishiEntity> wrapper);
   	
   	List<FanzhimeishiView> selectListView(Wrapper<FanzhimeishiEntity> wrapper);
   	
   	FanzhimeishiView selectView(@Param("ew") Wrapper<FanzhimeishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FanzhimeishiEntity> wrapper);
   	
}

