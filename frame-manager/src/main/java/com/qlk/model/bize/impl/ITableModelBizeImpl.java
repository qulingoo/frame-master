package com.qlk.model.bize.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.qlk.model.bize.ITableModelBize;
import com.qlk.model.dao.TableModelMapper;
import com.qlk.model.po.TableModel;

public class ITableModelBizeImpl implements ITableModelBize {
	@Autowired
	private TableModelMapper tableModelMapper;

	@Override
	public int delete(String id) {
		return tableModelMapper.delete(id);
	}

	@Override
	public int insert(TableModel record) {
		return tableModelMapper.insert(record);
	}

	@Override
	public TableModel findByID(String id) {
		return tableModelMapper.findByID(id);
	}

	@Override
	public List<TableModel> findAll() {
		return tableModelMapper.findAll();
	}

	@Override
	public int update(TableModel record) {
		return tableModelMapper.update(record);
	}

}
