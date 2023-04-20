package kr.co.softsoldesk.beans;

import javax.validation.constraints.Email;
import javax.validation.constraints.Negative;
import javax.validation.constraints.NegativeOrZero;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataBean_bak3 {

	@NotEmpty // 공백(&nbsp;) 허용함
	private String data1;
	
	@NotBlank // 공백 허용하지 않음
	private String data2;
	
	//0보다 커야함(양수)
	@Positive
	private int data3;
	
	//0 또는 양수만 허용
	@PositiveOrZero
	private int data4;
	
	//음수만 허용
	@Negative
	private int data5;
	
	//0 또는 음수만 허용
	@NegativeOrZero
	private int data6;
	
	@Email
	private String data7;
		
	public DataBean_bak3() {
			this.data1 = "abcd";
			this.data2 = "abcd";
			this.data3 = 50;
			this.data4 = 50;
			this.data5 = -50;
			this.data6 = -50;
		}
}
