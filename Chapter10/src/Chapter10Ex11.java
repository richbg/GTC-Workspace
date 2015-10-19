import java.util.*;


public class Chapter10Ex11 {

	Double _myArray[] = null;
	Double _myAvg = null;
	Double _myDeviation = null;


	public static void main(String[] args) {
		Chapter10Ex11 runner = new Chapter10Ex11();
		int index = runner.getInput();
		runner.setArray(new Double[index]);
		runner.populateArray();
		runner.printArray();
		runner.calcAverage();
		runner.calcDeviation();

	}

	private void calcDeviation() {
		_myDeviation = 0.0;
		for ( Double next : _myArray ) {
			Double num = Math.pow((next - _myAvg), 2);
			_myDeviation += num;
		}
		_myDeviation /= _myArray.length;
		_myDeviation = Math.sqrt(_myDeviation);
		System.out.println("The Deviation of the Array is: " + _myDeviation);
	}

	private void calcAverage() {
		_myAvg = 0.0;
		for ( Double next : _myArray){
			_myAvg += next;
		}
		_myAvg /= _myArray.length;
		System.out.println("The Array avg is = " + _myAvg);
	}

	private void printArray() {
		System.out.println("The Elements of the Array are: ");
		for ( Double next : _myArray){
			System.out.println(next);

		}

	}

	private void populateArray() {
		for ( int i = 0; i < _myArray.length; i++)
		{
			_myArray[i] = new Double(i + 1);
		}

	}

	private void setArray(Double[] myArray) {
		_myArray = myArray;

	}

	private  int getInput() {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter (System.getProperty("line.separator"));
		System.out.print(" Enter number (size of the array) " );
		return sc.nextInt();
	}

}
