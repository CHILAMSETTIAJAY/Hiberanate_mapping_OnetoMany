package com.controller;

import com.dao.Schooldao;

public class FetchAll {

	public static void main(String[] args) {
		Schooldao schooldao = new Schooldao();
		schooldao.fetchAll();
	}

}
