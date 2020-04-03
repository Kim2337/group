package group.domain;

public class GroupDto {
	//이름, 부서, 직급, 이메일, 핸드폰 번호, 부서명 form employee테이블  
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
	
	
	
	
}
