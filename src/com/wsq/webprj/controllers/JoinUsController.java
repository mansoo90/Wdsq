package com.wsq.webprj.controllers;

import java.sql.SQLException;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wsq.webprj.dao.FriendDao;
import com.wsq.webprj.dao.LearningLanguageDao;
import com.wsq.webprj.dao.MemberDao;
import com.wsq.webprj.dao.MemberProfileDao;
import com.wsq.webprj.dao.NativeLanguageDao;
import com.wsq.webprj.vo.Member;


//POJO Ŭ����
@Controller
@RequestMapping("/joinus/")
public class JoinUsController {
	
	@Autowired
	private MemberDao memberDao;
	@Autowired
	private MemberProfileDao mprofileDao;
	@Autowired
	private FriendDao friendDao;
	@Autowired
	private LearningLanguageDao lLanguageDao;
	@Autowired
	private NativeLanguageDao nLanguageDao;
	
	//--------------------------------------------------------------
	@RequestMapping(value= "join",method=RequestMethod.GET)
	public String join(){
		
		return "joinus/join";
	}
	
	@RequestMapping(value= "join",method=RequestMethod.POST)
	public String join(Member m, HttpSession session) throws SQLException
	{
		Date regDate = new Date();
		String id = m.getMid();
		m.setRegDate(regDate);
		
		memberDao.insert(m);
		
		mprofileDao.insert(id);
		friendDao.insert(id);
		lLanguageDao.insert(id, "1");
		nLanguageDao.insert(id, "1");
		
		
		return "redirect:../home/index"; 
	}
	//---------------------------------------------------------------
	
	@RequestMapping(value= "login",method=RequestMethod.GET)
	public String login(){
		
		return "joinus/login";
	}
	
	/*@RequestMapping(value= "login",method=RequestMethod.POST)
	public String login(String userID, 
			String password, 
			Model model,
			HttpSession session) throws SQLException
	{
		Member m = memberDao.getMember(userID);
		String error = null;
		
		if(m == null)
		{
			error = "����� ���̵� �Ǵ� ��й�ȣ�� �ùٸ��� �ʽ��ϴ�";
		}
		
		else if(!m.getPwd().equals(password)) //ȸ���� ���������� ��й�ȣ�� ��ġ���� ���� ���
			error = "����� ���̵� �Ǵ� ��й�ȣ�� �ùٸ��� �ʽ��ϴ�";
		
		if(error != null)
		{
			model.addAttribute("error", error);
			return "joinus/login";
		}
		
		
	
		//���� ����
		//���� ������ ���� ���?(session?cookie? ����)
		session.setAttribute("mid", userID);	
		return "redirect:../findpartner/userlist"; 
	}*/
}
