package com.project.core.kernel.mysql.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.project.core.kernel.mysql.entity.UserEntity;
import org.apache.ibatis.annotations.Param;

/**
 * UserMapper
 *
 * @author sunkangchao
 * @version 1.0
 * @since <pre>09月 25, 2024</pre>
 */
public interface UserMapper extends BaseMapper<UserEntity> {

    // 这里可以添加自定义的数据库操作方法，例如根据用户名查找用户等。
    // 如果没有自定义需求，则保持接口为空即可，因为已经继承了BaseMapper的基本操作方法。

    UserEntity selectByUserName(@Param("userName") String userName);


}
