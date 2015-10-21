package com.dynamo.domain;

public class StaticClass {
	public static int staticValue = -1;
	private int privateValue = -1;
	
	/**
	 * 
	 */
	public StaticClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param privateValue
	 */
	public StaticClass(int privateValue) {
		super();
		this.privateValue = privateValue;
	}
	/**
	 * @return the privateValue
	 */
	public int getPrivateValue() {
		return privateValue;
	}
	/**
	 * @param privateValue the privateValue to set
	 */
	public void setPrivateValue(int privateValue) {
		this.privateValue = privateValue;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StaticClass [privateValue=" + privateValue +"\tstaticValue="+staticValue+ "]";
	}
	
}
