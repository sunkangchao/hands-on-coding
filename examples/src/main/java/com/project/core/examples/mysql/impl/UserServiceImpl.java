package com.project.core.examples.mysql.impl;

import com.project.core.kernel.mysql.entity.UserEntity;
import com.project.core.kernel.mysql.mapper.UserMapper;
import com.project.core.examples.mysql.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * UserServiceImpl
 *
 * @author sunkangchao
 * @version 1.0
 * @since <pre>09月 25, 2024</pre>
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {


    private final UserMapper userMapper;


    @Override
    public void save(UserEntity user) {
        UserEntity userEntity = new UserEntity().setName("wangyuyang").setAge(17);
        userMapper.insert(userEntity);
        log.info("save user:{}", userEntity);
    }

    @Override
    public UserEntity queryUserById(Long id) {
        UserEntity userEntity = userMapper.selectById(id);
        log.info("query user:{}", userEntity);
        return userEntity;
    }

    @Override
    public UserEntity queryByUserName(String userName) {
        return userMapper.selectByUserName(userName);
    }
}
