package service;

import java.sql.Connection;
import java.sql.SQLException;

import dao.DeptDao;
import domian.Dept;
import util.ConnectionProvider;

public class DeptSearchService {

	DeptDao dao;

	public DeptSearchService() {
		this.dao = new DeptDao();
	}
	
	// 검색 번호를 받고 어떤 Dept 정보를 저장하고 있는 객체를 반환
	public Dept searchDept(int deptno) {
		
		Connection conn =null;
		Dept dept = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			dept = dao.selectByDeptno(conn,deptno);
			
		} catch (SQLException e) {
			// 데이터베이스 연결실패
			e.printStackTrace();

		}

		return dept;
	}
	
	
	
}
