package uva.exercises;

public class ChildrensGame {

	
	
	/***********
	 * 
	 	There are lots of number games for children. These games are pretty easy to play but not so easy to make. 
	 	We will discuss about an interesting game here. Each player will be given N positive integer. 
	 	He can make a big integer by appending those integers after one another. Such as if there are 4 integers as 123, 124, 56, 90 
	 	then the following integers can be made – 1231245690, 1241235690, 5612312490, 9012312456, 9056124123 etc. In fact 24 such integers can be made. 
	 	But one thing is sure that 9056124123 is the largest possible integer which can be made.

		You may think that it’s very easy to find out the answer but will it be easy for a child who has just got the idea of number?
		
		Input
		
		Array of positive integer numbers.
		
		Output
		
		You have to print the largest possible integer which can be made by appending all the integers in the array.
	 */

	public long play(int[] numbers){

		int num_1, num_2, max;
		StringBuilder s= new StringBuilder();
		int ln = numbers.length;
		for(int i=1;i<ln;i++){
			num_1 = numbers[0];
			num_2 = numbers[i];
			max = compare(num_1, num_2);
			if(numbers[0] != max){
				for(int j=i;j>0;j--){
					numbers[j] = numbers[j-1];
				}
				numbers[0] = max;
			}
		}
		for(int i=0; i<ln; i++ ){
			s.append(String.valueOf(numbers[i]));
		}
		return Long.parseLong(s.toString());
	}
	
	public int compare(int num_1, int num_2){
		
		double n, m=n=0;
		int j,k,i=j=k=0;
		do{
			n = (double) num_1/Math.pow(10, i);
			m = (double) num_2/Math.pow(10, i);
			if(n<1 && j==0) 
				j=i;
			if(m<1 && k==0)
				k=i;
			i++;
		}while(!(n<1 && m<1));
		
		n = n * Math.pow(10, k);
		m = m * Math.pow(10, j);
		
		if(n == m)
			return num_1 > num_2? num_2 :num_1;
		else
			return n > m? num_1 : num_2;
		
	}
}
