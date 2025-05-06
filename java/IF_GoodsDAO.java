package www.silver.dao;

import java.util.List;

import www.silver.VO.GoodsUpdateVO;
import www.silver.VO.GoodsVO;

public interface IF_GoodsDAO {

	
	public void addGoods(GoodsVO goodsvo); // 저장하기

	public GoodsVO selectGoods(String name); // 검색하기 , 중복검사
	
	public void deletename(String name); // 삭제하기
	
	public List<GoodsVO> all(); // 전체조회
	
	public void update(GoodsUpdateVO goodsvo); // 수정하기
}
