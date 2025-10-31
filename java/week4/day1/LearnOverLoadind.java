package week4.day1;

public class LearnOverLoadind {

	public void reportstep(String msg,String status) {
		System.out.println("Hello"+" "+ msg + " you are " + " "+status);
	}
	public void reportstep(String msg,String status,String snap) {
		System.out.println("hi"+" "+msg+" "+status+" "+snap);
	}

	public static void main(String[] args) {
	LearnOverLoadind learn=new LearnOverLoadind();
	learn.reportstep("ilavarasi","Passed");
	learn.reportstep("sarathy","ilavasri","sarathy");
	}

}
