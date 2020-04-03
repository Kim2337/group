package spring.model;

import java.util.Date;

public class EmpDto {
	private String username; 
	private String level;
	private int deptno; 
	private String useremail;
	private String userphonenum;
	private String dname;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getUserphonenum() {
		return userphonenum;
	}
	public void setUserphonenum(String userphonenum) {
		this.userphonenum = userphonenum;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "GroupDto [username=" + username + ", level=" + level + ", deptno=" + deptno + ", useremail=" + useremail
				+ ", userphonenum=" + userphonenum + ", dname=" + dname + "]";
	}
	
	
	/*
	 * int empno; String ename; String job; int mgr; Date hiredate; double sal;
	 * double comm; int deptno; public int getEmpno() { return empno; } public void
	 * setEmpno(int empno) { this.empno = empno; } public String getEname() { return
	 * ename; } public void setEname(String ename) { this.ename = ename; } public
	 * String getJob() { return job; } public void setJob(String job) { this.job =
	 * job; } public int getMgr() { return mgr; } public void setMgr(int mgr) {
	 * this.mgr = mgr; } public Date getHiredate() { return hiredate; } public void
	 * setHiredate(Date hiredate) { this.hiredate = hiredate; } public double
	 * getSal() { return sal; } public void setSal(double sal) { this.sal = sal; }
	 * public double getComm() { return comm; } public void setComm(double comm) {
	 * this.comm = comm; } public int getDeptno() { return deptno; } public void
	 * setDeptno(int deptno) { this.deptno = deptno; }
	 * 
	 */
}
