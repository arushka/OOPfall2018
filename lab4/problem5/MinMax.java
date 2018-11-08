import java.util.*;
public class MinMax{
	static class Twofriends{
		public int max;
		public int min;
		public Twofriends(int max, int min){
			this.max = max;
			this.min = min;
		}
	}

	static String minmax(int values[]){
		Twofriends t = new Twofriends(-99999, 99999);

		for (int i = 0; i < values.length; i++ ) {
			if(values[i] > t.max){
				t.max = values[i];
			}
			if(values[i] < t.min){
				t.min = values[i];
			}
		}

		return "in the array values: max el: " + t.max + " min el: " + t.min + "";


	}
}