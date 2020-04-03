package spring.service;

import java.sql.SQLException;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import spring.model.MemDto;

public class MemDao extends SqlSessionDaoSupport {

	public int insert(MemDto dto) {
		int i = 0;
		try {
			i = getSqlSession().insert("member.addMember", dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

}




