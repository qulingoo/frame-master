package com.qlk.model.dao;

import java.util.List;

import com.qlk.model.po.TableRelation;

public interface TableRelationMapper {
	int delete(String relationId);

	int insert(TableRelation record);

	TableRelation findByID(String relationId);

	List<TableRelation> findByTableID(String tableId);

	int update(TableRelation record);

}