package gable.tygladej.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_fabric")
public class UserFabric {
	
	@Id
	private int id;
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="fabric_id")
	private Fabric fabric;
	private int length;
	private LocalDateTime purchaseDate;
	private String purchasePoint;
	private boolean preWashed;
	private boolean showPublic;
	private boolean forSale;

	

	/**
	 * @param id
	 * @param fabric
	 * @param user
	 * @param length
	 * @param purchaseDate
	 * @param purchasePoint
	 * @param preWashed
	 * @param showPublic
	 * @param forSale
	 */
	public UserFabric(int id, Fabric fabric, User user, int length, LocalDateTime purchaseDate, String purchasePoint,
			boolean preWashed, boolean showPublic, boolean forSale) {
		this.id = id;
		this.fabric = fabric;
		this.user = user;
		this.length = length;
		this.purchaseDate = purchaseDate;
		this.purchasePoint = purchasePoint;
		this.preWashed = preWashed;
		this.showPublic = showPublic;
		this.forSale = forSale;
	}



	public UserFabric() {}


	public int getId() {return id;}
	public int getLength() {return length;}
	public void setLength(int length) {this.length = length;}
	public LocalDateTime getPurchaseDate() {return purchaseDate;}
	public void setPurchaseDate(LocalDateTime purchaseDate) {this.purchaseDate = purchaseDate;}
	public String getPurchasePoint() {return purchasePoint;}
	public void setPurchasePoint(String purchasePoint) {this.purchasePoint = purchasePoint;}
	public boolean isPreWashed() {return preWashed;}
	public void setPreWashed(boolean preWashed) {this.preWashed = preWashed;}
	public boolean isShowPublic() {return showPublic;	}
	public void setShowPublic(boolean showPublic) {this.showPublic = showPublic;}
	public boolean isForSale() {return forSale;	}
	public void setForSale(boolean forSale) {this.forSale = forSale;}

	public User getUser() {
		return user;	}
	public void setUser(User user) {
		this.user = user;	}

	public Fabric getFabric() {
		return fabric;	}
	public void setFabric(Fabric fabric) {
		this.fabric = fabric;	}


	@Override
	public String toString() {
		return "UserFabric [id=" + id + ", length=" + length + ", purchaseDate=" + purchaseDate + ", purchasePoint="
				+ purchasePoint + ", preWashed=" + preWashed + ", showPublic=" + showPublic + ", forSale=" + forSale
				+ ", user=" + user.getName() + ", fabric=" + fabric.getName() 
				+ "]";
	}
}
