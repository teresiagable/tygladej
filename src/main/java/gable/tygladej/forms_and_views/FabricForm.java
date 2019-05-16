package gable.tygladej.forms_and_views;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class FabricForm {
	private int id;
	
	@NotBlank(message = "This field is required")
	@Size(min = 2, message = "Need to have at least 2 characters")
	private String name;

	private String pictureUrl;
	private String type;

	private String print;				
	private String colorway;
	private String designer;
	private boolean isDeleted;	
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
	public String getPictureUrl() {
		return pictureUrl;
	}
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPrint() {
		return print;
	}
	public void setPrint(String print) {
		this.print = print;
	}
	public String getColorway() {
		return colorway;
	}
	public void setColorway(String colorway) {
		this.colorway = colorway;
	}
	public String getDesigner() {
		return designer;
	}
	public void setDesigner(String designer) {
		this.designer = designer;
	}
	public boolean isDeleted() {
		return isDeleted;
	}
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	

}
