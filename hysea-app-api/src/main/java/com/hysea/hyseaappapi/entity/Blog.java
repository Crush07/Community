package com.hysea.hyseaappapi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Blog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增唯一标识
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private String title;

    /**
     * 
     */
    private Integer userId;

    /**
     * 
     */
    private Integer pageviews;

    /**
     * 
     */
    private String content;

    /**
     * 
     */
    private Integer commentId;

    /**
     * 
     */
    private String tag;

    /**
     * 
     */
    private Date createTime;


    private Integer likeNum;

}