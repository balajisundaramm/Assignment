package com.balaji.assignment.Collection;

public class Employee {
	private String ename;
	private int eno;
	private String job;
	
	public Employee(String ename, int eno, String job) {
		super();
		this.ename = ename;
		this.eno = eno;
		this.job = job;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());
		result = prime * result + eno;
		result = prime * result + ((job == null) ? 0 : job.hashCode());
		return result;
	}


	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (ename == null) {
			if (other.ename != null)
				return false;
		} else if (!ename.equals(other.ename))
			return false;
		if (eno != other.eno)
			return false;
		if (job == null) {
			if (other.job != null)
				return false;
		} else if (!job.equals(other.job))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eno=" + eno + ", job=" + job + "]";
	}


}
