package com.js.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.js.jsapicommon.model.entity.UserInterfaceInfo;


import java.util.List;

/**
 * @author JianShang
 * @version 1.0.0
 * @description 用户接口信息 Mapper
 * @date 2024-09-13 12:05:21
 */
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




