package edu.esprit.test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.esprit.services.HelloServiceRemote;

public class TestHelloService {

	public static void main(String[] args) {


		String jndiName ="firstEJB/HelloService!edu.esprit"
				+ ".services.HelloServiceRemote";
		
		try {
			Context context = new InitialContext();
			
			HelloServiceRemote proxy =(HelloServiceRemote)
					context.lookup(jndiName);
			
			System.out.println(proxy.sayHello("hello from Client"));
			
			
		} catch (NamingException e) {
			e.printStackTrace();
		}

	}

}
