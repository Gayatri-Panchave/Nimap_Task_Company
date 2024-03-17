package nim.prodCat.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProductEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer productId;
	private String productName;
	private String productPrice;
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	public ProductEntity(String productName, String productPrice) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	@Override
	public String toString() {
		return "ProductEntity [productId=" + productId + ", productName=" + productName + ", productPrice="
				+ productPrice + "]";
	}
	public ProductEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
