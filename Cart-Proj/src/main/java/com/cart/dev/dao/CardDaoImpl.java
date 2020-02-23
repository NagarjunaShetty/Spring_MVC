package com.cart.dev.dao;

import java.util.Objects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.cart.dev.dto.CartDTO;

@Repository
public class CardDaoImpl implements CartDao
{
	@Autowired
	private SessionFactory factory;
	
	public SessionFactory getFactory() 
	{
		return factory;
	}
	
	public void insertCart(CartDTO dto) 
	{
		Session session=null;
		Transaction tx=null;
		try
		{
			session = factory.openSession();
			tx = session.beginTransaction();
			session.save(dto);
			tx.commit();
		}
		catch(Exception e)
		{
			tx.rollback();
			e.printStackTrace();
		}
		finally
		{
			if(Objects.nonNull(session))
			session.close();
		}
	}
}