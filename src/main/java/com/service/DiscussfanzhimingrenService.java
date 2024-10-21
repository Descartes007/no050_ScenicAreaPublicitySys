package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussfanzhimingrenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussfanzhimingrenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussfanzhimingrenView;


/**
 * 繁峙名人评论表
 *
 * @author 
 * @email 
 * @date 2021-03-15 19:46:55
 */
public interface DiscussfanzhimingrenService extends IService<DiscussfanzhimingrenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussfanzhimingrenVO> selectListVO(Wrapper<DiscussfanzhimingrenEntity> wrapper);
   	
   	DiscussfanzhimingrenVO selectVO(@Param("ew") Wrapper<DiscussfanzhimingrenEntity> wrapper);
   	
   	List<DiscussfanzhimingrenView> selectListView(Wrapper<DiscussfanzhimingrenEntity> wrapper);
   	
   	DiscussfanzhimingrenView selectView(@Param("ew") Wrapper<DiscussfanzhimingrenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussfanzhimingrenEntity> wrapper);
   	
}

