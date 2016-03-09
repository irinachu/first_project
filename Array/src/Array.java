
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] list = new int[5]; //create Array of 5 integers
for (int index=0; index<5; index++) {
	list[index] = index*2; //assign value to Array
}
for (int index=4; index > -1; index--) {
	System.out.println(list[index]);
}
	}//method main

}
