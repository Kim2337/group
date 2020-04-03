package group.persistence;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import group.domain.GroupDto;
import group.domain.deptDto;

public class GroupDao extends SqlSessionDaoSupport {

	//부서 선택해서 정보 가져오기 
	public List<deptDto> deptList(){
		return getSqlSession().selectList("groupMappers.depts");
	}
	
	//부서에 속한 사원 정보 가져오기 
	public List<Map<String,Object>> empList(int deptno){
		return getSqlSession().selectList("groupMappers.emps", deptno);
	}
	
}
