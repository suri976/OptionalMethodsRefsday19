package com.java8;
import java.util.*;

public class Course {//implements Comparable  
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", title=" + title + ", duration=" + duration + ", fee=" + fee + "]";
	}





	String courseId,title;
	int duration;
	double fee;
	
	public Course(String courseId, String title, int duration, double fee) {
		super();
		this.courseId = courseId;
		this.title = title;
		this.duration = duration;
		this.fee = fee;
	}

	
	public String getCourseId() {
		return courseId;
	}


	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public double getFee() {
		return fee;
	}


	public void setFee(double fee) {
		this.fee = fee;
	}


	


//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		Course ref =(Course) o;
//		if(this.courseId.compareTo(ref.getCourseId())<0)
//			return -1;
//		else if(this.courseId.compareTo(ref.getCourseId())==0)
//			return 0;
//		else if(this.courseId.compareTo(ref.getCourseId())>0)
//			return 1;
//		
//		return 0;
//	}

}