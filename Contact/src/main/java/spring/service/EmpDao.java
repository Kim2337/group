package spring.service;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import spring.model.DeptDto;
import spring.model.EmpDto;

public class EmpDao extends SqlSessionDaoSupport{

	
	//부서 선택 
	public List<DeptDto> selectDepts(){
		return getSqlSession().selectList("scott.depts");
	}
	
	//사원 선택 
	public List<Map<String,Object>> selectEmps(int deptno){
		return getSqlSession().selectList("scott.emps", deptno);
	}
	
	//사원 한명 선택
	public EmpDto selectEmpOne(int empno){
		return getSqlSession().selectOne("scott.empOne", empno);
	}
	public List<String> selectNames(){
		return getSqlSession().selectList("scott.empNames");
	}
	
	
}
