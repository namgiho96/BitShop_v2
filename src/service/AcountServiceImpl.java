package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import domain.AccountBean;

public class AcountServiceImpl implements AcountService {

	private static AcountServiceImpl instance = new AcountServiceImpl();

	private AcountServiceImpl() {
		dao = AcountServiceImpl.getInstance();
	}

	public static AcountServiceImpl getInstance() {
		return instance;
	}

	AcountServiceImpl dao;

	public void openByAccountNum(AccountBean account) {
		/*
		 * AccountBean bean = new AccountBean(); bean.setAccountNum(createAccountNum());
		 * bean.setMoney(money); bean.setToday(date());
		 */
	}

	@Override
	public void createAccountNum() {
		String accNum = "";
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			if (i == 2) {
				accNum += random.nextInt(10) + "-";
			} else {
				accNum += random.nextInt(10);
			}
		}

	}

	@Override
	public void date() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
	}

	@Override
	public ArrayList<AccountBean> accountsAlllist() {
		ArrayList<AccountBean> list = new ArrayList<>();

		return list;
	}

	@Override
	public AccountBean findAcount(String accountNum) {
		AccountBean account = new AccountBean();
		ArrayList<AccountBean> list = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (accountNum.equals(list.get(i).getAccountNum())) {
				account = list.get(i);
				break;
			}
		}
		return account;
	}

	@Override
	public boolean depositMoney(String accountnum, int money) {
		return false;
	}

	@Override
	public void withdrawMoney(String accountnum, int money) {

	}

	@Override
	public void delete() {

	}

}
