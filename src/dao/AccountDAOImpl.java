package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import domain.AccountBean;

public class AccountDAOImpl implements AccountDAO {
	private static AccountDAOImpl instance = new AccountDAOImpl();

	private AccountDAOImpl() {
	}

	public static AccountDAOImpl getInstance() {
		return instance;
	}
	Connection conn;
	Statement stmt;
	ResultSet rs;

	@Override
	public void insertAccountNum(AccountBean account) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = "";
			int result = stmt.executeUpdate(sql);
			if (result == 1) {
				System.out.println("계좌성공");
			} else {
				System.out.println("계좌실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<AccountBean> selectAccountNum() {
		ArrayList<AccountBean> list = new ArrayList<>();
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = "";
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void selectDate() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = "";
			int result = stmt.executeUpdate(sql);

			if (result == 1) {
				System.out.println("날짜성공");
			} else {
				System.out.println("날짜실패");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<AccountBean> accountsAlllist() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = "";
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void accountCount() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = "";
			int result = stmt.executeUpdate(sql);

			if (result == 1) {
				System.out.println("카운터 성공");
			} else
				System.out.println("카운터 실패");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void depositMoney(String accountnum, int money) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","oracle","password");
			stmt = conn.createStatement();
			String sql = "";
			int result = stmt.executeUpdate(sql);
			if(result==1) {
				System.out.println("출금성공");
			}else {
				System.out.println("출금실패");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void withdrawalMoney(String accountnum, int money) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = "";
			int result = stmt.executeUpdate(sql);

			if (result == 1) {
				System.out.println("입금성공");
			} else {
				System.out.println("입금실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","oracle","password");
			stmt = conn.createStatement();
			String sql = "";
			int result = stmt.executeUpdate(sql);
			if(result==1) {
				System.out.println("계좌 삭제 성공");
			}else {
				System.out.println("계좌 삭제 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
