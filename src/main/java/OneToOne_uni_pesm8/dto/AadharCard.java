package OneToOne_uni_pesm8.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "a_card") //to change aadhardcard to a_card to use table
public class AadharCard {
	@Id
	@Column(name = "a_id") // to change id to a_id to use column
	private int id;
	private String name;
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "AadharCard [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
