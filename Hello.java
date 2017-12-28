public class Helloworld {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int i;
		String name = "HELLO WORLD";
		
			for(int j=0;j<name.length();j++) {
			Thread.sleep(1000);	
			System.out.print(name.charAt(j));
			}
}
	}
