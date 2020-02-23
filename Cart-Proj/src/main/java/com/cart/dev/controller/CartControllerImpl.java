package com.cart.dev.controller;

import java.util.Objects;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cart.dev.dto.CartDTO;
import com.cart.dev.service.CartService;

@Controller
@RequestMapping("/")
public class CartControllerImpl 
{
	@Autowired
	private CartService cartService;
	
	//@RequestMapping(value="/home.do",method=RequestMethod.POST)
	@PostMapping("/home.do")
	public String insertCart(@ModelAttribute CartDTO dto,HttpServletRequest req)
	{ 
		if(Objects.nonNull(dto))
		{
			cartService.insertCart(dto);
			req.setAttribute("itemname", dto.getItems());
		}
		else
		{
			System.out.println("Invalid Data");
		}
		return "/home.jsp";
	}
}