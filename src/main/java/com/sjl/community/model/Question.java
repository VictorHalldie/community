package com.sjl.community.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author song
 * @create 2020/2/16 18:18
 */
@Data
public class Question implements Serializable {
    private Long id;
    private String title;
    private String description;
    private String tags;
    private Long gmtCreate;
    private Long gmtModified;
    private Long creator;
    private Integer commentCount;
    private Integer likeCount;
    private Integer viewCount;
}