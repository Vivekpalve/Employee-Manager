package employeemanagementwebapp.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import employeemanagementwebapp.model.Employee;

@Component
public class EmpDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	//Creating employee
	@Transactional
	public void CreateEmp(Employee employee) {
		
		
		this.hibernateTemplate.saveOrUpdate(employee);
	}
	
	//Get All Products
	public List<Employee> getEmployees(){
		
		List<Employee> employees = this.hibernateTemplate.loadAll(Employee.class);
		return employees;
	} 
	
	//delete the single employee
	@Transactional
	public void deleteEmployee(int eid) {
		Employee p = this.hibernateTemplate.load(Employee.class, eid);
		this.hibernateTemplate.delete(p);
	}
	
	
	//get the single employee
	public Employee getEmployee(int eid) {
		return this.hibernateTemplate.get(Employee.class, eid);
	}
}
