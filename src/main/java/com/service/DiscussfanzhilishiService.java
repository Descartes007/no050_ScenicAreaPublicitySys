package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussfanzhilishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussfanzhilishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussfanzhilishiView;


/**
 * 繁峙历史评论表
 *
 * @author 
 * @email 
 * @date 2021-03-15 19:46:55
 */
public interface DiscussfanzhilishiService extends IService<DiscussfanzhilishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussfanzhilishiVO> selectListVO(Wrapper<DiscussfanzhilishiEntity> wrapper);
   	
   	DiscussfanzhilishiVO selectVO(@Param("ew") Wrapper<DiscussfanzhilishiEntity> wrapper);
   	
   	List<DiscussfanzhilishiView> selectListView(Wrapper<DiscussfanzhilishiEntity> wrapper);
   	
   	DiscussfanzhilishiView selectView(@Param("ew") Wrapper<DiscussfanzhilishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussfanzhilishiEntity> wrapper);
   	
}

