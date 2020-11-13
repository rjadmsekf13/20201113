package com.mh.org.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mh.org.bean.Member;
import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

// 제어문 ... 함수호출... 객체 사용... 
public class DBManager {

	public Member selectOne(String idx) {
		Member member = new Member();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.90:1521:xe", "scott", "1234");
			pstmt = conn.prepareStatement("select * from memberchap04 where idx=?");
			pstmt.setInt(1, Integer.parseInt(idx));
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				member.setIdx(rs.getString("idx"));
				member.setPaddr(rs.getString("addr"));
				member.setPcpwd(rs.getString("cpwd"));
				member.setPemail(rs.getString("email"));
				member.setPgender(rs.getString("gender"));
				member.setPhobby(rs.getString("hobby"));
				member.setPid(rs.getString("id"));
				member.setPname(rs.getString("name"));
				member.setPphone(rs.getString("phone"));
				member.setPpwd(rs.getString("pwd"));
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(conn!=null) conn.close();
				if(pstmt!=null) pstmt.close();
			}catch (Exception e) {
			}
		}
		
		return member;
	}
	
	public void insert(Member member) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.90:1521:xe", "scott", "1234");
			pstmt = conn.prepareStatement("INSERT INTO memberChap04" + 
					"(IDX, NAME, GENDER, ID, PWD, CPWD, ADDR, PHONE, EMAIL, HOBBY, REG_DATE)  " + 
					"VALUES ((select nvl(max(idx)+1,1) from memberchap04), ?, ?, ?, ?, ?, ?, ?, ?, ?,sysdate)");
			
//			pstmt.setString(1, "1");
			
			pstmt.setString(1, member.getPname());
			pstmt.setString(2, member.getPgender());
			pstmt.setString(3, member.getPid());
			pstmt.setString(4, member.getPpwd());
			pstmt.setString(5, member.getPcpwd());
			pstmt.setString(6, member.getPaddr());
			pstmt.setString(7, member.getPphone());
			pstmt.setString(8, member.getPemail());
			pstmt.setString(9, member.getPhobby());
			
			pstmt.executeUpdate();
			System.out.println("완료");
			
		}catch (Exception e) {
			System.out.println("안됨");
			e.printStackTrace();
		}
		finally {
			try {
				if(pstmt != null ) pstmt.close();
				if(conn != null ) conn.close();
			}catch (Exception e) {
			}
		}
		
	}

	public ArrayList<Member> select(){
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;	// select 해서 반환되는 table 내용 담는 객체
		ArrayList<Member> al = new ArrayList<Member>(); // rs 내용을 바꿔서 arraylist 에 담는 객체
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");	// ojdbc6.jar 추가 되어 있는지
			// db 연결 하는 것
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.90:1521:xe", "scott", "1234");
			pstmt = conn.prepareStatement("select * from memberchap04 order by reg_date desc");
			// select -> executeQuery() 
			// insert update delete -> executeUpdate()
			rs = pstmt.executeQuery();
			int i =1;
			while(rs.next()) {	// 그다음 행이 있으면 true 없으면 false
//				System.out.println(i++);
				Member temp = new Member();
				temp.setIdx(rs.getString("idx"));
				temp.setPaddr(rs.getString("addr"));
				temp.setPcpwd(rs.getString("cpwd"));
				temp.setPemail(rs.getString("email"));
				temp.setPgender(rs.getString("gender"));
				temp.setPhobby(rs.getString("hobby"));
				temp.setPid(rs.getString("id"));
				temp.setPname(rs.getString("name"));
				temp.setPphone(rs.getString("phone"));
				temp.setPpwd(rs.getString("pwd"));
				System.out.println(temp);
				al.add(temp);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			}catch (Exception e) {
			}
		}
		
		return al;
	}
	
	// alter table memberchap04 add idx numeric(4) 컬럼 추가... sql 구문...
	public void defualt() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.90:1521:xe", "scott", "1234");
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(conn!=null) conn.close();
				if(pstmt!=null) pstmt.close();
			}catch (Exception e) {
			}
		}
	}

	public void delete(String idx) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.90:1521:xe", "scott", "1234");
			pstmt = conn.prepareStatement("delete from  memberchap04 where idx=?");
			pstmt.setInt(1, Integer.parseInt(idx));
			pstmt.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(conn!=null) conn.close();
				if(pstmt!=null) pstmt.close();
			}catch (Exception e) {
			}
		}
	}
	
	public boolean checkLogin(String id, String pw)
	{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.90:1521:xe", "scott", "1234");
			pstmt = conn.prepareStatement("select * from  memberchap04 where id = ? and pw = ?");
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			if(rs.next())
				return true;
			else
				return false;
		}catch (Exception e) {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch (Exception ex) {
				
			}
		}
		finally {
			
		}
		return false;
	}
}


















