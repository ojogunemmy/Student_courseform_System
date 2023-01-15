package application;

public class Entry {
	int number,creditLoad;
	String courseCode;
	String courseTitle;
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public Entry(int number, int creditLoad, String courseCode, String courseTitle) {
		super();
		this.number = number;
		this.creditLoad = creditLoad;
		this.courseCode = courseCode;
		this.courseTitle = courseTitle;
	}
	public Entry(int number, int creditLoad, String courseCode) {
		this.number = number;
		this.creditLoad = creditLoad;
		this.courseCode = courseCode;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getCreditLoad() {
		return creditLoad;
	}
	public void setCreditLoad(int creditLoad) {
		this.creditLoad = creditLoad;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	} 
	

}
