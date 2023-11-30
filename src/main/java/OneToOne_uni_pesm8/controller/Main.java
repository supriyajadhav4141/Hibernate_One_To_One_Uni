package OneToOne_uni_pesm8.controller;



import OneToOne_uni_pesm8.dao.AadharCardDao;
import OneToOne_uni_pesm8.dao.Persondao;
import OneToOne_uni_pesm8.dto.AadharCard;
import OneToOne_uni_pesm8.dto.Person;

public class Main {
	public static void main(String[] args) {

		AadharCard aadharCard = new AadharCard();
//		aadharCard.setId(103);
aadharCard.setName("super");
	aadharCard.setAddress("karve");
////
	Person person = new Person();
	//person.setId(3);
	person.setName("adya");
person.setPhone(9834184343l);
	person.setAddress("nagar");
	person.setAadharCard(aadharCard);

	Persondao persondao = new Persondao();
//	AadharCardDao aadharCardDao = new AadharCardDao();
//		persondao.SavePerson(person);
		persondao.findPerson(1);
//		persondao.findAllPersons();
//		persondao.deletePerson(4);
//	aadharCardDao.updateAadhard(101,aadharCard);
//		persondao.updatePerson(2, person);
//	persondao.updateboth(1, person);
		
	}
}
