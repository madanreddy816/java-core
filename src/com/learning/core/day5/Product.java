package com.learning.core.day5;

import java.util.Objects;

public class Product 
{
	private String ProductId;
	private String ProductName;
	
	public Product() {
		super();
	}

	public Product(String productId, String productName) 
	{
		super();
		this.ProductId = productId;
		this.ProductName = productName;
	}

	public String getProductId() 
	{
		return ProductId;
	}

	public void setProductId(String productId)
	{
		this.ProductId = productId;
	}

	public String getProductName() 
	{
		return ProductName;
	}

	public void setProductName(String productName) 
	{
		this.ProductName = productName;
	}

	@Override
	public String toString() {
		return " ProductId=" + ProductId + " ProductName=" + ProductName + "";
	}

	@Override
	public int hashCode() {
		return Objects.hash(ProductId, ProductName);
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
		return ProductId.equals(other.ProductId) && Objects.equals(ProductName, other.ProductName);
	}
}
