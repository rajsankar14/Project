package IPT_program;

public class Final {
	 int x = 10;
	public static void main(String[] args) {

			    Final obj = new Final();
			    obj.x=12 ; // will generate an error: cannot assign a value to a final variable
			    System.out.println(obj.x);
			  }
			}

