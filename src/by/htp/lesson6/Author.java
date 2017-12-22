package by.htp.lesson6;

public class Author {
	private String firstName="Vasili";
	private String surName="Pupkin";
	private String patronymic="Authoroich";
	private int birthYear;
	
	public Author() {
		
	}
	
	public Author(String surName, String firstName, String patronymic, int birthYear) {
		this.surName = surName;
		this.firstName = firstName;
		this.patronymic = patronymic;
		this.birthYear = birthYear;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getPatronymic() {
		return patronymic;
	}
	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
}
