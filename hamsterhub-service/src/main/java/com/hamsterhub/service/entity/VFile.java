package com.hamsterhub.service.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("v_file")
public class VFile {
    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.ASSIGN_ID)
    private Long id;

    @TableField("TYPE")
    private Integer type;

    @TableField("NAME")
    private String name;

    @TableField("PARENT_ID")
    private Long parentId;

    @TableField("R_FILE_ID")
    private Long rFileId;

    @TableField("VERSION")
    private Integer version;

    @TableField("CREATED")
    private LocalDateTime created;

    @TableField("MODIFIED")
    private LocalDateTime modified;

    @TableField("ACCOUNT_ID")
    private Long accountID;

    @TableField("SIZE")
    private Long size;

    @TableField("STRATEGY_ID")
    private Long strategyId;

    @TableField("SHARE_TYPE")
    private Integer shareType;
}
