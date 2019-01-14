package service;

import java.util.ArrayList;

import domain.AccountBean;

public class AdminServiceImpl  implements AcountService{
	private static AdminServiceImpl instance = new AdminServiceImpl();
	private AdminServiceImpl() {}
	public static AdminServiceImpl getInstance() {return instance;}


	@Override
	public void openByAccountNum(AccountBean accout) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createAccountNum() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void date() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<AccountBean> accountsAlllist() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean findAcount(String accountNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean depositMoney(String accountnum, int money) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void withdrawMoney(String accountnum, int money) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

}
