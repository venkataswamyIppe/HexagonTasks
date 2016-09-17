package com.hexagon.spring.jpa.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hexagon.spring.jpa.dao.EmployeeDaoImpl;
import com.hexagon.spring.jpa.model.Employee;
import com.hexagon.spring.jpa.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	/*
	 * here matching with respective url pattern and open their respective view
	 * pages
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute("command") Employee employee, BindingResult result) {
		employeeService.addEmployee(employee);
		return new ModelAndView("addSuccess");
	}
	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public ModelAndView EmployeesList() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("employees", employeeService.EmployeesList());
		return new ModelAndView("employeesList", model);
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addEmployee(@ModelAttribute("command") Employee employee, BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		return new ModelAndView("addEmployee", model);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView welcome() {
		return new ModelAndView("index");
	}

	@RequestMapping(value = "/editOP", method = RequestMethod.GET)
	public ModelAndView editEmployee(@ModelAttribute("command") Employee employee, BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("employees",employeeService.EmployeesList());
		return new ModelAndView("updateEmployee", model);
	}

	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView EmployeetDataUpdate(@RequestParam(value="id",required=true) int id,@ModelAttribute("command") Employee employee, BindingResult result) {
		System.out.println(id);
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("employee",employeeService.getEmployee(id));
		return new ModelAndView("update",model);
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView updateEmployee(@ModelAttribute("command") Employee employee, BindingResult result) {
		employeeService.editEmployee(employee);
		return new ModelAndView("updateSuccess");
	}
	@RequestMapping(value = "/deleteOP", method = RequestMethod.GET)
	public ModelAndView deleteStudentData(@ModelAttribute("command") Employee employee, BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("employees",employeeService.EmployeesList());
		return new ModelAndView("deleteEmployee", model);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView deleteEmployee(@RequestParam(value="id",required=true) int id) {
		employeeService.deleteEmployee(id);
		return new ModelAndView("deleteSuccess");
	}
	
}