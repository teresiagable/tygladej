package gable.tygladej.entity;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String pictureUrl;
	private String email;
	private String password;
	private LocalDateTime createDate;
	private LocalDateTime lastLoginDate;

	
	/**
	 * @param name
	 * @param pictureUrl
	 * @param email
	 * @param password
	 * @param createDate
	 * @param lastLoginDate
	 */
	public User(String name, String pictureUrl, String email, String password, LocalDateTime createDate,
			LocalDateTime lastLoginDate) {
		this.name = name;
		this.pictureUrl = pictureUrl;
		this.email = email;
		this.password = password;
		this.createDate = createDate;
		this.lastLoginDate = lastLoginDate;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPictureUrl() {
		return pictureUrl;
	}
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDateTime getLastLoginDate() {
		return lastLoginDate;
	}
	public void setLastLoginDate(LocalDateTime lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	public int getId() {
		return id;
	}
	public LocalDateTime getCreateDate() {
		return createDate;
	}	
	
	
	
	
}
