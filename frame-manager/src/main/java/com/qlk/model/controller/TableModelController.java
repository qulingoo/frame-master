package com.qlk.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qlk.model.bize.ITableModelBize;
import com.qlk.model.po.TableModel;

@Controller
@RequestMapping("/tableModel")
public class TableModelController {
	@Autowired
	private ITableModelBize iTableModelBize;
	@ResponseBody
	@RequestMapping( "/delete" )
	public int delete(  String id) {
		return 0;
	}
	@ResponseBody
	@RequestMapping( "/insert" )
	public int insert(TableModel record) {
		return 0;
	}
	@ResponseBody
	@RequestMapping( "/findByID" )
	public TableModel findByID(String id) {
		return null;
	}
	@ResponseBody
	@RequestMapping( "/findAll" )
	public List<TableModel> findAll() {
		return null;
	}
	@ResponseBody
	@RequestMapping( "/update" )
	public int update(TableModel record) {
		return 0;
	}
}
