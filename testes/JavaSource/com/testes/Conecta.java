package com.testes;

import org.hibernate.Session;

public class Conecta {
	
	public static void main (String [] args){
		
		
		Session sessao = null;
		try{
			sessao = HibernateUtil.getSession().openSession();
			System.out.println("aeww");
			
		}finally{
			
			sessao.close();
			System.out.println("aeww foooi");
		}
		
	}

}
