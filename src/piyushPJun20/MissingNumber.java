package piyushPJun20;
public class MissingNumber {

	void displayMissingNum(int[] intArr) {
		
		boolean flag;
		System.out.println(" Missing Numbers are : ");
		for (int i=1; i<=10; i++) {
			flag = true;
			for (int j=0; j<intArr.length; j++) {
				if (i == intArr[j]) {
					flag = true;
					 break;
				}
				flag = false;
			}
			if(!flag) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		MissingNumber missingNum = new MissingNumber();
		int[] intArr = {1,2,4,6,8,9};
		missingNum.displayMissingNum(intArr);
	}

}