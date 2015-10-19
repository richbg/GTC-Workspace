import java.awt.*;      
class GraphicsExample extends Canvas{ 
	public GraphicsExample(){ 
		setSize(600, 700);      
		setBackground(Color.white);      
	} 
	public void paint(Graphics g){ 
		g.setColor(Color.blue);      
		g.drawLine(30, 30, 80, 80);
		g.setColor(Color.blue);      
		g.drawRect(20, 150, 100, 100);
		g.fillRect(20, 150, 100, 100);      
		g.setColor(Color.blue);
		g.fillOval(150, 20, 100, 100);      

		Image img1 = Toolkit.getDefaultToolkit().getImage("cow.jpg");      
		g.drawImage(img1, 70, 70, this);      
	} 

	public static void main(String[] argS){ 
		GraphicsExample GP = new GraphicsExample();      
		Frame aFrame = new Frame();      
		aFrame.setSize(600, 700);      
		aFrame.add(GP);      
		aFrame.setVisible(true);		      
	} 
	
}
