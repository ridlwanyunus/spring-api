package com.example.devops.api;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kontak")
public class Kontak {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idKontak;
	
	@Column(name = "nomor_hp")
	private String nomorHp;
	
	public Kontak() {
		
	}
	

	public int getIdKontak() {
		return idKontak;
	}

	public void setIdKontak(int idKontak) {
		this.idKontak = idKontak;
	}

	public String getNomorHp() {
		return nomorHp;
	}

	public void setNomorHp(String nomorHp) {
		this.nomorHp = nomorHp;
	}
	
	
}
