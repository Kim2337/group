package group.controller;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import group.domain.GroupDto;
import group.domain.deptDto;
import group.service.GroupService;

@Controller
/* @RequestMapping("/group") */
public class GroupController {
	@Autowired
	GroupService emp;
	
	@RequestMapping(value = "/group/groupinfo.do")
	public String emp() {
		return "group/groupInfo";
	}
	
	public void setEmp(GroupService emp) {
		this.emp = emp;
	}

	@RequestMapping(value = "/group/depts.do", method = RequestMethod.POST)
	public void deptList(HttpServletResponse resp) throws Exception{
		List<deptDto> list = emp.deptList();
		Gson json = new Gson();
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.print(json.toJson(list));
	
	}
	
	
	@RequestMapping(value = "/group/emps.do", method = RequestMethod.POST)
	@ResponseBody
	public String empList(int deptno) throws Exception{
		List<Map<String, Object>> list = emp.empList(deptno);
		Gson json = new Gson(); 
		return json.toJson(list);
	}
	
	
}
