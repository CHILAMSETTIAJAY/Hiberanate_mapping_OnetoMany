package com.controller;
import com.dao.Companydao;

public class DeleteDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Companydao companydao = new Companydao();
		companydao.deleteDetails(1);
	}

}
