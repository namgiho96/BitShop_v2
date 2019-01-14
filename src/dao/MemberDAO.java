package dao;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberDAO {

	public void insertMember(MemberBean member);

	public ArrayList<MemberBean> selectAllMembers();

	public ArrayList<MemberBean> selectMembersbyname(String name);

	public MemberBean selectMemberbyid(String id);

	public int countMembers();
	
	public MemberBean existMember(String id);

	public void updateMember(MemberBean member);

	public void deleteMember(String id,String pass);
}
