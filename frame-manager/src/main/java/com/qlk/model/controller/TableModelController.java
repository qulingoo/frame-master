package com.qlk.model.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qlk.model.po.TableModel;

@Controller
@RequestMapping("/tableModel")
public class TableModelController {
	@ResponseBody
	@RequestMapping( "/delete" )
	public int delete(  String id) {
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
