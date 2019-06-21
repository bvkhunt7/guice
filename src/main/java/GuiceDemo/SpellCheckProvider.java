package GuiceDemo;

import com.google.inject.Provider;
import com.google.inject.Provides;

public class SpellCheckProvider implements Provider<SpellChecker> {
	
	 @Override
	   public SpellChecker get() {
	      String dbUrl = "jdbc:mysql://localhost:5326/emp";
	      String user = "user";
	      int timeout = 100;

	      SpellChecker SpellChecker = new SpellCheckerImpl(dbUrl, user, timeout);
	      return SpellChecker;
}
	

}
