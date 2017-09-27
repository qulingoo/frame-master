package com.qlk.model.po;

public class TableRelationType {
    private String relationTypeId;

    private String relationTypeName;

    private String relationTypeCode;

    public String getRelationTypeId() {
        return relationTypeId;
    }

    public void setRelationTypeId(String relationTypeId) {
        this.relationTypeId = relationTypeId == null ? null : relationTypeId.trim();
    }

    public String getRelationTypeName() {
        return relationTypeName;
    }

    public void setRelationTypeName(String relationTypeName) {
        this.relationTypeName = relationTypeName == null ? null : relationTypeName.trim();
    }

    public String getRelationTypeCode() {
        return relationTypeCode;
    }

    public void setRelationTypeCode(String relationTypeCode) {
        this.relationTypeCode = relationTypeCode == null ? null : relationTypeCode.trim();
    }
}