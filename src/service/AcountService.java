package service;

import java.util.ArrayList;

import domain.AccountBean;

public interface AcountService {

	public void openByAccountNum(AccountBean accout);

	public void createAccountNum();

	public void date();

	public ArrayList<AccountBean> accountsAlllist();

	public AccountBean findAcount(String accountNum);

	public boolean depositMoney(String accountnum, int money);

	public void withdrawMoney(String accountnum, int money);

	public void delete();

}
