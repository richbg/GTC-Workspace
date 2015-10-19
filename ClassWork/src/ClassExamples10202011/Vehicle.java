package ClassExamples10202011;

interface Vehicle {

	public void moving(int mode);
	public void stopping(int mode);

}

class Car implements Vehicle {

	public void moving(int mode) {
		if (mode == 1)
			System.out.println("Moving forward");
		else
			System.out.println("Moving backward");
	}

	public void stopping(int mode) {
		if(mode ==1)
			System.out.println("Stopping abruptly");
		else 
			System.out.println("Stopping slowly");
	}

	public void turning(int mode) {
		if (mode ==1)
			System.out.println("Turning left");
		else
			System.out.println("Turning right");
	}
}



