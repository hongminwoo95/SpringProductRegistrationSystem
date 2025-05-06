package www.silver.hom;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import www.silver.VO.GoodsUpdateVO;
import www.silver.VO.GoodsVO;
import www.silver.service.IF_GoodsService;

@Controller
public class GoodsController {
	
	
	@Inject
	IF_GoodsService goodsservice;
	
	@RequestMapping(value="/z", method=RequestMethod.GET) // 메인화면
	public String goods() {		
		return "goods/top";
	}	
	@RequestMapping(value="/myz") // 상품등록 으로 보내기
	public String insert() {
		return "goods/insertgoods";
	}	
	@RequestMapping(value = "/yz", method = RequestMethod.POST) // 상품등록
	public String goods1(@ModelAttribute GoodsVO goodsvo) { // jsp에서 파라미터를 넘겨받고 VO와 변수명이 같을경우 자동매핑
		goodsservice.addgoods(goodsvo);
		return "goods/insertgoods";
	}	
	@GetMapping(value="/mrz") // 상품조회로 보내기
	public String name() {
		return "goods/selectname";
	}	
	@GetMapping("/rz") // 상품조회
	public String search(@RequestParam("name") String name, Model model) {
		GoodsVO gvo = goodsservice.selectGoods(name);		
		model.addAttribute("name", gvo);
		return "goods/selectname";
	}	
	@GetMapping(value="/mdz") // 삭제하기 보내기
	public String delete() {
		return "goods/deletename"; 
	}	
	@GetMapping("/dz") // 삭제하기 <동기방식>
	public String deletename(@RequestParam("name") String name) {		
		goodsservice.deletename(name);
		return "goods/deletename";
	}	
	@GetMapping("/goodsall") // 상품 전체조회
	public String all(Model model) {		
		List<GoodsVO> glist = goodsservice.all();
		model.addAttribute("alllist", glist);
		return "goods/searchallname";
	}	
	
	@GetMapping("/change") // 수정으로 보내기
	public String change() {
		return "goods/change";
	}	
	@RequestMapping(value="/changename" , method = RequestMethod.POST) // 수정하기 기존상품명과 변경내용들을 POST로받아서 db에 한번에 변경
	public String changenametwo(@ModelAttribute GoodsUpdateVO goodsvo) {
		System.out.println(goodsvo.getName());
		System.out.println(goodsvo.getGoodsname());
		System.out.println(goodsvo.getGoodsprice());
		System.out.println(goodsvo.getGoodscnt());
		System.out.println(goodsvo.getGoodscomment());
		goodsservice.update(goodsvo);
		return "goods/change";
	}
	
	@RequestMapping(value="/checked", method=RequestMethod.GET) // 중복확인하기 (비동기 처리방식)
	@ResponseBody // String 자료형으로 스크립트 비동식 방기 a.jax로 넘기기 위함
	public String checked(@RequestParam("name") String name) {
		GoodsVO gvo = goodsservice.selectGoods(name);
		System.out.println(gvo.getGoodsname());
		System.out.println(gvo.getGoodsprice());
		String goodsname = null;
		if(gvo==null) {
			goodsname=name; // 등록가능
		}else {
			goodsname=""; // null이 아닐경우 등록 불가능
		}
		return goodsname; // client에게 보내주기
	}
	
	
	
}
