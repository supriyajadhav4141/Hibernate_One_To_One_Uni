package OneToOne_uni_pesm8.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import OneToOne_uni_pesm8.dto.AadharCard;
import OneToOne_uni_pesm8.dto.Person;

public class AadharCardDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("supriya");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public void updateAadhard(int id, AadharCard ac)
	
	{
		AadharCard dbAadharCard  = entityManager.find(AadharCard.class, id);
		if(dbAadharCard!=null)
		{
		ac.setId(id);
		entityTransaction.begin();
		entityManager.merge(ac);
		entityTransaction.commit();
		}
		else {
			System.out.println("id is not found");
		}
	}
	  
	
}
