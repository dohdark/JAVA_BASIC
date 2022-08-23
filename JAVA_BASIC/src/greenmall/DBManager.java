package greenmall;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {
	// 인스턴스의 주소를 저장하기 위한 참조 변수
	private static Connection conn;
	
	// Connection 관련 정보 상수
	private final static String DRIVER = "org.mariadb.jdbc.Driver";
	private final static String URL = "jdbc:mariadb://192.168.0.177:3306:green1";
	private final static String USER = "java1";
	private final static String PASS = "1234";
	
	// 반드시 생성자를 private으로 선언하여 은닉화 시킨다.
	// => 외부에서 객체생성을 하지 못하도록 막음
	private DBManager() {}// default 생성자
	
	public static Connection getConnection() {
		conn = null;
		if(conn == null) {
			try {
				// 1. 드라이버 로드
				Class.forName(DRIVER);
				// 2. Connection
				conn = DriverManager.getConnection(URL, USER, PASS);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return conn;
	}

}
