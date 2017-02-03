package edu.esprit.utils;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class GetProxy {

	static Context context;

	public static Object getProxy(String jndiName) {
		Object object = null;
		try {

			context = new InitialContext();
			object = context.lookup(jndiName);

		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return object;

	}

}
