package cn.Util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DBHelper {
	//��������������Ϣ�Ķ��� Properties  ���ص��Լ�ֵ�Ա�����Ϣ������������String
	   private static Properties prop = new Properties();
		static{
			//��̬����� ִֻ��һ�� ������౻���õ�ʱ�� ��̬�����Ϳ�ʼ����ִ��
				InputStream in=null;
				try {
					//��ȡ�����ļ���ָ�������ļ�λ��
					in = DBHelper.class.getResourceAsStream("/mysql_jdbc.properties");
					//��������Ϣ���ص�prop�б���
					prop.load(in);
					//1.��������
					Class.forName(prop.getProperty("driver"));
				} catch (Exception e) {
					e.printStackTrace();
				}finally{
					try {
						in.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			//�ṩ��ȡ���ӹ���
			public static Connection getConn() throws SQLException{
				//2.��ȡ����
				Connection conn= DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("username"),prop.getProperty("password"));
				return conn;
			}
			//�ṩ�ر���Դ�Ĺ���--����ڲ�ѯ
			public static void close(ResultSet rs,PreparedStatement ps,Connection con) throws SQLException{
				if(rs!=null) rs.close();
				if(ps!=null) ps.close();
				if(con!=null) con.close();
			}
			
			//��������--�������ɾ��
			public static void close(PreparedStatement ps,Connection con) throws SQLException{
				if(ps!=null) ps.close();
				if(con!=null) con.close();
}
}
