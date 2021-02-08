package member.model.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;

import member.model.exception.MemberException;
import member.model.vo.Member;

public class MemberDAO {

	public Member selectMember(SqlSession session, Member m) throws MemberException {
//		session.selectOne(String arg0);
//		session.selectOne(String arg0, String arg1);
//		String arg0 (첫 번째 매개변수) = 연결할 쿼리 이름
//		String arg1 (두 번째 매개변수) = 쿼리에 전달할 값

		Member member = session.selectOne("memberMapper.loginMember", m);

//		System.out.println(member);

		if (member == null) {
			session.close();
			throw new MemberException("로그인에 실패하였습니다.");
		}

		return member;
	}

	public void insertMember(SqlSession session, Member m) throws MemberException {

		int result = session.insert("memberMapper.insertMember", m);

		if (result <= 0) {
			session.rollback();
			session.close();
			throw new MemberException("회원가입에 실패하였습니다.");
		}
	}

	public void updateMemberPwd(SqlSession session, HashMap<String, String> map) throws MemberException {
			
		int result = session.update("memberMapper.updateMemberPwd", map);

		if (result <= 0) {
			session.rollback();
			session.close();
			throw new MemberException("비밀번호 수정에 실패하였습니다.");
		}

	}

	public void updateMember(SqlSession session, Member m) throws MemberException {
		
		int result = session.update("memberMapper.updateMember", m);

		if (result <= 0) {
			session.rollback();
			session.close();
			throw new MemberException("회원정보 수정에 실패하였습니다.");
		}
		
	}

	public void deleteMember(SqlSession session, String userId) throws MemberException {
		int result = session.update("memberMapper.deleteMember", userId);

		if (result <= 0) {
			session.rollback();
			session.close();
			throw new MemberException("회원 탈퇴에 실패하였습니다.");
		}
	}

}