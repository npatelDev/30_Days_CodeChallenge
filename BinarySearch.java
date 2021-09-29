
public class BinarySearch {
	public static void main(String args[]) {
		int[] a= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
		int li=a[0];
		int hi=a.length-1;
		int mi=(hi-li)/2;
		int item=18;
		while(li<=hi) {
		if(a[mi] == item) {
			System.out.println("item is at "+mi+" "+"index position");
			break;
		}
		else if(a[mi]< item) {
			li=mi+1;
		}else {
			hi=mi-1;
		}
		mi=(hi+li)/2;
	}
	}
}
