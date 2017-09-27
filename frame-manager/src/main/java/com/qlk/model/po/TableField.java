package com.qlk.model.po;

import java.util.Date;
 
public class TableField {
    private String id;

    private String tableModelId;

    private String fieldNameChn;

    private String fieldNameEng;

    private Integer type;

    private Integer length;

    private Integer accuracy;

    private Integer dindex;

    private Date createTime;

    private Date changeTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTableModelId() {
        return tableModelId;
    }

    public void setTableModelId(String tableModelId) {
        this.tableModelId = tableModelId == null ? null : tableModelId.trim();
    }

    public String getFieldNameChn() {
        return fieldNameChn;
    }

    public void setFieldNameChn(String fieldNameChn) {
        this.fieldNameChn = fieldNameChn == null ? null : fieldNameChn.trim();
    }

    public String getFieldNameEng() {
        return fieldNameEng;
    }

    public void setFieldNameEng(String fieldNameEng) {
        this.fieldNameEng = fieldNameEng == null ? null : fieldNameEng.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Integer accuracy) {
        this.accuracy = accuracy;
    }

    public Integer getDindex() {
        return dindex;
    }

    public void setDindex(Integer dindex) {
        this.dindex = dindex;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }
}