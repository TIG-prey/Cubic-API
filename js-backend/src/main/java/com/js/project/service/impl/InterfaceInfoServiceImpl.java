package com.js.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.js.jsapicommon.model.entity.InterfaceInfo;
import com.js.project.common.ErrorCode;
import com.js.project.exception.BusinessException;
import com.js.project.mapper.InterfaceInfoMapper;
import com.js.project.service.InterfaceInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * @author JianShang
 * @version 1.0.0
 * @description 接口信息服务实现类
 * @date 2024-09-13 12:09:49
 */
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService {

    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {
        if (interfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        String name = interfaceInfo.getName();
        // 创建时，所有参数必须非空
        if (add) {
            if (StringUtils.isAnyBlank(name)) {
                throw new BusinessException(ErrorCode.PARAMS_ERROR);
            }
        }
        if (StringUtils.isNotBlank(name) && name.length() > 50) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "名称过长");
        }
    }
    
}




