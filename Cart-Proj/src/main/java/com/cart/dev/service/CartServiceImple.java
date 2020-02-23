package com.cart.dev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cart.dev.dao.CartDao;
import com.cart.dev.dto.CartDTO;

@Service
public class CartServiceImple implements CartService 
{
	@Autowired
	private CartDao dao;
	
	public void insertCart(CartDTO dto) 
	{
			dao.insertCart(dto); 
	}
}
