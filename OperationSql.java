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
			System.out.println("���Բ��� ��");
			//���������ҵĵ����ϻ����
			String sql = "insert into testsql(name,password)values(?,?)";
			PreparedStatement pr = MyDBConnetion.getconn().prepareStatement(sql);
			//pr.setObject(1,2);
			//�����1��ʼ
			pr.setObject(1, user.getuserName());
			pr.setObject(2, user.getuserPassword());
			pr.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
	}
	}
	
