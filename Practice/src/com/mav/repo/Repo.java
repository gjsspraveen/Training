package com.mav.repo; // Model Class

public class Repo {
	private String empid;
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getDeptcode() {
		return deptcode;
	}
	public void setDeptcode(String deptcode) {
		this.deptcode = deptcode;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	public String getPsw_repeat() {
		return psw_repeat;
	}
	public void setPsw_repeat(String psw_repeat) {
		this.psw_repeat = psw_repeat;
	}
	private String empname;
	private String deptcode;
	private String doj;
	private String psw;
	private String psw_repeat;
	
	
	

}
