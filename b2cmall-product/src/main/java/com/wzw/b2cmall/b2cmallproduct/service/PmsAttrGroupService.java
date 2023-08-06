package com.wzw.b2cmall.b2cmallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wzw.common.utils.PageUtils;
import com.wzw.b2cmall.b2cmallproduct.entity.PmsAttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author wzw
 * @email 325884@whut.edu.cn
 * @date 2023-08-03 12:25:59
 */
public interface PmsAttrGroupService extends IService<PmsAttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
