package com.qlk.model.dao;

import java.util.List;

import com.qlk.model.po.TableModel;

public interface TableModelMapper {
	int delete(String id);

	int insert(TableModel record);

	TableModel findById(String id);

	List<TableModel> findAll();

	int update(TableModel record);

}