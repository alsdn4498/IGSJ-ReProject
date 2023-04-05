package ezen.project.IGSJ.inquire.service;

import java.util.List;

import ezen.project.IGSJ.inquire.domain.InquireDTO;

public interface InquireService {
	
	// 제품 문의 목록
	public List<InquireDTO> InquireList() throws Exception;
	
	// 제품 문의 조회
	public InquireDTO inquireView(int inquireNum) throws Exception;
	
	// 제품 문의 작성
	public void inquireWrite(InquireDTO inquireDTO) throws Exception;
	
	// 제품 문의 수정
	public void inquireUpdate(InquireDTO inquireDTO) throws Exception;
	
	// 제품 문의 삭제
	public void inquireDelete(int inquireNum) throws Exception;

	
}
