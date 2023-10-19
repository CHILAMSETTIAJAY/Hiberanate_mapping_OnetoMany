package com.controller;

import com.dao.Schooldao;

public class FetchDetails {

	public static void main(String[] args) {
		Schooldao schooldao= new Schooldao();
		schooldao.fetchDetails(1);
	}

}
