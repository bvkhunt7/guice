package GuiceDemo;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class SpellCheckerImpl  implements SpellChecker
{
	
//		   @Override
//		   public void checkSpelling() {
//		      System.out.println("Inside checkSpelling." );
//		   } 

	
	//Provider---------------
//	private String dbUrl;
//	   private String user;
//	   private Integer timeout;
//
//	   @Inject
//	   public SpellCheckerImpl(String dbUrl, 
//	      String user, 
//	      Integer timeout) {
//	      this.dbUrl = dbUrl;
//	      this.user = user;
//	      this.timeout = timeout;
//	   } 
//	   @Override
//	   public void checkSpelling() { 
//	      System.out.println("Inside checkSpelling." );
//	      System.out.println(dbUrl);
//	      System.out.println(user);
//	      System.out.println(timeout);
//}
//-----------------
	//Constructor binding
	private String dbUrl;
	   public SpellCheckerImpl(){}	

	   public SpellCheckerImpl(@Named ("JDBC") String dbUrl) {
	      this.dbUrl = dbUrl;
	   } 
	   @Override
	   public void checkSpelling() { 
	      System.out.println("Inside checkSpelling." );
	      System.out.println(dbUrl); 
	   }
	
	
	
}