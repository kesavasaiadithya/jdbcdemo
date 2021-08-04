package oopsdemo3;
// iplement multiple Inhreitance
class Result extends Candidate implements Exam
{

	public Result(String name, int roll_no, int mark1, int mark2) {
		super(name, roll_no, mark1, mark2);
		
	}

	@Override
	public void percent_cal() {
		int total=(mark1+mark2);
        float percent=total*100/200;
        System.out.println ("Percentage: "+percent+"%");
			
	}
	void display()
    {
        super.display();
    }
	
}

public class MultipleDemo {

	public static void main(String[] args) {
		
		Result r1=new Result("Kesava",100,100,100);
		r1.display();
		r1.percent_cal();
}

}