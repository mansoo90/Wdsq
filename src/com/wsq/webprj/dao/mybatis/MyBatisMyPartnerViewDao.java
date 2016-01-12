package com.wsq.webprj.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.wsq.webprj.dao.FoundPartnerDao;
import com.wsq.webprj.dao.MyPartnerViewDao;
import com.wsq.webprj.vo.FoundPartner;
import com.wsq.webprj.vo.MyPartnerView;

public class MyBatisMyPartnerViewDao implements MyPartnerViewDao {
	@Autowired
	SqlSession sqlSession;

	@Override
	public List<MyPartnerView> getMyPartners(String id) {
		MyPartnerViewDao dao = sqlSession.getMapper(MyPartnerViewDao.class);
		List<MyPartnerView> list = dao.getMyPartners(id);
		return list;
	}
	
	

}
