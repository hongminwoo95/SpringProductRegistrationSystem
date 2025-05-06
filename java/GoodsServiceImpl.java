package www.silver.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import www.silver.VO.GoodsUpdateVO;
import www.silver.VO.GoodsVO;
import www.silver.dao.IF_GoodsDAO;

@Service
public class GoodsServiceImpl implements IF_GoodsService{
	
	
	@Inject
	IF_GoodsDAO goodsdao;
	
	@Override
	public void addgoods(GoodsVO goodsvo) { // 등록하기	
		goodsdao.addGoods(goodsvo);
	}

	@Override
	public GoodsVO selectGoods(String name) { // 검색하기 , 중복검사
		GoodsVO gvo = goodsdao.selectGoods(name);
		return gvo;
	}

	@Override
	public void deletename(String name) { // 삭제하기
		System.out.println(name+"서비스에 이름 들어왔니?");
		goodsdao.deletename(name);
		
	}

	@Override
	public List<GoodsVO> all() { // 전체조회		
		List<GoodsVO> glist = goodsdao.all();		
		return glist;
	}

	@Override
	public void update(GoodsUpdateVO goodsvo) {
		
		goodsdao.update(goodsvo);
		
	}

	






	




	


}
