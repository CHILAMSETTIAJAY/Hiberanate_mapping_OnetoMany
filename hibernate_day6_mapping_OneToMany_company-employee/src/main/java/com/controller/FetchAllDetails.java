package com.controller;

import com.dao.Companydao;

public class FetchAllDetails {

	public static void main(String[] args) {
		Companydao companydao = new Companydao();
		companydao.fetchAllDetails();
	}

}
