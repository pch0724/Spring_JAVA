package kr.co.softsoldesk.beans;

import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataBean_bak4 {
	
	@Size(min=2, max=10)
	private String data1;
	
	private String data2;
	
	private String data3;
	
}
