package www.silver.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import www.silver.VO.GoodsUpdateVO;
import www.silver.VO.GoodsVO;

@Repository
public class GoodsDAOImpl implements IF_GoodsDAO{

	@Inject // 객체 주입
	public SqlSession sqlsession; // 컨테이너에 저장된 객체를 주입받음
	
	@Override
	public void addGoods(GoodsVO gvo) { // 상품 등록
		sqlsession.insert("www.silver.dao.IF_GoodsDAO.insertgoods", gvo);
	}

	@Override
	public GoodsVO selectGoods(String name) { // 상품조회 , 중복검사
		System.out.println(name+ "들어왔니?");     // ↓ 주소.객체명 / 객체명  .. 객체명만 적어도 오류 안뜸 나중에 더 알아보기.
		GoodsVO gvo = sqlsession.selectOne("selectname", name); 
		return gvo;
	}

	@Override
	public void deletename(String name) { // 삭제하기
		System.out.println(name+"dao들어왔니?");
		sqlsession.delete("deletename", name);		
	}

	@Override
	public List<GoodsVO> all() { // 상품 전체 조회
		List<GoodsVO> glist = sqlsession.selectList("www.silver.dao.IF_GoodsDAO.selectall"); 		
		return glist;
	}

	@Override
	public void update(GoodsUpdateVO goodsvo) {
		sqlsession.update("www.silver.dao.IF_GoodsDAO.updatelist", goodsvo);
	
	}


	



}
