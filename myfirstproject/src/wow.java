
public class wow {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("object verified");
	
	}
	public static void main(String[] args) {
	wow w1=new wow();
	wow w2=new wow();
	
		
		w1=null;
		w2=null;
		System.gc();
	}

}
