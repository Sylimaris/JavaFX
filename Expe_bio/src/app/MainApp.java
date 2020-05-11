package app;

import java.io.IOException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import app.controller.*;
import app.model.Technicien;
import app.model.Chercheur;
import app.model.Experience;
import app.model.Groupe;
import app.model.Lot;
import app.model.Photometre;
import app.model.Plaque;
import app.model.Reactif;
import app.model.Resultat_groupe;
import app.model.Slot;
import oracle.jdbc.OracleConnection;
import oracle.jdbc.datasource.OracleDataSource;
import tools.DataSourceSample;
import tools.Database;

public class MainApp extends Application {

	private Stage primaryStage;
    private BorderPane rootLayout;

    private String currentPage;

    private OracleDataSource ods;

    private ArrayList<Chercheur> chercheurs = new ArrayList<Chercheur>();
    private ArrayList<Technicien> techniciens = new ArrayList<Technicien>();
    private ArrayList<Experience> experiences = new ArrayList<Experience>();
    private ArrayList<Groupe> groupes = new ArrayList<Groupe>();
    private ArrayList<Lot> lots = new ArrayList<Lot>();
    private ArrayList<Photometre> photometres = new ArrayList<Photometre>();
    private ArrayList<Plaque> plaques = new ArrayList<Plaque>();
    private ArrayList<Resultat_groupe> resultats_groupe = new ArrayList<Resultat_groupe>();
    private ArrayList<Reactif> reactifs = new ArrayList<Reactif>();
    private ArrayList<Slot> slots = new ArrayList<Slot>();

    @Override
	public void start(Stage primaryStage) throws SQLException, IOException {

		if (!Database.CONNEXIONBASE)
			ods = DataSourceSample.main();

		initDonnees();

		this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Expe_Bio");
        this.primaryStage.getIcons().add(new Image(MainApp.class.getResourceAsStream( "../ressources/images/logoApp.png")));
        this.primaryStage.setMinHeight(480);
        this.primaryStage.setMinWidth(640);
        initRootLayout();
        showConnexion();
	}


	private void initDonnees()
	{
		if (!Database.CONNEXIONBASE) {
			//Technicien
			techniciens.add(new Technicien("Beignier", "Thibault", "06550505","tbeignier@gmail.com",1));
			techniciens.add(new Technicien("Tapia", "Cécile", "0601020304","ctapia@gmail.com",2));

			//Chercheur
			chercheurs.add(new Chercheur("Lanos", "Thomas", "06550505","tlanos@gmail.com",1,1));
			chercheurs.add(new Chercheur("Martial", "Samuel", "06020202","smartial@gmail.com",2,1));

			//Photometre
			photometres.add(new Photometre(1, 1));
			photometres.add(new Photometre(2, 1));
			photometres.add(new Photometre(3, 1));

			//
		}
		else {
			//Récupération des données dans la base de données
			/*try (OracleConnection co = (OracleConnection) ods.getConnection())
			{
				try (Statement statement = co.createStatement())
				{
					//Experience
					try (ResultSet res = statement.executeQuery("SELECT * FROM Experience"))
					{
						while (res.next())
							experience.add(new Experience(res.getInt(1), res.getString(2),);

					} catch (SQLException e) {
						e.printStackTrace();
					}

				} catch (SQLException e) {
					e.printStackTrace();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}*/
		}
	}

    /**
     * Initializes the root layout.
     */
    public void initRootLayout() {
        try {
        	// Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();

            RootLayoutController controller = loader.getController();
            controller.setMainApp(this);

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * Shows the connection overview inside the root layout.
     */
    public void showConnexion() {
        try {
            // Load connexion overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/Connexion.fxml"));
            AnchorPane connexionOverview = (AnchorPane) loader.load();

            // Set connexion overview into the center of root layout.
            rootLayout.setCenter(connexionOverview);

            // Give the controller access to the main app.
            ConnexionController controller = loader.getController();
            controller.setMainApp(this);

            currentPage = "Connexion";

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * Chercheur Overview
     */
    public ExpDemandeeChercheurController showChercheurExpDemandeeController (int id)
    {
    	try {
	    	//Charge la page du chercheur
			FXMLLoader loader = new FXMLLoader();
	        loader.setLocation(MainApp.class.getResource("view/ExpDemandeeChercheur.fxml"));
	        AnchorPane ExpDemandeeChercheur = (AnchorPane) loader.load();

	        getRootLayout().setCenter(ExpDemandeeChercheur);

	        ExpDemandeeChercheurController controller = loader.getController();
	        controller.setMainApp(this);
	        controller.initialize();
	        currentPage = "ChercheurExpDemandee";

	        return controller;
    	}
    	catch (IOException e) {
    		e.printStackTrace();
    		return null;
    	}
    }



    /**
     * Technicien Overview
     */
    public TechnicienGestionExpController showTechnicienGestionExp (int id)
    {
    	try {
	    	//Charge la page du technicien
			FXMLLoader loader = new FXMLLoader();
	        loader.setLocation(MainApp.class.getResource("view/TechnicienGestionExp.fxml"));
	        AnchorPane technicienGestionExp = (AnchorPane) loader.load();

	        getRootLayout().setCenter(technicienGestionExp);

	        //Affiche les données correspondant technicien
	        	//Récupération du controller
	        TechnicienGestionExpController controller = loader.getController();
	        controller.setMainApp(this);

	        //Affiche les informations du technicien connecté
	        //controller.initialize(id); //DANS TechnicienGestionExpController

	        currentPage = "TechnicienGestionExp";

	        return controller;
    	}
    	catch (IOException e) {
    		e.printStackTrace();
    		return null;
    	}
    }





    /**
     * Retourne la liste des patients
     */
    public ArrayList<Technicien> getTechniciens() {
    	return techniciens;
    }

    /**
     * Retourne la liste des chercheurs
     */
    public ArrayList<Chercheur> getChercheurs() {
    	return chercheurs;
    }

    /**
     * Main function.
     */
	public static void main(String[] args) {
		launch(args);
	}

    /**
     * Returns the root layout.
     */
    public BorderPane getRootLayout() {
    	return rootLayout;
    }

    /**
     * Returns the ods.
     */
    public OracleDataSource getOds() {
    	return ods;
    }
}

// bool 1 = true bdd co -- false = bdd pas connectée
