package com.yangxuan.admin.controller;

import com.yangxuan.admin.model.SysMenu;
import com.yangxuan.admin.service.SysMenuService;
import com.yangxuan.core.http.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 菜单控制器
 * @author Louis
 * @date Jan 13, 2019
 */
@RestController
@RequestMapping("menu")
public class SysMenuController {

    @Autowired
    private SysMenuService sysMenuService;

    @PostMapping(value="/save")
    public HttpResult save(@RequestBody SysMenu record) {
        return HttpResult.ok(sysMenuService.save(record));
    }

    @PostMapping(value="/delete")
    public HttpResult delete(@RequestBody List<SysMenu> records) {
        return HttpResult.ok(sysMenuService.delete(records));
    }

    @GetMapping(value="/findNavTree")
    public HttpResult findNavTree(@RequestParam String userName) {
        return HttpResult.ok(sysMenuService.findTree(userName, 1));
    }

    @GetMapping(value="/findMenuTree")
    public HttpResult findMenuTree() {
        return HttpResult.ok(sysMenuService.findTree(null, 0));
    }
}