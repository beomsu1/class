package todo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.internal.compiler.batch.Main;

import todo.domain.TodoDTO;
import todo.util.ConnectionProvider;

public class TodoDAO {

	// 싱글톤
	// 1. private 생성자
	private TodoDAO() {

	}

	// 2. 내부에서 TodoDAO 인스턴스 생성 -> private static
	private static TodoDAO dao = new TodoDAO();

	// 3. 외부에서 TodoDAO의 참조값을 얻어갈 수 있는 메소드 -> public static
	public static TodoDAO getInstance() {
		return dao;
	}

	// TodoDTO 리스트를 반환하는 메소드
	public List<TodoDTO> selectByAll(Connection conn) {

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<TodoDTO> list = null;

		// SQL
		String sql = "select* from tbl_todo";

		// PreparedStatement
		try {
			pstmt = conn.prepareStatement(sql);

			// 결과 받기
			rs = pstmt.executeQuery(); // select에만 사용 executeQuery

			list = new ArrayList<TodoDTO>();

			// while문 사용해서 반복처리
			while (rs.next()) {
				int tno = rs.getInt("tno");
				String todo = rs.getString("todo");
				String duedate = rs.getString("duedate");
				boolean finished = rs.getBoolean("finished");

				TodoDTO dto = new TodoDTO(tno, todo, duedate, finished);

				list.add(dto); // 반복하면서 list에 dto값을 추가
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

			// ResultSet
			// List<TodoDTO>에 저장 후 반환

			return list;
		}
		
		
		
	}
	
	public static void main(String[] args) throws SQLException {
		
		TodoDAO dao = TodoDAO.getInstance();
		Connection conn = ConnectionProvider.getConnection();
		
		List<TodoDTO> list = dao.selectByAll(conn);
		for(TodoDTO todo : list) {
			System.out.println(todo);
		}
		conn.close();
	}
}

