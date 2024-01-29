package model.dao;

import model.dao.impl.SellerDaoImpJDCBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoImpJDCBC();
	}
}
