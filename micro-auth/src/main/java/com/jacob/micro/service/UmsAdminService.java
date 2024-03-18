package com.jacob.micro.service;

import com.jacob.micro.domain.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: Jacob
 * @Description: 后台用户服务远程调用Service
 * @Date: 2024/3/18 19:20
 * @Version: 1.0
 */
@FeignClient("micro-admin")
public interface UmsAdminService {
    @GetMapping("/admin/loadByUsername")
    UserDto loadUserByUsername(@RequestParam String username);
}
