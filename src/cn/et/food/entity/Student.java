package cn.et.food.entity;

import java.math.BigDecimal;

public class Student {
	/**
	 * 
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column STUDENT.S#
	 * 
	 * @mbg.generated Wed Nov 29 22:30:47 CST 2017
	 */
	private BigDecimal s;

	/**
	 * 
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column STUDENT.SNAME
	 * 
	 * @mbg.generated Wed Nov 29 22:30:47 CST 2017
	 */
	private String sname;

	/**
	 * 
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column STUDENT.SAGE
	 * 
	 * @mbg.generated Wed Nov 29 22:30:47 CST 2017
	 */
	private BigDecimal sage;

	/**
	 * 
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column STUDENT.SSEX
	 * 
	 * @mbg.generated Wed Nov 29 22:30:47 CST 2017
	 */
	private String sex;

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column STUDENT.S#
	 * 
	 * @return the value of STUDENT.S#
	 * 
	 * @mbg.generated Wed Nov 29 22:30:47 CST 2017
	 */
	public BigDecimal getS() {
		return s;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column STUDENT.S#
	 * 
	 * @param s
	 *            the value for STUDENT.S#
	 * 
	 * @mbg.generated Wed Nov 29 22:30:47 CST 2017
	 */
	public void setS(BigDecimal s) {
		this.s = s;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column STUDENT.SNAME
	 * 
	 * @return the value of STUDENT.SNAME
	 * 
	 * @mbg.generated Wed Nov 29 22:30:47 CST 2017
	 */
	public String getSname() {
		return sname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column STUDENT.SNAME
	 * 
	 * @param sname
	 *            the value for STUDENT.SNAME
	 * 
	 * @mbg.generated Wed Nov 29 22:30:47 CST 2017
	 */
	public void setSname(String sname) {
		this.sname = sname == null ? null : sname.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column STUDENT.SAGE
	 * 
	 * @return the value of STUDENT.SAGE
	 * 
	 * @mbg.generated Wed Nov 29 22:30:47 CST 2017
	 */
	public BigDecimal getSage() {
		return sage;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column STUDENT.SAGE
	 * 
	 * @param sage
	 *            the value for STUDENT.SAGE
	 * 
	 * @mbg.generated Wed Nov 29 22:30:47 CST 2017
	 */
	public void setSage(BigDecimal sage) {
		this.sage = sage;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column STUDENT.SSEX
	 * 
	 * @return the value of STUDENT.SSEX
	 * 
	 * @mbg.generated Wed Nov 29 22:30:47 CST 2017
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column STUDENT.SSEX
	 * 
	 * @param ssex
	 *            the value for STUDENT.SSEX
	 * 
	 * @mbg.generated Wed Nov 29 22:30:47 CST 2017
	 */
	public void setSex(String sex) {
		this.sex = sex == null ? null : sex.trim();
	}
}