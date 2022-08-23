package greenmall;

import java.sql.Connection;
import java.sql.Statement;

// createStatement()방식
// : SQL문에 값을 하드코딩하여 직접변경하지 않고는 수정불가!!
// : => 그래서 PreparedStatement 방식을 사용함!
public class JDBCEx01 {
	public static void main(String[] args) {
		try {
			Connection conn = DBManager.getConnection();
			System.out.println("접속 성공!!!");
			
			Statement st = conn.createStatement();
			String sql = "INSERT INTO green1.tbl_study(id, name, age) VALUES('5', '미경', '24')";
			
			int result = st.executeUpdate(sql);
			if(result > 0) {
				System.out.println("등록 성공");
			} else {
				System.out.println("등록 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
		}
	}

}
