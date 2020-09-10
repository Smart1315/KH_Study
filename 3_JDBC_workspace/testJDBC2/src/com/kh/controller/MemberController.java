package com.kh.controller;

import java.util.ArrayList;

import com.kh.model.service.MemberService;
import com.kh.model.vo.Member;
import com.kh.view.MemberMenu;

public class MemberController {
	private MemberMenu menu = new MemberMenu();
//	private MemberDAO mDAO = new MemberDAO();
	private MemberService mService = new MemberService();

	public void insertMember() {
		Member mem = menu.insertMember();

		int result = mService.insertMember(mem);

		if (result > 0) {
			menu.displaySuccess(result + "개의 행이 추가되었습니다.");
		} else {
			menu.displayError("데이터 삽입 과정 중 오류 발생");
		}
	}

	public void selectAll() {
		ArrayList<Member> list = mService.selectAll();

		if (!list.isEmpty()) {
			menu.selectAll(list);
		} else {
			menu.displayError("조회 결과가 없습니다.");
		}
	}

	public void selectMember() {
		int sel = menu.selectMember();

		ArrayList<Member> list = null;

		switch (sel) {
		case 1:
			String id = menu.inputMemberId();
			list = mService.selectMemberId(id);
			break;
		case 2:
			char gender = menu.inputGender();
			list = mService.selectGender(gender);
			break;
		case 0:
			return;
		}

		if (!list.isEmpty()) {
			menu.selectAll(list);
		} else {
			menu.displayError("조회 결과가 없습니다.");
		}

	}

	public void updateMember() {
		String memberId = menu.inputMemberId();

		int check = mService.checkMember(memberId);

		if (check == 1) {
			int sel = menu.updateMember();

			if (sel == 0) {
				return;
			}

			String input = menu.inputUpdate();

			int result = mService.updateMember(input, sel, memberId);

			if (result > 0) {
				menu.displaySuccess(result + "개의 행이 수정되었습니다.");
			} else {
				menu.displayError("데이터 수정 과정 중 오류 발생");
			}

		} else {
			menu.displayError("입력한 아이디가 존재하지 않습니다.");
		}

	}

	public void deleteMember() {
		String memberId = menu.inputMemberId();

		int check = mService.checkMember(memberId);

		if (check == 1) {
			char yn = menu.checkDelete();

			if (yn != 'Y') {
				return;
			}
			
			int result = mService.deleteMember(memberId);
			
			if (result > 0) {
				menu.displaySuccess(result + "개의 행이 삭제되었습니다.");
			} else {
				menu.displayError("데이터 삭제 과정 중 오류 발생");
			}

		} else {
			menu.displayError("입력한 아이디가 존재하지 않습니다.");
		}

	}

	public void exitProgram() {
		mService.exitProgram();
		
	}

}
