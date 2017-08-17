package com.atguigu.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.atguigu.crud.bean.Department;
import com.atguigu.crud.bean.Msg;
import com.atguigu.crud.service.DepartmentService;

/**
 * 处理和部门有关的请求
 * @author wp
 *
 */
@Controller
public class DepartmentController {

	@Autowired
	private DepartmentService  departmentService;
	/**
	 * 返回所有的部门信息
	 */
	
	@RequestMapping("/depts")
	@ResponseBody
	public Msg getDepts(){
		//查出所有的部门信息
		System.out.println("111");
		List<Department> list = departmentService.getDepts();
		System.out.println("111");
		return Msg.success().add("depts",list);
	}
}