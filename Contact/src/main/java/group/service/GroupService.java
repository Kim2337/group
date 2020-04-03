package group.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import group.domain.GroupDto;
import group.domain.deptDto;
import group.persistence.GroupDao;

@Service
public class GroupService {
	
	GroupDao dao;
	
	@Autowired
	public void setDao(GroupDao dao) {
		this.dao = dao;
	}
	
	//부서선택
	public List<deptDto> deptList(){
		return dao.deptList();
	}
	
	//사원선택
	public List<Map<String,Object>> empList(int deptno){
		return dao.empList(deptno);
	}
	
	
	

}
