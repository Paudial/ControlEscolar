
package mx.com.controlEscolar.models;


public class PaginationFormCriteria {
	private Integer number;
	private boolean isAscending;
	
	/**
	 * default empty constructor
	 */
	public PaginationFormCriteria () {
		number = 5;
		isAscending = true;
	}
	
	/**
	 * @param number
	 * @param isAscending
	 */
	public PaginationFormCriteria(Integer number, boolean isAscending) {
		this.number = number;
		this.isAscending = isAscending;
	}
	/**
	 * @return the number
	 */
	public Integer getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(Integer number) {
		this.number = number;
	}
	/**
	 * @return the isAscending
	 */
	public boolean getIsAscending() {
		return isAscending;
	}
	/**
	 * @param isAscending the isAscending to set
	 */
	public void setIsAscending(boolean isAscending) {
		this.isAscending = isAscending;
	}
	
	
	
}
