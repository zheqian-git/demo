package com.example.demo.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 公益学堂
 * </p>
 *
 * @author qianzz
 * @since 2021-06-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CharitySchool implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 图片url
     */
    private String imageUrl;

    /**
     * 课堂名称
     */
    private String className;

    /**
     * 课堂日期
     */
    private String classDate;

    /**
     * 课堂时间
     */
    private String classTime;

    /**
     * 课堂地点
     */
    private String classLocation;

    /**
     * 课程详情
     */
    private String classDetail;

    /**
     * 报名开始时间
     */
    private LocalDateTime startTime;

    /**
     * 报名结束时间
     */
    private LocalDateTime endTime;

    /**
     * 状态 0-编辑中、1-上线、2-下线
     */
    private String status;

    /**
     * 创建时间
     */
    private LocalDateTime gmtCreate;

    /**
     * 修改时间
     */
    private LocalDateTime gmtModify;


}
