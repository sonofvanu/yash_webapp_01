package ecommerce.yash_webapp_01.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table
public class ProductModel {
	@Id
	@Column(name="Id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public
	int Id;
	@NotEmpty
	String Brand;
	@NotEmpty
	String Model;
	@NotEmpty
	String Os;
	@NotEmpty
	String Version;
	@NotEmpty
	String Price;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getOs() {
		return Os;
	}
	public void setOs(String os) {
		Os = os;
	}
	public String getVersion() {
		return Version;
	}
	public void setVersion(String version) {
		Version = version;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
@Override
public String toString(){
	return "ProductModel [Id="+Id+" , Brand="+Brand+", Model="+Model+", Os="+Os+" , Version="+Version+", Price="+Price+"]";
}
}
