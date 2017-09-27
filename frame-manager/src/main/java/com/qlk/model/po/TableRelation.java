package com.qlk.model.po;
/**
 * 表约束
 * @author shuyun
 *
 */
public class TableRelation {
    private String relationId;

    private String tableModelId;

    private String relationName;

    private String relationType;

    private String relationValue;

    public String getRelationId() {
        return relationId;
    }

    public void setRelationId(String relationId) {
        this.relationId = relationId == null ? null : relationId.trim();
    }

    public String getTableModelId() {
        return tableModelId;
    }

    public void setTableModelId(String tableModelId) {
        this.tableModelId = tableModelId == null ? null : tableModelId.trim();
    }

    public String getRelationName() {
        return relationName;
    }

    public void setRelationName(String relationName) {
        this.relationName = relationName == null ? null : relationName.trim();
    }

    public String getRelationType() {
        return relationType;
    }

    public void setRelationType(String relationType) {
        this.relationType = relationType == null ? null : relationType.trim();
    }

    public String getRelationValue() {
        return relationValue;
    }

    public void setRelationValue(String relationValue) {
        this.relationValue = relationValue;
    }
}