import java.io.File;
import java.io.FileInputStream;




public class Main {

	public static void main(String[] args) {
		
		Context context = Context.getInstance();
		try {
			context.getWriter().write(
					context.getProcessor().process(context.getReader().read(new FileInputStream(new File("in.txt")) )),
					System.out);
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
