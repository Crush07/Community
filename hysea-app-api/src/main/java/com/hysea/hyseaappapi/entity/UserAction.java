package com.hysea.hyseaappapi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserAction implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增唯一标识
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private Integer userId;

    /**
     * 1 博客 2 帖子
     */
    private Integer type;

    /**
     * 博客id或帖子id
     */
    private Integer objectId;

    /**
     * 1 点赞 2 收藏
     */
    private Integer action;

}