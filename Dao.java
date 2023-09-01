package Cadastros;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.sql.Connection;;

public class Dao {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Connection con;
		PreparedStatement stmt;
		ResultSet rs;
		CallableStatement call;
		
		public void open() throws Exception {
			
			String url = "jdbc:postgresql://localhost:5432/cadastros";
			String user = "postgres";
			String password = "admin";
			
			try {
				
				Class.forName("org.postgresql.Driver");
				con = DriverManager.getConnection(url, user, password);
			}catch(SQLException | ClassNotFoundException ex) {
				
				System.out.println("Erro ao conectar com banco de dados");
				
			}
		}
		
		public void close() throws Exception{
			
			con.close();
		}

	}

//}
