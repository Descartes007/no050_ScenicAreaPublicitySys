package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FanzhilishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FanzhilishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FanzhilishiView;


/**
 * 繁峙历史
 *
 * @author 
 * @email 
 * @date 2021-03-15 19:46:55
 */
public interface FanzhilishiService extends IService<FanzhilishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FanzhilishiVO> selectListVO(Wrapper<FanzhilishiEntity> wrapper);
   	
   	FanzhilishiVO selectVO(@Param("ew") Wrapper<FanzhilishiEntity> wrapper);
   	
   	List<FanzhilishiView> selectListView(Wrapper<FanzhilishiEntity> wrapper);
   	
   	FanzhilishiView selectView(@Param("ew") Wrapper<FanzhilishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FanzhilishiEntity> wrapper);
   	
}

