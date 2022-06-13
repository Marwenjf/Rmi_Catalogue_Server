package metier;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MetierCatalogueImpl {
	private List<Produit> produits = new ArrayList<Produit>();

	public MetierCatalogueImpl() {
		produits.add(new Produit(1L, "Assus", 600, "image1.jpg"));
		produits.add(new Produit(2L, "HP", 500, "image2.jpg"));
		produits.add(new Produit(3L, "Dell", 1000, "image3.jpg"));
	}

	public List<Produit> listProduits() {
		return produits;
	}

	public List<Produit> getProduitsParMC(String mc) {
		List<Produit> prods = new ArrayList<Produit>();
		for (Produit produit : produits) {
			if (produit.getNomProduit().indexOf(mc) >= 0) {
				prods.add(produit);
			}
		}
		return prods;
	}

	public Produit getProduit(Long idP) {
		for (Produit produit : produits) {
			if (produit.getIdProduit().equals(idP)) {
				return produit;
			}
		}
		return null;
	}

}
