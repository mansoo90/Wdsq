package com.wsq.webprj.controllers;

import java.security.Principal;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wsq.webprj.dao.CountryDao;
import com.wsq.webprj.dao.FoundPartnerDao;
import com.wsq.webprj.dao.LanguageDao;
import com.wsq.webprj.dao.MemberDao;
import com.wsq.webprj.dao.MyPartnerViewDao;
import com.wsq.webprj.vo.Country;
import com.wsq.webprj.vo.FoundPartner;
import com.wsq.webprj.vo.Language;
import com.wsq.webprj.vo.Member;
import com.wsq.webprj.vo.MyPartnerView;

@Controller
@RequestMapping("/partner/")
public class PartnerController {
	
	@Autowired
	private MemberDao memberDao;
	@Autowired
	private CountryDao countryDao;
	@Autowired
	private LanguageDao languageDao;
	@Autowired
	private FoundPartnerDao foundpartnerDao;
	@Autowired
	private MyPartnerViewDao mypartnerviewDao;
	
	//파인드 파트너 조건
	@RequestMapping(value="findPartners", method=RequestMethod.GET)
	public String findPartners(Model model) throws SQLException {
		
		List<Country> countryList=countryDao.getCountries();
		List<Language> languageList=languageDao.getLanguages();
		
		model.addAttribute("countryList", countryList);
		model.addAttribute("languageList", languageList);
		
		return "partner/findPartners";
	}
	
	
	//파인드 파트너 검색결과
	@RequestMapping(value="partnerList", method=RequestMethod.GET)
	public String partnerList(Model model,
			String nationalityCountry,/*findpartner에서 name꺼 바로 이렇게 받음*/
			String nativeLanguage,
			String learnLanguage) throws SQLException
	{
		//if(널아닐때)
		List<FoundPartner> list = foundpartnerDao.getPartners(nationalityCountry,
													nativeLanguage, learnLanguage);
		
		model.addAttribute("list", list);
		return "partner/partnerList";
	}
	
	
	// 내 파트너 목록
	@RequestMapping(value="myPartnerList", method=RequestMethod.GET)
	public String myPartnerList(Model model, Principal prin)
	{
		String id=prin.getName();
		List<MyPartnerView> list = mypartnerviewDao.getMyPartners(id);
		
		model.addAttribute("list", list);
		return "partner/myPartnerList";
	}
	
	/*친구삭제에서 사용할예정*/
	@RequestMapping("userDel")
	public String userDel(String id)
	{
		memberDao.delete(id);
		
		return "redirect:userlist?pg=1";
	}
	
}
