package gameProject.Entity;

public class Gamer {
	public Gamer() {

	}

	private int idNumber;
	private String birthDay;
	private String firstName;
	private String lastName;
	private String nickName;
	private String identityNumber;

	public Gamer(int idNumber, String birthDay, String firstName, String lastName, String nickName,
			String identityNumber) {
		
		this.idNumber = idNumber;
		this.birthDay = birthDay;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nickName = nickName;
		this.identityNumber = identityNumber;
	}

	
	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}


	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
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