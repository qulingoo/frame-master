package com.qlk.model.po;

import java.util.Date;
/**
 * 表模型
 * @author qlk
 *
 */
public class TableModel {
    private String id;//编号

    private String tableNameChn;//表中文名

    private String tableNameEng;//表英文名

    private String pkgId;//包编号

    private Integer dindex;//序号

    private Date createTime;//创建时间

    private Date changeTime;//修改时间

    private String describes;//描述

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTableNameChn() {
        return tableNameChn;
    }

    public void setTableNameChn(String tableNameChn) {
        this.tableNameChn = tableNameChn == null ? null : tableNameChn.trim();
    }

    public String getTableNameEng() {
        return tableNameEng;
    }

    public void setTableNameEng(String tableNameEng) {
        this.tableNameEng = tableNameEng == null ? null : tableNameEng.trim();
    }

    public String getPkgId() {
        return pkgId;
    }

    public void setPkgId(String pkgId) {
        this.pkgId = pkgId == null ? null : pkgId.trim();
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

    public String getDescribes() {
        return describes;
    }

    public void setDescribes(String describes) {
        this.describes = describes == null ? null : describes.trim();
    }
}