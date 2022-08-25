package greenmall;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ProductDAO {
	Scanner sc = new Scanner(System.in);
	Connection conn = null;
	// 1. 제품 등록
	public void productInsert() {
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒ 등록하고 싶은 제품의 정보를 입력하세요.");
		// 제품번호, 제품명, 가격, 등록일자
		System.out.print("▒▒ 제품 번호 >> ");
		int pno = sc.nextInt();
		System.out.print("▒▒ 제품 명 >> ");
		sc.nextLine();
		String pname = sc.nextLine();
		System.out.print("▒▒ 가격 >> ");
		int price = sc.nextInt();
		
		// 1.Connection : JAVA - DB 다리역할
		// 2.SQL : 일꾼에게 시킬 명령
		// 3.pstmt : 일꾼을 생성
		// 4.execute : 일꾼에게 SQL 명령을 실행
		
		try {
			
			conn = DBManager.getConnection();
			String sql = "INSERT INTO green1.tbl_product(pno, pname, price) "
					   + "VALUES(?, ?, ?) ";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pno);
			pstmt.setString(2, pname);
			pstmt.setInt(3, price);
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("▒▒" + pname + "제품을 등록하였습니다.");
			} else {
				System.out.println("▒▒제품 등록에 실패하였습니다. 관리자에게 문의하세요.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		
//		System.out.println(pno + ", "+ pname + ", " + price);
				
	}
	
	// 2. 제품 삭제
	public void productDelete() {
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒ 삭제하고 싶은 제품의 정보를 입력하세요.");
		
		System.out.println("제품 번호 >>");
		int pno = sc.nextInt();
		
		try {
			conn = DBManager.getConnection();
			String sql = "DELETE FROM green1.tbl_product "
					+ "WHERE pno = ? ";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pno);
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("삭제 성공");
			} else {
				System.out.println("삭제 실패");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	// 3. 제품 조회
	public void productSelect() {
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒ 총 ?건의 제품이 조회되었습니다.");
		
		try {
			conn = DBManager.getConnection();
			String sql = "SELECT * FROM green1.tbl_product " ;
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			int count = 0;
			while(rs.next()) {
				int pno = rs.getInt("pno");
				String pname = rs.getString("pname");
				int price = rs.getInt("price");
				Date regdate = rs.getDate("regdate");
				
				System.out.println(pno + ", " + pname + ", " + price + ", " + regdate);
				count++;
			}
			System.out.println("▒ 총" + count + "건의 제품이 조회되었습니다. " );
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
		}
		
		
	}
	// 4. 제품 검색
	public void productSearch() {
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒ 검색하고 싶은 제품번호 또는 제품명을 입력하세요.");
		System.out.println("키워드 >> ");
		String keyword = sc.nextLine();
		
		try {
			conn = DBManager.getConnection();
			String sql = "SELECT * FROM green1.tbl_product "
					+ "WHERE pname LIKE ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + keyword + "%");
			ResultSet rs = pstmt.executeQuery();
			
			int count = 0;
			while(rs.next()) {
				int pno = rs.getInt("pno");
				String pname = rs.getString("pname");
				int price = rs.getInt("price");
				Date regdate = rs.getDate("regdate");
				
				System.out.println(pno + ", " + pname + ", " + price + ", " + regdate);
				count++;
			}
			
			System.out.println("▒ 총" + count + "건의 제품이 검색 되었습니다.");
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		
		
	}
	
}
















