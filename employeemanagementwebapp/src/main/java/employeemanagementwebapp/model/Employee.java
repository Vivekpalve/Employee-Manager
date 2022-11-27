

package employeemanagementwebapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int eid;
	private String eName;
	private String dOJ;
	private int yOJ;
	private String designation;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getdOJ() {
		return dOJ;
	}
	public void setdOJ(String dOJ) {
		this.dOJ = dOJ;
	}
	public int getyOJ() {
		return yOJ;
	}
	public void setyOJ(int yOJ) {
		this.yOJ = yOJ;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Employee(int eid, String eName, String dOJ, int yOJ, String designation) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.dOJ = dOJ;
		this.yOJ = yOJ;
		this.designation = designation;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", eName=" + eName + ", dOJ=" + dOJ + ", yOJ=" + yOJ + ", designation="
				+ designation + "]";
	}
	
	
	
}
