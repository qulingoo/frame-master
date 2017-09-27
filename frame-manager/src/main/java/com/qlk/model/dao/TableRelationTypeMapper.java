package com.qlk.model.dao;

import java.util.List;

import com.qlk.model.po.TableRelationType;

public interface TableRelationTypeMapper {
	int delete(String relationTypeId);

	int insert(TableRelationType record);

	TableRelationType findByID(String relationTypeId);

	List<TableRelationType> findAll();

	int update(TableRelationType record);
}