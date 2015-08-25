package exel.read;

import java.io.File;
import java.io.IOException;

import exel.model.ModelXml;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;



public class ReadExel {
	
	@SuppressWarnings("static-access")
	public void readExel(String name){
		
		Workbook workBook = null;
		ModelXml model = null;
		
		try {
			workBook = workBook.getWorkbook(new File("C:\\Users\\P\\Desktop\\ExelFile\\"+name));
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Sheet sheet = workBook.getSheet(0);
		
		for(int i =1 ; i<7 ; i++){
			model = new ModelXml();
			Cell kod = sheet.getCell(0,i);
			Cell title = sheet.getCell(1,i);
			Cell price = sheet.getCell(3,i);
			String test = model.setSource(i, price.getContents(), kod.getContents(), title.getContents());
			System.out.println(test);
			System.out.println(price.getContents());
			System.out.println("--------------------");
		}
		
		workBook.close();
	}

}
