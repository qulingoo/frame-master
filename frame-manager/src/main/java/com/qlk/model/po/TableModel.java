package com.qlk.model.po;

import java.util.Date;

public class TableModel {
    private String id;

    private String tableNameChn;

    private String tableNameEng;

    private String pkgId;

    private Integer dindex;

    private Date createTime;

    private Date changeTime;

    private String describes;

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