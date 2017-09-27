package com.qlk.model.dao;

import java.util.List;

import com.qlk.model.po.TableField;

public interface TableFieldMapper {
	int delete(String id);

	int insert(TableField record);

	TableField findByID(String id);

	List<TableField> findByTableId(String tableId);

	int update(TableField record);

}