package model.dao;

import db.DB;
import model.dao.impl.SellerDaoImpJDCBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoImpJDCBC(DB.getConnection());
	}
}
