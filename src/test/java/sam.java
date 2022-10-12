import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.By;

public class sam extends BaseClass{
	
	public static void main(String[] args) throws IOException {
		
	
		String mobile=getExcelDataNum("C:\\Project\\excel\\TestData.xlsx","Keywords");
		System.out.println(mobile);	
	}

}
