package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.FanzhimeishiEntity;
import com.entity.view.FanzhimeishiView;

import com.service.FanzhimeishiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 繁峙美食
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-15 19:46:55
 */
@RestController
@RequestMapping("/fanzhimeishi")
public class FanzhimeishiController {
    @Autowired
    private FanzhimeishiService fanzhimeishiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,FanzhimeishiEntity fanzhimeishi, 
		HttpServletRequest request){

        EntityWrapper<FanzhimeishiEntity> ew = new EntityWrapper<FanzhimeishiEntity>();
		PageUtils page = fanzhimeishiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fanzhimeishi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,FanzhimeishiEntity fanzhimeishi, HttpServletRequest request){
        EntityWrapper<FanzhimeishiEntity> ew = new EntityWrapper<FanzhimeishiEntity>();
		PageUtils page = fanzhimeishiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fanzhimeishi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( FanzhimeishiEntity fanzhimeishi){
       	EntityWrapper<FanzhimeishiEntity> ew = new EntityWrapper<FanzhimeishiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( fanzhimeishi, "fanzhimeishi")); 
        return R.ok().put("data", fanzhimeishiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FanzhimeishiEntity fanzhimeishi){
        EntityWrapper< FanzhimeishiEntity> ew = new EntityWrapper< FanzhimeishiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( fanzhimeishi, "fanzhimeishi")); 
		FanzhimeishiView fanzhimeishiView =  fanzhimeishiService.selectView(ew);
		return R.ok("查询繁峙美食成功").put("data", fanzhimeishiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        FanzhimeishiEntity fanzhimeishi = fanzhimeishiService.selectById(id);
        return R.ok().put("data", fanzhimeishi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        FanzhimeishiEntity fanzhimeishi = fanzhimeishiService.selectById(id);
        return R.ok().put("data", fanzhimeishi);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        FanzhimeishiEntity fanzhimeishi = fanzhimeishiService.selectById(id);
        if(type.equals("1")) {
        	fanzhimeishi.setThumbsupnum(fanzhimeishi.getThumbsupnum()+1);
        } else {
        	fanzhimeishi.setCrazilynum(fanzhimeishi.getCrazilynum()+1);
        }
        fanzhimeishiService.updateById(fanzhimeishi);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FanzhimeishiEntity fanzhimeishi, HttpServletRequest request){
    	fanzhimeishi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fanzhimeishi);

        fanzhimeishiService.insert(fanzhimeishi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FanzhimeishiEntity fanzhimeishi, HttpServletRequest request){
    	fanzhimeishi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fanzhimeishi);

        fanzhimeishiService.insert(fanzhimeishi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody FanzhimeishiEntity fanzhimeishi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(fanzhimeishi);
        fanzhimeishiService.updateById(fanzhimeishi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        fanzhimeishiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<FanzhimeishiEntity> wrapper = new EntityWrapper<FanzhimeishiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = fanzhimeishiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
