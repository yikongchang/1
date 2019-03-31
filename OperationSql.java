package cn.zi.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import cn.zt.vo.User;

public class OperationSql {
	
	/**
	 * @param user
	 * @throws SQLException
	 */
	/**
	 * @param user
	 * @throws SQLException
	 */
	public static void zuche(User user) throws SQLException {
		
		try {
			System.out.println("测试插入 ：");
			//用正文在我的电脑上会出错
			String sql = "insert into testsql(name,password)values(?,?)";
			PreparedStatement pr = MyDBConnetion.getconn().prepareStatement(sql);
			//pr.setObject(1,2);
			//排序从1开始
			pr.setObject(1, user.getuserName());
			pr.setObject(2, user.getuserPassword());
			pr.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
	}
	}
	
