package com.controller;

import com.dao.Companydao;

public class FetchDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Companydao companydao = new Companydao();
		companydao.fetchDetails(3);

	}

}
