package dao;

import java.util.ArrayList;

import domain.AccountBean;

public interface AccountDAO {
	public void insertAccountNum(AccountBean account);

	public ArrayList<AccountBean> selectAccountNum();

	public void selectDate();

	public ArrayList<AccountBean> accountsAlllist();

	public void accountCount();
	
	public void depositMoney(String accountnum, int money);

	public void withdrawalMoney(String accountnum,int money);

	public void delete();
}
