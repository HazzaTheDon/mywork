import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Arrays {
	public static void main(String[] args) {

//String name = "Haziq";
//String [] row2 = {name, "haziq", "hazza"};
//row2[0]="yooo";
//System.out.println(row2[0]);
//
//
//int[] ageArray = { 25, 30, 21, 56, 67, 39, 8 };
//System.out.println(ageArray);
//
//int[][] ageArray = { 25, 30, 21}{56, 67, 39} {8};
//System.out.println(ageArray);

//String[] row6 = {"Doug","Josh","Sam"};
//String[] row5 = {"Nisha", "Laurence", "Ashima"};
//String[] row7 = {"Mumba", "Prem"};
//String[][] room = {row6, row5, row7};
//System.out.println(room[0][1]);
//System.out.println(room[1][2]);
//System.out.println(room[2][0]);
//room[1][1]= "jess";
//System.out.println(room[1][1]);
//		CTRL+SHIFT+O-inport
//ArrayList <String> row5= new ArrayList<String>();
//System.out.println(row5.add("L"));
//
//System.out.println(row5.size());
//System.out.println(row5);
//System.out.println(rows.remove("J"));

//ArrayList<Integer> nums = new ArrayList<Integer>();
//nums.add(8);
//nums.add(2);
//nums.add(15);
//        int[] nums = new int[3];
//		nums[0] = 8;
//		nums[1] = 2;
//		nums[2] = 15;
//		for (int i = 0; i < nums.length;i++) {
//			System.out.println(nums[i]);
//		for(int num: nums) {
//			System.out.println(num);

//			System.out.println(nums);

//		ArrayList<Integer> nums = new ArrayList<Integer>();
//		nums.add(8);
//		nums.add(2);
//		nums.add(15);
//		
//		for (int i=0; i<nums.size(); i++) {
//			System.out.println(nums.get(i));
//		for(Integer num: nums) {
//			System.out.println(num);

//			ArrayList<String> names= new ArrayList<String>();
//			names.add("Josh");
//			names.add("James");
//			names.add("tyler");
//			names.stream().forEach(name -> System.out.println(names));
////		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Josh");
		names.add("James");
		names.add("tyler");
		List<String> passed = names.stream().filter(name -> !(name.equals("James"))).map(name -> name + " is trash").collect(Collectors.toList());
		System.out.println(passed);
		
	

	}}

