package com.wsq.webprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.wsq.webprj.vo.FoundPartner;
import com.wsq.webprj.vo.MyPartnerView;

public interface MyPartnerViewDao {
	public List<MyPartnerView> getMyPartners(String id);
}
