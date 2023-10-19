package com.controller;

import com.dao.Schooldao;

public class DeleteDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Schooldao schooldao = new Schooldao();
		schooldao.removeDetails(2);

	}

}
