package com.project.core.kernel.mysql.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * UserEntity
 *
 * @author sunkangchao
 * @version 1.0
 * @since <pre>09月 25, 2024</pre>
 */
@TableName("tbl_user")
@Accessors(chain = true)
@Data
public class UserEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("name")
    private String name;

    @TableField("age")
    private Integer age;

}
