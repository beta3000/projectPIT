package com.mycompany.ws.daos;

public abstract class DAOFactory {

	public static final int MYSQL = 1;
	public static final int ORACLE = 2;
	
	// Objetos DAO

	// Se aplica polimorfismo
	public static DAOFactory getFactory(int bd){
		switch (bd) {
		case MYSQL:
			return new MySQLDAOFactory();

		}
		return null;
	}
}
