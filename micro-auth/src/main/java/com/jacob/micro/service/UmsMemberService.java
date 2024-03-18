package com.jacob.micro.service;

import com.jacob.micro.domain.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: Jacob
 * @Description: 前台会员服务远程调用Service
 * @Date: 2024/3/18 19:21
 * @Version: 1.0
 */
@FeignClient("micro-portal")
public interface UmsMemberService {
    @GetMapping("/sso/loadByUsername")
    UserDto loadUserByUsername(@RequestParam String username);
}
