package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import domain.MemberBean;
import factory.DatabaseFactory;

public class MemberDAOImpl implements MemberDAO {

	private static MemberDAOImpl instance = new MemberDAOImpl();

	private MemberDAOImpl() {
	}

	public static MemberDAOImpl getInstance() {
		return instance;
	}

	@Override
	public void insertMember(MemberBean member) {
		try {
		 int rs =DatabaseFactory.
			createDatebase("oracle").
			getConnection().
			createStatement().
			executeUpdate(String.format(
					"INSERT INTO  member(id,name,pass,ssn)\n"
					+"VALUES('%s','%s','%s','%s')",
					member.getId(), member.getName(),
					member.getPass(), member.getSsn()));
		 if(rs==1) {
			 System.out.println("회원가입 성공!");
		 }else {
			 System.out.println("실패");
		 }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<MemberBean> selectAllMembers() {
		ArrayList<MemberBean> list = new ArrayList<>();
		try {
			
			String sql="";
			DatabaseFactory.
			createDatebase("oracle").
			getConnection().
			createStatement().
			executeQuery(sql);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public ArrayList<MemberBean> selectMembersbyname(String name) {
		ArrayList<MemberBean> list = new ArrayList<>();
		try {
			String sql ="";
			DatabaseFactory.
			createDatebase("oracle").
			getConnection().
			createStatement().
			executeQuery(sql);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public MemberBean selectMemberbyid(String id) {
		MemberBean member = null;
		try {
			ResultSet rs =DatabaseFactory.
			createDatebase("oracle").
			getConnection().
			createStatement().
			executeQuery(String.format("SELECT * FROM member\n" + 
					" WHERE id LIKE '%s'",id));
			System.out.println("ID : "+rs.getString("id"));
			while(rs.next()) { // 값이 있으면 true
				member = new MemberBean();
				member.setId(rs.getString("id"));
				member.setName(rs.getString("name"));
				member.setPass(rs.getString("pass"));
				member.setSsn(rs.getString("ssn"));
							}

		} catch (Exception e) {

		}
		return member;
	}

	@Override
	public int countMembers() {
		int count = 0;

		try {
			String sql ="";
			DatabaseFactory.createDatebase("oracle").
			getConnection().
			createStatement().
			executeQuery(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return count;
	}

	@Override
	public void updateMember(MemberBean member) {
		try {
			String sql ="";
			DatabaseFactory.createDatebase("oracle").
			getConnection().
			createStatement().
			executeUpdate(sql);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deleteMember(String id, String pass) {
		try {
			String sql ="";
			DatabaseFactory.
			createDatebase("oracle").
			getConnection().
			createStatement().
			executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public MemberBean existMember(String id) {
		MemberBean member = null;
		try {
			String sql = String.format("SELECT * FROM member WHERE id LIKE '%s'", id);
			System.out.println("로그인 쿼리: "+sql);
			ResultSet rs = DatabaseFactory.createDatebase("oracle")
			.getConnection()
			.createStatement()
			.executeQuery(sql);
			while(rs.next()) {
				member = new MemberBean();
				member.setId(rs.getString("id"));
				member.setName(rs.getString("name"));
				member.setPass(rs.getString("pass"));
				member.setSsn(rs.getString("ssn"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("로그인한 정보: "+member.toString());
		return member;
	/*	ResultSet rs = DatabaseFactory.
		createDatebase("oracle").
		getConnection().
		createStatement().
		executeQuery();
		
		while(rs.next()) {
			MemberBean member = new MemberBean();
			member.setId(rs.getString("id"));
			member.setPass(rs.getString("pass"));
		}
		
		return null;*/
	}

}
