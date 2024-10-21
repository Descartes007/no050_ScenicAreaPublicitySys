package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingqujingdianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingqujingdianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingqujingdianView;


/**
 * 景区景点
 *
 * @author 
 * @email 
 * @date 2021-03-15 19:46:55
 */
public interface JingqujingdianService extends IService<JingqujingdianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingqujingdianVO> selectListVO(Wrapper<JingqujingdianEntity> wrapper);
   	
   	JingqujingdianVO selectVO(@Param("ew") Wrapper<JingqujingdianEntity> wrapper);
   	
   	List<JingqujingdianView> selectListView(Wrapper<JingqujingdianEntity> wrapper);
   	
   	JingqujingdianView selectView(@Param("ew") Wrapper<JingqujingdianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingqujingdianEntity> wrapper);
   	
}

