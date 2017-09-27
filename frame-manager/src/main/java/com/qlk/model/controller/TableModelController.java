package com.qlk.model.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.qlk.model.po.TableModel;

@Controller
@RequestMapping("tableModel")
public class TableModelController {

	@RequestMapping(method = RequestMethod.POST,value= "/delete/{id}")
	public int delete(@PathVariable("id")String id) {
		return 0;
	}

	public int insert(TableModel record) {
		return 0;
	}

	public TableModel findByID(String id) {
		return null;
	}

	public List<TableModel> findAll() {
		return null;
	}

	public int update(TableModel record) {
		return 0;
	}
}
