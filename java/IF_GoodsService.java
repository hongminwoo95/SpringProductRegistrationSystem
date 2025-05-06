package www.silver.service;

import java.util.List;

import www.silver.VO.GoodsUpdateVO;
import www.silver.VO.GoodsVO;

public interface IF_GoodsService {
	
	public void addgoods(GoodsVO goodsvo); // 저장하기
	
	public GoodsVO selectGoods(String name); // 상품검색 , 중복검사<- 같이쓰이기 떄문에 같이넣음
	//        ↑ 리턴값이 VO인 이유는 상품이름으로 해당상품 이름의 모든 정보를 가져와야 하기떄문에 
	
	public void deletename(String name); // 삭제하기
	
	public List<GoodsVO> all(); // 전체조회
	
	public void update(GoodsUpdateVO goodsvo); // 수정하기
}
