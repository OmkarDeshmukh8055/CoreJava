package myLinkedLsitAgain;

public class Op {

	public static void main(String[] args) {

		Implimentation<Integer> myList=new Implimentation<>();
	 
		myList.add(70); 
		myList.add(70); 
		myList.add(70); 
		myList.add(70); 
		myList.add(70); 
		
		System.out.println(myList.indexOf(20));
		//System.out.println(myList.get(6));
//		myList.remove(3);
//		  Object[] ar=myList.toArray(); for (int i = 0; i < ar.length; i++) {
//		 System.out.print(ar[i]+" "); } System.out.println();
		System.out.println(myList.mytoString());
		System.out.println(myList.lastIndexOf(70));
	}

}
