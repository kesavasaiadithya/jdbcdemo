package oopsdemo3;

public class StudentDetail implements CollegeData,HostelData{

	College c1=new College("Mary",500,"Delhi University","MCA");
    
	Hostel h1=new Hostel("Ram","Block a");
	
	

	@Override
	public void hostelDetail() {
		
		System.out.println("**********Hostel Details********");
		System.out.println("Hostel Name  :"+h1.getName());
		System.out.println("Location    :+h1.getLocation()");
		
		
	}

	@Override
	public void hostelRecord() {
		System.out.println("Student Selected based on percentage & financial situation");
		
	}

	@Override
	public void collegeDetail() {
		System.out.println("*****Hostel Details*****");
		System.out.println("college name   :"+c1.getName());
		System.out.println("college id     :"+c1.getId());
		System.out.println("courses   :"+c1.getCourse());
		System.out.println("university     :"+c1.getUniversity());
		
		
	}

	@Override
	public void studentData() {
		System.out.println("Students can join courses:ME/MTECH BE/BTECH");
		
	}


public static void main(String[] args) {
	
	StudentDetail s1=new StudentDetail();
	s1.collegeDetail();
	s1.hostelRecord();
}
}