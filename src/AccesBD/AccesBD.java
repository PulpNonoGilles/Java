/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesBD;
import connexion.ConnexionOracleFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
* Cette classe est un singleton d'une de base de données configurée
* à partir d'une fabrique.
*/
public class AccesBD {
    private Connection connexionBD;
    Statement stmt = connexionBD.createStatement();
    
    // Constructeur privé pour le singleton.
    private AccesBD() throws SQLException {
    connexionBD = ConnexionOracleFactory.creerConnexion();
    // initialiser les PreparedStatement();
    }

//    // L'unique instance de la classe
//    private static AccesBD instance = null;
//    /**
//    * Cette fonction retourne l'unique instance de la classe
//    */
//    public static AccesBD getInstance() {
//    if (instance == null)
//    try {
//        instance = new AccesBD();
//    } catch (SQLException ex) {
//        Logger.getLogger(AccesBD.class.getName()).log(Level.SEVERE, null, ex);
//    }
//    return instance;
//    }
}
