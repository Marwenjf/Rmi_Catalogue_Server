package serveur;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import service.CatalogueServiceImpl;

public class ServeurRMI {

	public static void main(String[] args) {
		try {
			LocateRegistry.createRegistry(1099);
			CatalogueServiceImpl ob = new CatalogueServiceImpl();
			System.out.println(ob.toString());
			Naming.rebind("rmi://localhost:1099/CATAL", ob);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
