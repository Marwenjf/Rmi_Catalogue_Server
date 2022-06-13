package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import metier.Produit;

public interface ICatalogueRemote extends Remote{
   public List<Produit> consulterProduisParMC(String mc) throws RemoteException;
   public List<Produit> consulterProduis() throws RemoteException;
   public Produit consulterProdui(Long idProduit) throws RemoteException;
   public double getPrixMoyen() throws RemoteException;
}
