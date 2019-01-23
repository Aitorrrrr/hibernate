package hibernate;

import java.util.Date;

import org.hibernate.Session;

public class Main {

	public static void main(String[] args) {
		Session sesion = HibernateUtilities.getSessionFactory().openSession();
		
		//Empresa
		sesion.beginTransaction();
		Empresa eAux = new Empresa("CIFRANDOM","NOMBRERANDOM",4,"NOSEQUEMAS");
		
		sesion.save(eAux);
		sesion.getTransaction().commit();
		
		sesion.beginTransaction();
		Empresa aux2 = sesion.get(Empresa.class, "CIFRANDOM");
		
		
		System.out.println(aux2.toString());
		sesion.getTransaction().commit();
		
		//Item
		sesion.beginTransaction();
		Item iAux = new Item(1, "NOMBRERANDOM", 5);
		
		sesion.save(iAux);
		sesion.getTransaction().commit();
		
		sesion.beginTransaction();
		Item aux4 = sesion.get(Item.class, 1);
		
		
		System.out.println(aux4.toString());
		sesion.getTransaction().commit();
		
		//Pedido
		sesion.beginTransaction();
		java.util.Date utilDate = new java.util.Date();
		Date dateAux = new java.util.Date(utilDate.getTime());
		Pedido pAux = new Pedido(1, dateAux);
				
		sesion.save(pAux);
		sesion.getTransaction().commit();
				
		sesion.beginTransaction();
		Pedido aux6 = sesion.get(Pedido.class, 1);
				
				
		System.out.println(aux6.toString());
		sesion.getTransaction().commit();
		
		sesion.close();
		HibernateUtilities.getSessionFactory().close();
	}

}
