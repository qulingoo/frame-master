package com.qlk.model.bize;

import java.util.List;

import com.qlk.model.po.TableModel;

public interface ITableModelBize {
	int delete(String id);

	int insert(TableModel record);

	TableModel findByID(String id);

	List<TableModel> findAll();

	int update(TableModel record);
}
