import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsuarioIns {
	
	public Usuario getInstance(String usuario) {
		Usuario myUser;
		
		switch(getTipo(usuario)) {
		case 1:{
			myUser = new Estudiante();
		}break;
		case 2:{
			myUser = new Docente();
		}break;
		case 3:{
			myUser = new Admin();
		}break;
        case 4:{
			myUser = new Auditor();
		}break;
		default:{
			myUser = null;
		}break;
		}
		
		return myUser;
	}

	private int getTipo(String usuario) {
		if (evaluate("^[a-z][a-z][a-z][0-9]+@uvg.edu.gt$", usuario)) 
			return 1;
		else if (evaluate("^[a-z]+@uvg.edu.gt$",usuario)) 
			return 2;
		else if (evaluate("^[a-z]+_adm@uvg.edu.gt$",usuario)) 
			return 3;
        else if (evaluate("^[a-z]+_aud@uvg.edu.gt$",usuario)) 
			return 4;
		else 
			return -1; 
	}
	
	private boolean evaluate(String regex, String expresion) {
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(expresion);
	    return matcher.find();
	}
}
