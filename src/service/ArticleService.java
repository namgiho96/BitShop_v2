package service;

import java.util.ArrayList;

import domain.ArticleBean;

public interface ArticleService {

	public void crate();
	public ArrayList<ArticleBean> list();
	public ArrayList<ArticleBean> findbyname();
	public ArticleBean findbyid();
	public int count();
	public boolean exist();
	public void update();
	public void delete();
}
