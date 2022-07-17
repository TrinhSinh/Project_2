/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Toan {
    public static final String ten="Toan";
    public float diem;
	public Toan() {
		
	}
	public Toan(float diem) {
		super();
		this.diem = diem;
	}
	public float getDiem() {
		return diem;
	}
	public void setDiem(float diem) {
		this.diem = diem;
	}
	public static String getTen() {
		return ten;
	}
    
}
