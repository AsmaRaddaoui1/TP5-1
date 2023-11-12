package rmiServer;

import rmiService.ConversionImpl;

public class ConversionServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConversionImpl convert=new ConversionImpl();
		System.out.println("le montant converti est :" +convert.convertirMontant(2500));
	}

}