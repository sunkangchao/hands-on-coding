package com.project.core.examples.mysql;

import com.project.core.kernel.mysql.entity.UserEntity;

/**
 * UserServiceImpl
 *
 * @author sunkangchao
 * @version 1.0
 * @since <pre>09月 25, 2024</pre>
 */
public interface UserService {

    void save(UserEntity user);

    UserEntity queryUserById(Long id);

    UserEntity queryByUserName(String userName);

}
