package com.itmuch.usercenter.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @TableField("wx_id")
    private String wxId;

    @TableField("wx_nickname")
    private String wxNickname;

    @TableField("roles")
    private String roles;

    @TableField("avatar_url")
    private String avatarUrl;

    @TableField("create_time")
    private Date createTime;

    @TableField("update_time")
    private Date updateTime;

    @TableField("bonus")
    private String bonus;

}
