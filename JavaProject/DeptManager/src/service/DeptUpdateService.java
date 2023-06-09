package service;

import java.sql.Connection;
import java.sql.SQLException;

import dao.DeptDao;
import domian.Dept;
import util.ConnectionProvider;

public class DeptUpdateService {

	DeptDao dao;
	
	// 싱글톤 시작
	private DeptUpdateService() {
		this.dao = DeptDao.getInstance();
	}

	private static DeptUpdateService service = new DeptUpdateService();
	
	public static DeptUpdateService getInstance() {
		return service;
	}
	// 싱글톤 끝
	
	public int updateDept(Dept newDept) {

		Connection conn = null;
		int result = 0;

		try {
			conn = ConnectionProvider.getConnection();

			result = dao.UpdateDeptByDeptno(conn, newDept);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		return result;

	}

}
