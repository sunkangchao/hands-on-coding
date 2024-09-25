package com.project.core.controller;

import com.alibaba.fastjson.JSON;
import com.project.core.examples.mysql.UserService;
import com.project.core.kernel.mysql.entity.UserEntity;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * UserController
 *
 * @author sunkangchao
 * @version 1.0
 * @since <pre>09月 23, 2024</pre>
 */
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;


    @ApiOperation("保存用户")
    @PostMapping("/save")
    public String saveUser() {
        userService.save(null);
        return "success";
    }

    @ApiOperation("根据ID查询用户")
    @GetMapping("/query/{id}")
    public String queryUser(@PathVariable("id") Long id) {
        UserEntity userEntity = userService.queryUserById(id);
        return JSON.toJSONString(userEntity);
    }


    @ApiOperation("根据名称查询用户")
    @GetMapping("/query")
    public String queryByUserName(@RequestParam("name") String name) {
        UserEntity userEntity = userService.queryByUserName(name);
        return JSON.toJSONString(userEntity);
    }



}
