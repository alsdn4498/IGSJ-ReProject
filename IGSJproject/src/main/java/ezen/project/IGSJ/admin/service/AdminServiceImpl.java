package ezen.project.IGSJ.admin.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ezen.project.IGSJ.admin.dao.AdminDAO;
import ezen.project.IGSJ.member.domain.MemberDTO;

@Service
public class AdminServiceImpl implements AdminService{
	
	private static final Logger logger = LoggerFactory.getLogger(AdminServiceImpl.class);
	
	@Autowired
	private AdminDAO adminDAO;
	
	// 전체 회원 불러오기
	@Override
	public List<MemberDTO> getAllUsers(int displayTotalContent, int pageContent, String searchType, String keyword) throws Exception {
		
		logger.info("관리자 페이지 전체 회원 불러오기 service");
		
		return adminDAO.getAllUsers(displayTotalContent, pageContent, searchType, keyword);
	}
	
	// 검색 결과에 따른 회원 출력
	@Override
	public int searchMember(String searchType, String keyword) throws Exception {
		
		logger.info("관리자 페이지 검색결과에 따른 회원 수 출력");
		
		return adminDAO.searchMember(searchType,keyword);
	}
	
	// 상품 목록 불러오기
	@Override
	public List<ProductDTO> getProductList(int displayTotalContent, int pageContent, String searchType, String keyword) throws Exception {
		
		logger.info("관리자 페이지 전체 상품 목록 불러오기 service");
		
		return adminDAO.getProductList(displayTotalContent, pageContent, searchType, keyword);
	}
}