package service;

import java.util.ArrayList;
import dao.MemberDAOImpl;
import domain.MemberBean;

public class MemberServiceImpl implements MemberService {

	private static MemberServiceImpl instance = new MemberServiceImpl();

	private MemberServiceImpl() {
		dao = MemberDAOImpl.getInstance();
	}

	public static MemberServiceImpl getInstance() {
		return instance;
	}

	MemberDAOImpl dao;

	@Override
	public void crateMember(MemberBean bean) {
		System.out.println("멤버서비스 조인에 진입");
		dao.insertMember(bean);
	}

	@Override
	public ArrayList<MemberBean> findAllMembers() {
		ArrayList<MemberBean> list = new ArrayList<>();
		return list;
	}

	@Override
	public ArrayList<MemberBean> findMembersByName(String name) {
		ArrayList<MemberBean> list = new ArrayList<>();
		return list;
	}

	@Override
	public MemberBean findMemberByid(String id) {
		MemberBean member = dao.existMember(id);
		
		return member;
	}

	@Override
	public int countMembers() {

		return 0;
	}

	@Override
	public boolean existMember(String id, String pass) {
		
		MemberBean member = dao.existMember(id);
		
		boolean exist = false;
		if(member != null && pass.equals(member.getPass())) {
			System.out.println("$$$$$ 로그인 성공 $$$$$$$$$$$$$$$$");
			exist = true;
		}
		
		return exist;
	}

	@Override
	public void changeMember(MemberBean member) {

	}

	@Override
	public void removeMember(String id, String pass) {

	}

}
