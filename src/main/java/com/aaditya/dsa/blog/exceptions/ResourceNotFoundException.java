package com.aaditya.dsa.blog.exceptions;

public class ResourceNotFoundException  extends RuntimeException{

	 String recourceName;
	 String fieldName;
	 long fieldValue;
	public ResourceNotFoundException(String resourceName, String fieldName, long fieldValue) {
		super(String.format("%s not found with %s : %s",resourceName,fieldName,fieldValue));
		this.recourceName = recourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
	public String getRecourceName() {
		return recourceName;
	}
	public void setRecourceName(String recourceName) {
		this.recourceName = recourceName;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public long getFieldValue() {
		return fieldValue;
	}
	public void setFieldValue(long fieldValue) {
		this.fieldValue = fieldValue;
	}
	 
}
