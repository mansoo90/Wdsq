package com.wsq.webprj.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.wsq.webprj.dao.FoundPartnerDao;
import com.wsq.webprj.vo.FoundPartner;

public class MyBatisFoundPartnerDao implements FoundPartnerDao{
	@Autowired
	SqlSession sqlSession;

	@Override
	public List<FoundPartner> getPartners(String nationalityCountry, String nativeLanguage,
			String learnLanguage) throws SQLException {
		FoundPartnerDao dao = sqlSession.getMapper(FoundPartnerDao.class);
		List<FoundPartner> list = dao.getPartners(nationalityCountry, nativeLanguage, learnLanguage);
		return list;
	}
}
