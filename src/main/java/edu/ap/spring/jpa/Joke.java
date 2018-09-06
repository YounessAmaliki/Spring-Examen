package edu.ap.spring.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Joke {
    @Id
    @GeneratedValue

    @Column
    private String firstName;

	@Column
    private String lastName;
    
    @Column
    private int grade;

    public Joke() {}
    
    public Joke(String firstName, String lastName) {
	    	this.firstName = firstName;
	    	this.lastName = lastName;
    }
    
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

}
