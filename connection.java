package SQL_connetion_operation;
import java.sql.*;

public class connection{
	public static Connection conn=null;
	public static Statement stmt=null;
	final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	final static String DB_URL = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8&useSSL=false";
	final static String DB_USER = "root";
	final static String PASSWORD = "crg18246954";

	public static Connection getconnection(){//��ȡ���ݿ���Ϣ

			try{
					Class.forName("com.mysql.cj.jdbc.Driver");//�������ݿ�����
					//System.out.println("�������سɹ�");
			    }catch(Exception e) {
					e.printStackTrace();
				}
			try {
				conn =  DriverManager.getConnection(DB_URL,DB_USER,PASSWORD);//
				stmt=conn.createStatement();
				//System.out.println("�������ݿ�ɹ�");
			}catch(Exception e) {
				e.printStackTrace();
			}
			return conn;
	 	}
	
	
	 public void closeMyConnection(){//�ر����ݿ�����
			try{
				stmt.close();
				conn.close();
				System.out.println("���ݿ��ѹر�");
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
/*
 *  public void check() throws SQLException {
		  String sql;
         sql = "SELECT id,name,sex,project,primery,phone  FROM user_info";
		 ResultSet rs = stmt.executeQuery(sql);
	        
         // չ����������ݿ�
         while(rs.next()){
         	int id = rs.getInt("id");
     		String user = rs.getString("name");
     		String sex = rs.getString("sex");
     		String pri = rs.getString("project");
     		String s = rs.getString("primery");
     		int phone = rs.getInt("phone");
     		System.out.println("��ţ�"+id+"  ������"+user+"  �Ա�"+sex+"  רҵ��"+pri+"  �꼶��"+s+"  �ֻ��ţ�"+phone);}
		 
	 }
 *  public static void main(String[] args) throws SQLException  {
		 connection a = new connection();
		 //a.check();
		 a.closeMyConnection(); }
 */
	

	
	
}


