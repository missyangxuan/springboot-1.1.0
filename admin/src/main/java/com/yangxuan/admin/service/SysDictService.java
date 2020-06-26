package com.yangxuan.admin.service;

import com.yangxuan.admin.model.SysDict;
import com.yangxuan.core.sercice.CurdService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 字典管理
 * @author Louis
 * @date Jan 13, 2019
 */
public interface SysDictService extends CurdService<SysDict> {

    /**
     * 根据名称查询
     * @param lable
     * @return
     */
    List<SysDict> findByLable(String lable);
}
