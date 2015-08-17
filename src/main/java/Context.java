import nasaLanding.io.Reader;
import nasaLanding.io.Writer;
import nasaLanding.processing.Processor;


public class Context {
	
	private static Context c;
	private Reader reader;
	private Writer writer;
	private Processor processor;
	
	
	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	public Reader getReader() {
		return reader;
	}

	public void setReader(Reader reader) {
		this.reader = reader;
	}

	public Writer getWriter() {
		return writer;
	}

	public void setWriter(Writer writer) {
		this.writer = writer;
	}

	private Context(){
		reader = new Reader();
		writer = new Writer();
		processor = new Processor();
	}
	
	public static Context getInstance(){
		if(c==null){
			c=new Context();
		}
		return c;
	}
	
}
