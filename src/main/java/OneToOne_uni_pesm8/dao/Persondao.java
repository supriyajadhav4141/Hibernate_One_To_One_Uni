package OneToOne_uni_pesm8.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import OneToOne_uni_pesm8.dto.AadharCard;
import OneToOne_uni_pesm8.dto.Person;

public class Persondao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("supriya");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void SavePerson(Person person) {
		entityTransaction.begin();
		AadharCard aadharCard = person.getAadharCard();
		entityManager.persist(aadharCard);
		entityManager.persist(person);
		entityTransaction.commit();
	}

	public void findPerson(int id) {
		Person person = entityManager.find(Person.class, id);
		System.out.println(person);

	}

	public void findAllPersons() {
		Query query = entityManager.createQuery("select p from Person p");
		List<Person> list = query.getResultList();
		System.out.println(list);
	}

	public void deletePerson(int id) {

		Person person = entityManager.find(Person.class, id);
		if (person != null)

		{

			AadharCard aadharCard = person.getAadharCard();
			entityTransaction.begin();
			entityManager.remove(aadharCard);
			entityManager.remove(person);
			entityTransaction.commit();
		} else {
			System.out.println("id is not found");
		}

	}

	public void updatePerson(int id, Person person)

	{
		Person dbPerson = entityManager.find(Person.class, id);
		if (dbPerson!= null) 
		{
            person.setId(id);
            person.setAadharCard(dbPerson.getAadharCard());
            
            entityTransaction.begin();
            entityManager.merge(person);
            entityTransaction.commit();
		} else {
          System.out.println("id is nor found");
		}
	}
	public void updateboth(int id , Person person)
	{
		Person dbPerson = entityManager.find(Person.class, id);
		if (dbPerson!=null) {
			person.setId(id);
			person.getAadharCard().setId(dbPerson.getAadharCard().getId());
			
			entityTransaction.begin();
			entityManager.merge(person.getAadharCard());
			entityTransaction.commit();
		} else {
             System.out.println("id is not found");
		}
		
		
		
	}
}
