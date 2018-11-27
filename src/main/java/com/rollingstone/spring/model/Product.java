package com.rollingstone.spring.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product")
public class Product {

	 @Id
	    private String id;
	 
	private String productId;
	
	private String productCode;

	private String productName;

	private String shortDescription;

	private String longDescription;

	private boolean canDisplay;

	private boolean isDeleted;

	private boolean isAutomotive;

	private boolean isInternational;
	
	private Category category;
	
	private Category parentCategory;

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public boolean isCanDisplay() {
		return canDisplay;
	}

	public void setCanDisplay(boolean canDisplay) {
		this.canDisplay = canDisplay;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public boolean isAutomotive() {
		return isAutomotive;
	}

	public void setAutomotive(boolean isAutomotive) {
		this.isAutomotive = isAutomotive;
	}

	public boolean isInternational() {
		return isInternational;
	}

	public void setInternational(boolean isInternational) {
		this.isInternational = isInternational;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Category getParentCategory() {
		return parentCategory;
	}

	public void setParentCategory(Category parentCategory) {
		this.parentCategory = parentCategory;
	}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	

	public Product() {
		super();
	}

	public Product(String id, String productId, String productCode, String productName, String shortDescription,
			String longDescription, boolean canDisplay, boolean isDeleted, boolean isAutomotive,
			boolean isInternational, Category category, Category parentCategory) {
		super();
		this.id = id;
		this.productId = productId;
		this.productCode = productCode;
		this.productName = productName;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		this.canDisplay = canDisplay;
		this.isDeleted = isDeleted;
		this.isAutomotive = isAutomotive;
		this.isInternational = isInternational;
		this.category = category;
		this.parentCategory = parentCategory;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productId=" + productId + ", productCode=" + productCode + ", productName="
				+ productName + ", shortDescription=" + shortDescription + ", longDescription=" + longDescription
				+ ", canDisplay=" + canDisplay + ", isDeleted=" + isDeleted + ", isAutomotive=" + isAutomotive
				+ ", isInternational=" + isInternational + ", category=" + category + ", parentCategory="
				+ parentCategory + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (canDisplay ? 1231 : 1237);
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (isAutomotive ? 1231 : 1237);
		result = prime * result + (isDeleted ? 1231 : 1237);
		result = prime * result + (isInternational ? 1231 : 1237);
		result = prime * result + ((longDescription == null) ? 0 : longDescription.hashCode());
		result = prime * result + ((parentCategory == null) ? 0 : parentCategory.hashCode());
		result = prime * result + ((productCode == null) ? 0 : productCode.hashCode());
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + ((shortDescription == null) ? 0 : shortDescription.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (canDisplay != other.canDisplay)
			return false;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isAutomotive != other.isAutomotive)
			return false;
		if (isDeleted != other.isDeleted)
			return false;
		if (isInternational != other.isInternational)
			return false;
		if (longDescription == null) {
			if (other.longDescription != null)
				return false;
		} else if (!longDescription.equals(other.longDescription))
			return false;
		if (parentCategory == null) {
			if (other.parentCategory != null)
				return false;
		} else if (!parentCategory.equals(other.parentCategory))
			return false;
		if (productCode == null) {
			if (other.productCode != null)
				return false;
		} else if (!productCode.equals(other.productCode))
			return false;
		if (productId != other.productId)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (shortDescription == null) {
			if (other.shortDescription != null)
				return false;
		} else if (!shortDescription.equals(other.shortDescription))
			return false;
		return true;
	}

	
	
}
