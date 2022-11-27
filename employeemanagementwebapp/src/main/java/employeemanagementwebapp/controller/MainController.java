package employeemanagementwebapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import employeemanagementwebapp.dao.EmpDao;
import employeemanagementwebapp.model.Employee;

@Controller
public class MainController {

	@Autowired
	private EmpDao empDao;
	
	
	@RequestMapping("/") 
	public String home(Model model) {
		List<Employee> employees = empDao.getEmployees();
		model.addAttribute("employees",employees);
		return "index";
	}
	
	//show add employee form
	@RequestMapping("/add-employee")
	public String addEmployee(Model model) {
		
		model.addAttribute("title" ,"ADD Employee");
		return "add_employee_form";
	}
	
	//handle add employee form
	@RequestMapping(value="/handle-employee",method= RequestMethod.POST)
	public RedirectView handleEmployee(@ModelAttribute Employee employee,HttpServletRequest request) {
		empDao.CreateEmp(employee);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() +"/");
		return redirectView;
	}
	//deleting Employee info
	@RequestMapping("/delete/{empId}")
	public RedirectView deleteProduct(@PathVariable("empId") int empId,HttpServletRequest request) {
		this.empDao.deleteEmployee(empId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() +"/");
		return redirectView;
	}
	
	@RequestMapping("/update/{empId}")
	public String updateForm(@PathVariable("empId") int empId, Model m) {
		Employee emp = this.empDao.getEmployee(empId);
		m.addAttribute("emp" ,emp);
		return "update_form";
	}
}
