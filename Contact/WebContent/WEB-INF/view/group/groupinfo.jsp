<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>

<!DOCTYPE html>
<html>
<head>
<title>조직 정보</title>
<script src="https://code.jquery.com/jquery-3.1.0.min.js"></script>

<script>
$(function(){
	
	var url="depts.do";
	
	$.ajax({
		type:"post"		// 포스트방식
		,url:url		// url 주소
		,dataType:"json" })
		.done(function(args){	//응답이 성공 상태 코드를 반환하면 호출되는 함수
			 for(var i=0; i < args.length; i++) {
				 $("#dept").append("<option value='"+args[i].deptno+"'>"+args[i].dname+"</option>");
				// $("#dept").append("<option value='"+args[i]+"'>"+args[i]+"</option>");
			 }
 			})
	    .fail(function(e) {
	    	alert(e.responseText);
	    })
});//ready 끝

function deptList(){
	var deptno=$("#dept").val();
	
	if(deptno=="") {	                
		$("#emp option").each(function() {	
			$("#emp option:eq(1)").remove();	
		});
		return;
	}
	
	var url="emps.do";
	var params="deptno="+deptno;//deptno=20
	
	$.ajax({
		type:"post"
		,url:url	
		,data:params
		,dataType:"json"})
		.done(function(args){
			$("#emp option").each(function() {	
				$("#emp option:eq(0)").remove();
			});

			 $("#emp").append("<option value=''>::사원선택::</option>");
			 
			 for(var idx=0; idx<args.length; idx++) {	
				 $("#emp").append("<option value='"+args[idx].empno+"'>"+args[idx].ename+"</option>");	
			 } 
		})
	    .fail(function(e) {
	    	alert(e.responseText);
	    });	
	
}

function empList(){
	var deptno=$("#dept").val();
	
	if(deptno=="") {	                
		$("#emp option").each(function() {	
			$("#emp option:eq(1)").remove();	
		});
		return;
	}
	
	var url="emp.do";
	var params="deptno="+deptno;//deptno=20
	
	$.ajax({
		type:"post"
		,url:url	
		,data:params
		,dataType:"json"})
		.done(function(args){
		
			var deptno = "부서번호 : "+args.deptno+"<br>";
			var dname = "부서명 : "+args.comm+"<br>";
			var username = "사원 이름 : "+args.username+"<br>";
			var level = "직급 : "+args.level+"<br>";
			var useremail = "이메일 : "+args.useremail+"<br>";
			var userphonenum = "전화번호 : "+args.userphonenum+"<br>";
			
			$("#groupInfo").text("");//기존 내용 제거
			$("#groupInfo").html(deptno+dname+username+level+useremail+userphonenum);
		})
	    .fail(function(e) {
	    	alert(e.responseText);
	    });	
	
}
/* function selecEmp(){
	var empno=$("#emp").val();

	var url="empOne.do";
	var params="empno="+empno;

	$.ajax({
		type:"post"
		,url:url	
		,data:params
		,dataType:"json"})
		.done(function(args){
		
			var deptno = "부서번호 : "+args.deptno+"<br>";
			var dname = "부서명 : "+args.comm+"<br>";
			var username = "사원 이름 : "+args.username+"<br>";
			var level = "직급 : "+args.level+"<br>";
			var useremail = "이메일 : "+args.useremail+"<br>";
			var userphonenum = "전화번호 : "+args.userphonenum+"<br>";
			
			$("#groupInfo").text("");//기존 내용 제거
			$("#groupInfo").html(deptno+dname+username+level+useremail+userphonenum);
		})
	    .fail(function(e) {
	    	alert(e.responseText);
	    });	
} */

</script>

</head>
<body>
뭐라도 떠야할거 아녀<br>
<select id="dept" onchange="deptList()">	<!-- onchange로 선택이 될때마다 cityList()실행 -->
  <option value="">::부서선택::</option>
</select>

<select id="emp" onchange="empList()">
  <option value="">::사원선택::</option>
</select>

<hr>
<div id="groupInfo">

</div>
</body>
</html>