package gable.tygladej.forms_and_views;

import java.time.LocalDateTime;

import gable.tygladej.entity.Colorways;
import gable.tygladej.entity.Fabric;
import gable.tygladej.entity.FabricType;
import gable.tygladej.entity.Prints;
import gable.tygladej.entity.User;

public class UserFabricForm {

//	 * UserFabric class
//	 * 
//	 * @param id
//	 * @param fabric
//	 * @param user
//	 * @param length
//	 * @param purchaseDate
//	 * @param purchasePoint
//	 * @param preWashed
//	 * @param showPublic
//	 * @param forSale
//	 */
	
	private int id;
	private String userName;
	private String fabricName;
	private FabricType type;
	private Prints print;
	private Colorways color;
	private int length;
	private LocalDateTime purchaseDate;
	private String purchasePoint;
	private boolean preWashed;
	private boolean showPublic;
	private boolean forSale;
	
	
	public UserFabricForm() {

	}

	public UserFabricForm(int id, User user, Fabric fabric, int length, LocalDateTime purchaseDate,
			String purchasePoint, boolean preWashed, boolean showPublic, boolean forSale) {
		this.id = id;
		this.userName =user.getName();
		this.fabricName = fabric.getName();
		this.type = fabric.getType();
		this.print=fabric.getPrint();
		this.color = fabric.getColorway();
		this.length = length;
		this.purchaseDate = purchaseDate;
		this.purchasePoint = purchasePoint;
		this.preWashed = preWashed;
		this.showPublic = showPublic;
		this.forSale = forSale;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFabricName() {
		return fabricName;
	}

	public void setFabricName(String fabricName) {
		this.fabricName = fabricName;
	}

	public FabricType getType() {
		return type;
	}

	public void setType(FabricType type) {
		this.type = type;
	}

	public Prints getPrint() {
		return print;
	}

	public void setPrint(Prints print) {
		this.print = print;
	}

	public Colorways getColor() {
		return color;
	}

	public void setColor(Colorways color) {
		this.color = color;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public LocalDateTime getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(LocalDateTime purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getPurchasePoint() {
		return purchasePoint;
	}

	public void setPurchasePoint(String purchasePoint) {
		this.purchasePoint = purchasePoint;
	}

	public boolean isPreWashed() {
		return preWashed;
	}

	public void setPreWashed(boolean preWashed) {
		this.preWashed = preWashed;
	}

	public boolean isShowPublic() {
		return showPublic;
	}

	public void setShowPublic(boolean showPublic) {
		this.showPublic = showPublic;
	}

	public boolean isForSale() {
		return forSale;
	}

	public void setForSale(boolean forSale) {
		this.forSale = forSale;
	}
	
	
	
	
	

	
	
}
