package br.com.erudio.data.vo.v1;



import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.github.dozermapper.core.Mapping;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.util.Objects;

@JsonPropertyOrder({"id", "key", "Primeiro_Nome", "Ultimo_Nome", "gender", "address"})
public class PersonVO extends RepresentationModel implements Serializable {

	private static final long serialVersionUID = 1L;
	//@JsonIgnore
	@Mapping("id")
	@JsonProperty("Id")
	private Long key;

	@JsonProperty("Primeiro_Nome")
	private String firstName;
	@JsonProperty("Ultimo_Nome")
	private String lastName;
	private String address;
	private String gender;

	public PersonVO() {}


	public Long getKey() {return key;}

	public void setKey(Long key) {this.key = key;}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof PersonVO vo)) return false;
		if (!super.equals(o)) return false;
        return Objects.equals(key, vo.key) && Objects.equals(firstName, vo.firstName) && Objects.equals(lastName, vo.lastName) && Objects.equals(address, vo.address) && Objects.equals(gender, vo.gender);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), key, firstName, lastName, address, gender);
	}
}