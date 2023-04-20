package kr.co.softsoldesk.beans;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataBean_bak2 {

	@AssertTrue
	private boolean data1;
	
	@AssertFalse
	private boolean data2;
	
	@Max(100)
	@Min(10)
	private int data3;
	
	//DecimalMax : value = 기준값 / inclusive = 기준값 포함 여부
	@DecimalMax(value = "100", inclusive = false)// 미만
	@DecimalMin(value = "10", inclusive = false)// 초과
	private int data4;

	@Null
	private String data5;
	
	@NotNull
	private String data6;

	@Digits(integer = 3, fraction = 3)
	private String data7;

	@Size(min=3, max=10)
	private String data8;
	
	@Pattern(regexp="^[0-9]+[0-9a-zA-Z]*$")
	private String data9;
	
	//@Pattern(regexp=".+@.+\\.[a-z]+")
	
	public DataBean_bak2() {
		this.data1 = true;
		this.data2 = false;
		this.data3 = 50;
		this.data4 = 50;
		this.data5 = null;
		this.data6 = "check2";
		this.data7 = "111.111";
		this.data8 = "12345";
		this.data9 = "abCD";
	}
}
