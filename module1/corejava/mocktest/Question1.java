package mocktest;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Question1 {
	
	
	public  List<List<String>> extractLogs(List<List<String>> logs) {
		
		//to store the return value
		List<List<String>> resultList = new ArrayList<>();
		
		//filter list of array list based on status
		for(List<String> strList : logs) {
			List<String> st = strList;
			String status = st.get(2);
			if(status.equals("error")) {
				resultList.add(st);
			}
		}
		
		//sort the resultList based on date
		for(List<String> rList : resultList) {
			List<String> sList = rList;
			String st = sList.get(0);
			
			//convert String date to LocalDate			
			DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd-MM-yyyy");			
			LocalDate ldate = LocalDate.parse(st, sdf);
			System.out.println(ldate);
		}
		
		
		return resultList;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list1 = new ArrayList<>();
		list1.add("20-12-2022");
		list1.add("10:30");
		list1.add("error");
		list1.add("failed");
		
		List<String> list2 = new ArrayList<>();
		list2.add("20-12-2023");
		list2.add("10:30");
		list2.add("success");
		list2.add("f");
		
		List<String> list3 = new ArrayList<>();
		list3.add("20-12-2022");
		list3.add("10:30");
		list3.add("error");
		list3.add("failed");
		
		List<String> list4 = new ArrayList<>();
		list4.add("20-12-2022");
		list4.add("10:30");
		list4.add("critical");
		list4.add("failed");
		
		List<List<String>> logs = new ArrayList<>();
		
		logs.add(list1);
		logs.add(list2);
		logs.add(list3);
		logs.add(list4);
		
		Question1 q1 = new Question1();
		
		List<List<String>> resultList = q1.extractLogs(logs);
		
		for(List<String> result: resultList) {
			System.out.println(result);
		}
		
		

	}

}
