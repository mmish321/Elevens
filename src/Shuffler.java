import java.util.Random;
public class Shuffler {


	 
	private static final int SHUFFLE_COUNT = 6;


	 
public static void main(String[] args) {
		
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		int[] values1 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
		System.out.println(flip());
		}
		
 		System.out.println();
		int[] help = {1,1,1,1};
		int[] meep = {1,2,3,4};
	     System.out.println(arePermutations(help,meep));
		
	}



	public static void perfectShuffle(int[] values) {
		for (int j = 0; j <= (values.length + 1)/ 2; j++) {
			int k = 0;
			int temp = values[j];
			values[j] = values[k];
			values[k] = temp;
			k+=2;
		}
		for (int j = (values.length + 1)/ 2; j < values.length; j++){
			int k = 1;
			int temp = values[j];
			values[j] = values[k];
			values[k] = temp;			
			k+=2;
		}
	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(int[] values) {
	  for (int k = values.length - 1; k >= 1; k--) {
		  int r = (int) (Math.random() * (k + 1));
		 int temp = values[k];
		 values[k] = values[r];
		 values[r] = temp;
	  }
	}
	
	public static String flip() {
		int num = (int) ((Math.random() * 3) + 2);
		if ( num == 2) {
			return "tails";
		}
		else {
			return "heads";
		}
	}
	
	public static boolean arePermutations(int[]a, int[]b) {
		if ( a.length != b.length) {
			return false;
		}
		for (int i = 1; i < a.length; i++){
			int temp = a[i];
			int j;
			for (j = i-1; j >= 0 && temp < a[j]; j--) {
				a[j + 1] = a[j];
			    a[j] = temp;
			}
	    }
		for (int i = 1; i < b.length; i++){
			int temp = b[i];
			int j;
			for (j = i-1; j >= 0 && temp < b[j]; j--) {
				b[j + 1] = b[j];
			    b[j] = temp;
			}
	    }
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
		
	}
		
	
	
}
