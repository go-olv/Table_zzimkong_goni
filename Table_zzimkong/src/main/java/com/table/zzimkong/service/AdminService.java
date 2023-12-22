package com.table.zzimkong.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.table.zzimkong.mapper.AdminMapper;
import com.table.zzimkong.vo.CompanyVO;
import com.table.zzimkong.vo.MemberVO;

@Service
public class AdminService {
	@Autowired
	private AdminMapper mapper;
	 
	// 관리자 - 회원 목록 조회 요청
	public List<MemberVO> adminMemberList() {
		return mapper.selectAdminMemberList();
	}

	// 관리자 - 업체 목록 조회 요청
	public List<CompanyVO> adminCompanyList() {
		return mapper.selectAdminCompanyList();
	}

	// 관리자 - 업체 상세 정보 요청
	public CompanyVO adminCompanyInfo(CompanyVO company) {
		return mapper.selectAdminCompanyInfo(company);
	}









	
	

}
