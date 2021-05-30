package exceptions;
import java.io.FileNotFoundException;
import javax.xml.bind.JAXBException;
import java.io.IOException;

public class TestException {

	public static void main(String[] args) {
		try {
			testExceptions();
			getMyException();
			// the below commented line will cause compile time error
		// } catch (FileNotFoundException | IOException |  MyException e) {
		}
//		catch(Exception e) {
//			
//		} 
		catch ( IOException e) {
			e.printStackTrace();
		} catch(MyException e) {
			e.printStackTrace();
			 System.out.println(e.getErrorCode());
		}
		// The below code should be uncomment because this excepiton never thrown from the try body
//		catch (JAXBException e) {
//		e.printStackTrace();
//	}
		// Notice that catching NullPointerException is valid because it’s an unchecked exception.
		catch (NullPointerException e) {
			// TODO: handle exception
		}
	}
	
	public static void testExceptions() throws IOException, FileNotFoundException, MyException{
		
	}
	
	public static void getMyException() throws MyException{
		throw new MyException("YOu are my world");
	}
}

class MyException extends CustomException{
	public static final long serialVersionUID = 1L;
	
	public MyException(String message) {
		super(message, "MY_WORLD_my_RULE");
	}
	
}