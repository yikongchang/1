package SQL_connetion_operation;
import java.sql.*;

public class connection{
	public static Connection conn=null;
	public static Statement stmt=null;
	final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	final static String DB_URL = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8&useSSL=false";
	final static String DB_USER = "root";
	final static String PASSWORD = "crg18246954";

	public static Connection getconnection(){//获取数据库信息

			try{
					Class.forName("com.mysql.cj.jdbc.Driver");//加载数据库驱动
					//System.out.println("驱动加载成功");
			    }catch(Exception e) {
					e.printStackTrace();
				}
			try {
				conn =  DriverManager.getConnection(DB_URL,DB_USER,PASSWORD);//
				stmt=conn.createStatement();
				//System.out.println("链接数据库成功");
			}catch(Exception e) {
				e.printStackTrace();
			}
			return conn;
	 	}
	
	
	 public void closeMyConnection(){//关闭数据库连接
			try{
				stmt.close();
				conn.close();
				System.out.println("数据库已关闭");
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
/*
 *  public void check() throws SQLException {
		  String sql;
         sql = "SELECT id,name,sex,project,primery,phone  FROM user_info";
		 ResultSet rs = stmt.executeQuery(sql);
	        
         // 展开结果集数据库
         while(rs.next()){
         	int id = rs.getInt("id");
     		String user = rs.getString("name");
     		String sex = rs.getString("sex");
     		String pri = rs.getString("project");
     		String s = rs.getString("primery");
     		int phone = rs.getInt("phone");
     		System.out.println("序号："+id+"  姓名："+user+"  性别："+sex+"  专业："+pri+"  年级："+s+"  手机号："+phone);}
		 
	 }
 *  public static void main(String[] args) throws SQLException  {
		 connection a = new connection();
		 //a.check();
		 a.closeMyConnection(); }
 */
	

	
	
}


