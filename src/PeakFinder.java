public class PeakFinder {

	public static void main(String[] args) {

		int[] elems = {4, 6, 7, 2, 1, 8, 9};
		
		int peak = findPeak(elems, 0, elems.length - 1);
		System.out.println("Found a peak: " + peak);
	}

	public static int findPeak(int[] arr, int start, int end) {
		int peak; 
		
		// half the list
		int midSize = (( end ) - start) / 2;
		int mid = start + midSize;
		
		/*System.out.println("------");
		System.out.println("start: " + start);
		System.out.println("end: " + end);
		System.out.println("midSize: " + midSize);
		System.out.println("mid: " + mid);
		System.out.println("midEleme: " + arr[mid]);*/
		
		
		if (mid == end) { // this means that we've reach the base case: single elem remaining 
			return arr[mid];
		}
		// compare
		if (arr[mid-1] > arr[mid]) {
			peak = findPeak(arr, start, mid - 1);
		} else if (arr[mid+1] > arr[mid]) {
			peak = findPeak(arr, mid+1, end);
		} else {	// bigger value of adjacent elements
			System.out.println("break");
			return arr[mid];
		}
		
		return peak; // should never be reached
	}

}
