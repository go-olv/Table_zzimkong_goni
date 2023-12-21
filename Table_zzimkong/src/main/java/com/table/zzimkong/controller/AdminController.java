package com.table.zzimkong.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.table.zzimkong.service.AdminService;
import com.table.zzimkong.service.MemberService;
//import com.table.zzimkong.vo.CompanyVO;
import com.table.zzimkong.vo.MemberVO;

@Controller
public class AdminController {
	/* 메모
	 * - session.setAttribute("sId", "admin");	/// 세션 아이디 test
	 *   AdminService.java 에 있음 => 로그인 기능 구현 후 수정!
	 */
	
	@Autowired
	private AdminService service;
	
	// 공통 - 관리자 페이지 접근 권한 설정 (service.checkAdminAccess)
	
	@GetMapping("admin/main") 
	public String adminMain(HttpSession session, Model model) {
		// 관리자 페이지 접근 제한
		session.setAttribute("sId", "admin");
		
		if(!isvalid((String)session.getAttribute("sId"))) {
			return "fail_back";
		}
		
		return "admin/admin_main";
	}
	
	// 관리자 페이지 - 회원 목록 조회
	@GetMapping("admin/user") 
	public String memberList(HttpSession session, Model model) {
		// 관리자 페이지 접근 제한
		if(!isvalid((String)session.getAttribute("sId"))) {
			return "fail_back";
		}
		
		List<MemberVO> memberList = service.adminMemberList();
		
		model.addAttribute("memberList", memberList);
		
		return "admin/admin_user";
	}
	
	// 관리자 페이지 - 업체 목록 조회 : 구현 중
	@GetMapping("admin/company")
	public String admin_company(HttpSession session, Model model) {
		// 관리자 페이지 접근 제한
		if(!isvalid((String)session.getAttribute("sId"))) {
			return "fail_back";
		}
		
//		List<CompanyVO> companyList = service.adminCompanyList();
//		model.addAttribute("companyList", companyList);
		
		return "admin/admin_company";
	}
	
	@GetMapping("admin/company/info")
	public String admin_company_info(HttpSession session, Model model) {
		// 관리자 페이지 접근 제한
		if(!isvalid((String)session.getAttribute("sId"))) {
			return "fail_back";
		}
		
		return "admin/admin_company_info";
	}
	
	@GetMapping("admin/review")
	public String admin_review(HttpSession session, Model model) {
		// 관리자 페이지 접근 제한
		if(!isvalid((String)session.getAttribute("sId"))) {
			return "fail_back";
		}
				
		return "admin/admin_review";
	}
	
	@GetMapping("admin/review/detail")
	public String admin_review_detail(HttpSession session, Model model) {
		// 관리자 페이지 접근 제한
		if(!isvalid((String)session.getAttribute("sId"))) {
			return "fail_back";
		}
				
		return "admin/admin_review_detail";
	}

	@GetMapping("admin/cs/qna")
	public String admin_cs_qna(HttpSession session, Model model) {
		// 관리자 페이지 접근 제한
		if(!isvalid((String)session.getAttribute("sId"))) {
			return "fail_back";
		}
				
		return "admin/admin_cs_qna";
	}
	
	@GetMapping("admin/cs/qna/answer/register")
	public String admin_cs_qna_answer_register(HttpSession session, Model model) {
		// 관리자 페이지 접근 제한
		if(!isvalid((String)session.getAttribute("sId"))) {
			return "fail_back";
		}
				
		return "admin/admin_cs_qna_answer_register";
	}
	
	@GetMapping("admin/cs/qna/answer/view")
	public String admin_cs_qna_answer_view(HttpSession session, Model model) {
		// 관리자 페이지 접근 제한
		if(!isvalid((String)session.getAttribute("sId"))) {
			return "fail_back";
		}
				
		return "admin/admin_cs_qna_answer_view";
	}
	
	@GetMapping("admin/cs/qna/answer/modify")
	public String admin_cs_qna_answer_modify(HttpSession session, Model model) {
		// 관리자 페이지 접근 제한
		if(!isvalid((String)session.getAttribute("sId"))) {
			return "fail_back";
		}
				
		return "admin/admin_cs_qna_answer_modify";
	}
	
	@GetMapping("admin/cs/qna/question")
	public String admin_cs_qna_question(HttpSession session, Model model) {
		// 관리자 페이지 접근 제한
		if(!isvalid((String)session.getAttribute("sId"))) {
			return "fail_back";
		}
				
		return "admin/admin_cs_qna_question";
	}

	@GetMapping("admin/cs/faq")
	public String admin_cs_faq(HttpSession session, Model model) {
		// 관리자 페이지 접근 제한
		if(!isvalid((String)session.getAttribute("sId"))) {
			return "fail_back";
		}
				
		return "admin/admin_cs_faq";
	}
	
	@GetMapping("admin/cs/faq/register")
	public String admin_cs_faq_register(HttpSession session, Model model) {
		// 관리자 페이지 접근 제한
		if(!isvalid((String)session.getAttribute("sId"))) {
			return "fail_back";
		}
				
		return "admin/admin_cs_faq_register";
	}
	
	@GetMapping("admin/cs/faq/modify")
	public String admin_cs_faq_modify(HttpSession session, Model model) {
		// 관리자 페이지 접근 제한
		if(!isvalid((String)session.getAttribute("sId"))) {
			return "fail_back";
		}
				
		return "admin/admin_cs_faq_modify";
	}
	
	@GetMapping("admin/cs/notice")
	public String admin_cs_notice(HttpSession session, Model model) {
		// 관리자 페이지 접근 제한
		if(!isvalid((String)session.getAttribute("sId"))) {
			return "fail_back";
		}
				
		return "admin/admin_cs_notice";
	}
	
	@GetMapping("admin/cs/notice/modify")
	public String admin_cs_notice_modify(HttpSession session, Model model) {
		// 관리자 페이지 접근 제한
		if(!isvalid((String)session.getAttribute("sId"))) {
			return "fail_back";
		}
				
		return "admin/admin_cs_notice_modify";
	}
	
	@GetMapping("admin/cs/notice/register")
	public String admin_cs_notice_register(HttpSession session, Model model) {
		// 관리자 페이지 접근 제한
		if(!isvalid((String)session.getAttribute("sId"))) {
			return "fail_back";
		}
				
		return "admin/admin_cs_notice_register";
	}
	
	public boolean isvalid(String sId) {
	        if (sId == null || !sId.equals("admin")) {
	            return false;
	        }else {
	        	return true;
	        }
	}
}
