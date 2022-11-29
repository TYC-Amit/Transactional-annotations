package com.te.transaction.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Dept {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long deptId;
	private String deptName;
	private String deptCode;
}
