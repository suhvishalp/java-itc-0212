package rop.licenseapp.bo;

public class Student implements Comparable<Student> {

    private String name;

    private int score;

    public Student(String name, int score) {

          this.name = name;

          this.score = score;

    }
    
    

    // getters and setters....

    public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getScore() {
		return score;
	}



	public void setScore(int score) {
		this.score = score;
	}



	public String toString() {

          return this.name + " - " + this.score;

    }

    public int compareTo(Student another) {

          return another.getScore() - this.score;

    }

}
