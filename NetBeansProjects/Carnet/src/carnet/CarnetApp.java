/*
 * CarnetApp.java
 */

package carnet;

import com.shelby.carnet.carnetUtils.Install;
import com.shelby.carnet.security.login.LoginGui;
import java.io.File;
import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

/**
 * The main class of the application.
 */
public class CarnetApp extends SingleFrameApplication {
    private static String dossier = "../../CarnetAppsSrc/images";
    
    /**
	 * Methode pour joindre le fichier Login.java
	 * en vue de se connecter a notre application.
	 */
	private static void authentification() {
		LoginGui monLogin = new LoginGui();
		monLogin.setVisible(true); 
	}

	private static void verifDatabase() {
		if (!new File(dossier).exists()){
			Install installation = new Install();
			installation.setVisible(true);
		}else{
			authentification();
		}
	}
    
    
    

    /**
     * At startup create and show the main frame of the application.
     */
    @Override protected void startup() {
        show(new CarnetView(this));
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     * @param root
     */
    @Override protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of CarnetApp
     */
    public static CarnetApp getApplication() {
        return Application.getInstance(CarnetApp.class);
    }

  
    /**
     * Main method launching the application.
     * @param args
     */
    public static void main(String[] args) {
        authentification();
        arg=args;
    }
    
    public  static String[] arg;
    /**
     * Methode qui lance notre application.
     */
    public void runApp() {
        launch(CarnetApp.class, arg);
    }
  
}
