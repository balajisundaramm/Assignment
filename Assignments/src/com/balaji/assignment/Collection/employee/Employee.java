package com.balaji.assignment.Collection.employee;
/**
 * 
 * @author spaneos
 *
 */
public class Employee {
	private String ename;
	private int eno;
	private String job;
	/**Parameterized Constructor to Instantiate the Employee object
	 * @param ename Input value - Name of the Employee
	 * @param eno Input value - Employee id
	 * @param job Input value-Designation
	 */
	public Employee(String ename, int eno, String job) {
		super();
		this.ename = ename;
		this.eno = eno;
		this.job = job;
	}
	/**
	 * @return the ename
	 */
	public String getEname() {
		return ename;
	}
	/**
	 * @param ename the ename to set
	 */
	public void setEname(String ename) {
		this.ename = ename;
	}
	/**
	 * @return the eno
	 */
	public int getEno() {
		return eno;
	}
	/**
	 * @param eno the eno to set
	 */
	public void setEno(int eno) {
		this.eno = eno;
	}
	/**
	 * @return the job
	 */
	public String getJob() {
		return job;
	}
	/**
	 * @param job the job to set
	 */
	public void setJob(String job) {
		this.job = job;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());
		result = prime * result + eno;
		result = prime * result + ((job == null) ? 0 : job.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eno=" + eno + ", job=" + job + "]";
	}
	
	
}
