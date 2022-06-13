package service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import metier.MetierCatalogueImpl;
import metier.Produit;

public class CatalogueServiceImpl extends UnicastRemoteObject implements ICatalogueRemote{
    private MetierCatalogueImpl metier = new MetierCatalogueImpl();
	public CatalogueServiceImpl() throws RemoteException {
		
	}

	@Override
	public List<Produit> consulterProduisParMC(String mc) throws RemoteException {
		// TODO Auto-generated method stub
		return metier.getProduitsParMC(mc);
	}

	@Override
	public List<Produit> consulterProduis() throws RemoteException {
		// TODO Auto-generated method stub
		return metier.listProduits();
	}

	@Override
	public Produit consulterProdui(Long idProduit) throws RemoteException {
		// TODO Auto-generated method stub
		return metier.getProduit(idProduit);
	}

	@Override
	public double getPrixMoyen() throws RemoteException {
        List<Produit> produits = metier.listProduits();
        double somme = 0;
        for (Produit produit : produits) {
			somme+=produit.getPrix();
		}		
		return somme/produits.size();
	}
	
	

}
