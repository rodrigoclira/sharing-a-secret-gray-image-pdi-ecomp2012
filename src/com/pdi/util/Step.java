package com.pdi.util;

public class Step {

	public int [][] B1;
	public int [][] B2;
	public double [] K1;
	public double [] K2;
	
	public Step(int [][] B1, int [][] B2, double [] K1, double [] K2){
		this.B1 = B1;
		this.B2 = B2;
		this.K1 = K1;
		this.K2 = K2;
	}
	
	public Step(int [][] B1, int [][] B2){
		this(B1,B2,null,null);
	}
	
	public Step(double [] K1, double [] K2){
		this(null,null, K1, K2);
	}

	public int[][] getB1() {
		return B1;
	}

	public void setB1(int[][] b1) {
		B1 = b1;
	}

	public int[][] getB2() {
		return B2;
	}

	public void setB2(int[][] b2) {
		B2 = b2;
	}

	public double[] getK1() {
		return K1;
	}

	public void setK1(double[] k1) {
		K1 = k1;
	}

	public double[] getK2() {
		return K2;
	}

	public void setK2(double[] k2) {
		K2 = k2;
	}
	
}
