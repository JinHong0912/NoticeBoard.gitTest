package com.test.board.model;

import javax.xml.crypto.Data;

public class BoardVO {
	


//	+-----------+--------------+------+-----+---------+----------------+
//	| Field     | Type         | Null | Key | Default | Extra          |
//	+-----------+--------------+------+-----+---------+----------------+
//	| pid       | int          | NO   | PRI | NULL    | auto_increment |
//	| b_name    | varchar(50)  | NO   |     | NULL    |                |
//	| b_title   | varchar(20)  | YES  |     | NULL    |                |
//	| b_content | varchar(200) | YES  |     | NULL    |                |
//	| b_date    | datetime     | YES  |     | NULL    |                |
//	| b_hit     | int          | YES  |     | NULL    |                |
//	+-----------+--------------+------+-----+---------+----------------+
	
	
	private int pid;
	private String b_name;
	private String b_title;
	private String b_content;
	private int b_hit;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public String getB_title() {
		return b_title;
	}
	public void setB_title(String b_title) {
		this.b_title = b_title;
	}
	public String getB_content() {
		return b_content;
	}
	public void setB_content(String b_content) {
		this.b_content = b_content;
	}
	public int getB_hit() {
		return b_hit;
	}
	public void setB_hit(int b_hit) {
		this.b_hit = b_hit;
	}
	
	
	
		
}
