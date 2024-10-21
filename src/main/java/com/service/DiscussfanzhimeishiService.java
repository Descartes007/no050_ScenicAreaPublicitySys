package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussfanzhimeishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussfanzhimeishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussfanzhimeishiView;


/**
 * 繁峙美食评论表
 *
 * @author 
 * @email 
 * @date 2021-03-15 19:46:55
 */
public interface DiscussfanzhimeishiService extends IService<DiscussfanzhimeishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussfanzhimeishiVO> selectListVO(Wrapper<DiscussfanzhimeishiEntity> wrapper);
   	
   	DiscussfanzhimeishiVO selectVO(@Param("ew") Wrapper<DiscussfanzhimeishiEntity> wrapper);
   	
   	List<DiscussfanzhimeishiView> selectListView(Wrapper<DiscussfanzhimeishiEntity> wrapper);
   	
   	DiscussfanzhimeishiView selectView(@Param("ew") Wrapper<DiscussfanzhimeishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussfanzhimeishiEntity> wrapper);
   	
}

