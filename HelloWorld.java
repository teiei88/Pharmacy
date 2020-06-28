public class HelloWorld{
	public static void main(String[] args){
		String spacestr= "";
		String spacestr2= "";
		StringBuffer sb2 = new StringBuffer();
		try {
			for (int j = 1; j < 60; j++)
			{
				spacestr2 = sb2.append(" ").toString();			
				for (int row = 1; row <=10; row++) {
					/*int lastNumber = number;*/
					StringBuffer sb = new StringBuffer();
					/*ifor (int col = 1; col <= row; col++) {
						if (col > 1) {
							for (int twice = 1; twice <= 2; twice++) {
								sb.append("ˆ¤“†‚¤‚ñ‚±  ‚¨‚³‚Ð‚ß‚¤‚ñ‚±");
							}				
					/*	}
					}*/
					sb.setLength(0);
					for (int col = 1; col <= row; col++) {
							spacestr = sb.append(" ").toString();			
					}
					sb.append(spacestr2+row);
					sb.append(spacestr2+spacestr);
					sb.append(spacestr2+‚Ä‚¢‚©‚ñ‚¤");
					
					String aaa = String.format("%8s", sb.toString());
					System.out.println(aaa);
				}
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				 Thread.sleep(1000);
			}
		} catch(Exception e) {
			
		}
		/*System.out.println("Hello World!!");*/
	}
}
