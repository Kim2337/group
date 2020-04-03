package spring.controller;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import spring.model.DeptDto;
import spring.model.EmpDto;
import spring.service.EmpService;

@Controller
public class EmpController {

	@Autowired
	EmpService emp;

	@RequestMapping(value = "/emp/empInfo.do")
	public String emp() {
		return "emp/empInfo";
	}

	@RequestMapping(value = "/emp/depts.do", method = RequestMethod.POST)
	public void deptList(HttpServletResponse resp) throws Exception {
		List<DeptDto> list = emp.selectDepts();
		Gson json = new Gson(); // JASON 객체생성
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.print(json.toJson(list)); // out.print 내용을 ajax의 dataType이 jason에게 데이터 쏴줌
	}

	@RequestMapping(value = "/emp/emps.do", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
	@ResponseBody
	public String empList(int deptno) throws Exception {
		List<Map<String,Object>> list = emp.selectEmps(deptno);
		Gson json = new Gson(); 
		return json.toJson(list);
	}

	@RequestMapping(value = "/emp/empOne.do", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
	@ResponseBody
	public String empOne(int empno) throws Exception {
		EmpDto empOne = emp.selectEmpOne(empno);
		Gson json = new Gson(); 
		return json.toJson(empOne);
	}

	public void setEmp(EmpService emp) {
		this.emp = emp;
	}

}
