package Utilities;

import java.util.ArrayList;
import java.util.TreeMap;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class DataProviders{
	public static void main(String[] args) {
		try {
			generateGloabalData("101","Sheet1");
		} catch (FilloException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static TreeMap<String, String> generateGloabalData(String testid,String module) throws FilloException{
		
		Fillo f = new Fillo();
		TreeMap<String,String> map=null;
		Connection conn=f.getConnection(".\\src\\test\\resources\\data\\data.xlsx");
		Recordset r = conn.executeQuery("select * from "+module+" where testiid='"+testid+"'");
		ArrayList<String> fieldnames= r.getFieldNames();
		
		while(r.next())
		{
			map = new TreeMap<String,String>(String.CASE_INSENSITIVE_ORDER);
			for (String s: fieldnames)
				map.put(s, r.getField(s));
		}
		
		return map;
	}
	
	
	
	

}
