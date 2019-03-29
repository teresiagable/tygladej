package gable.tygladej.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class UserFabric {
	
	@Id
	private int id;
	@ManyToMany(cascade = {CascadeType.PERSIST})
	
	private int fabricId;
	private int userId;
	private int length;
	private LocalDateTime purchaseDate;
	private String purchasePoint;
	private boolean preWashed;
	private boolean showPublic;
	private boolean forSale;
	
	
	/**
	 * @param fabricId
	 * @param userId
	 * @param length in cm
	 * @param purchaseDate
	 * @param purchasePoint 
	 * @param preWashed true/false
	 * @param showPublic true/false
	 * @param forSale true/false
	 */
	public UserFabric(int fabricId, int userId, int length, LocalDateTime purchaseDate, String purchasePoint, boolean preWashed,
			boolean showPublic, boolean forSale) {
		this.fabricId = fabricId;
		this.userId = userId;
		this.length = length;
		this.purchaseDate = purchaseDate;
		this.purchasePoint = purchasePoint;
		this.preWashed = preWashed;
		this.showPublic = showPublic;
		this.forSale = forSale;
	}
	public int getId() {return id;}
	public int getFabricId() {return fabricId;}
	public int getUserId() {return userId;}
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


	

}
