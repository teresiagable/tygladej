package gable.tygladej.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fabric {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String pictureUrl;
	private String type;

	private String print;
	private String colorway;
	private String designer;
	private boolean isDeleted;

		
	/**
	 * @param name
	 * @param pictureUrl
	 * @param type use Enum FabricType
	 * @param print use Enum Prints
	 * @param colorway use Enum Colorways
	 * @param designer 
	 */
	
	public Fabric(String name, String pictureUrl, String type, String print, String colorway, String designer) {
		this.name = name;
		this.pictureUrl = pictureUrl;
		this.type = type;
		this.print = print;
		this.colorway = colorway;
		this.designer = designer;
		this.isDeleted = false;	
	}
	
	public Fabric() {
		super();
	}



	public int getId() {return id;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getPictureUrl() {return pictureUrl;}
	public void setPictureUrl(String pictureUrl) {this.pictureUrl = pictureUrl;}
	public String getType() {return type;}
	public void setType(String type) {this.type = type;}
	public String getPrint() {return print;}
	public void setPrint(String print) {this.print = print;}
	public String getColorway() {return colorway;}
	public void setColorway(String colorway) {this.colorway = colorway;}
	public String getDesigner() {return designer;}
	public void setDesigner(String designer) {this.designer = designer;}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Override
	public String toString() {
		return "Fabric [id=" + id + ", name=" + name + ", pictureUrl=" + pictureUrl + ", type=" + type + ", print="
				+ print + ", colorway=" + colorway + ", designer=" + designer + "]";
	}

	
	

}
