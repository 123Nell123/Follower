package src.com.np.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ManipFichierService {
	public static final String parametrage = "/parametrageFichier";

	
	
	private String fichierALire ="";
	private String fichierACreer="";
	private String fichierAModifier = "";
	Boolean iscreated = false;
	int numfeuilleClasseur = 0 ;
	int valeurCellule =0;
	int numligne =0;
	int numCell = 0; 
	
	
	
	
	
	
	public Boolean getIscreated() {
		return iscreated;
	}
	
	public void lecturexml() {
	
	LecteurData lecteurparametrage = new LecteurData();
	Properties prop = new Properties();
	prop = lecteurparametrage.lireFichierData(parametrage);
	System.out.println("fichuier parametrage: " + parametrage) ;
	if (prop != null)
	{
		for (String mapropriete : prop.stringPropertyNames()){
			System.out.println(mapropriete  + "=" + prop.getProperty(mapropriete ));

			fichierALire = prop.getProperty("fichierALire");
			fichierACreer = prop.getProperty("fichierACreer");
			fichierAModifier = prop.getProperty("fichierAModifier");
		}
	}
		else
			{
			System.out.println("erreur de lecture de fichier");
			}
		
		
	}
	public void fichierCreation()
	{
		lecturexml();
		System.out.println("lecture ok fichierAcreer  :"+ fichierACreer);
		Path path = Paths.get(fichierACreer);
		try {
			String str = "Some write file Example";

			//les elements sont envoyes sous forme de tableau de byte

			byte[] bs = str.getBytes();
			// envoi est un message plus un chemin
			Path writtenFilePath = Files.write(path, bs);
			System.out.println("Written content in file:\n"+ new String(Files.readAllBytes(writtenFilePath)));
			iscreated = true;
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void Fichierlecture(int numligne,int numCell) {

		lecturexml();


		//	FileInputStream excelFile = new FileInputStream(new File(“D:\\10-ODysseal\\workspaceFinal\\Follower2\\output\\rapport_client.xlsm”));
		FileInputStream excelFile;


		try {
			//recuperation de la feuille Excell
			excelFile = new FileInputStream(new File(fichierALire));
			//fichier stocker dans un objet de type HSSFWorkbook 
			Workbook workbook = new HSSFWorkbook(excelFile);

			//Récupération de la première feuille de calcul du document
			Sheet dataSheet = workbook.getSheetAt(numfeuilleClasseur);
			System.out.println("dataSheet :"+ dataSheet.getSheetName());

			/*
				 afficher la cellule D3  nous aurons :
			 */
			Cell cell = dataSheet.getRow(numligne).getCell(numCell);
			System.out.println("cells: " + cell.getCellType() +" "+ cell.getStringCellValue());

			if (cell.getCellType() == CellType.STRING) {
				System.out.println(cell.getStringCellValue());
			}
			else if (cell.getCellType() == CellType.NUMERIC) {
				System.out.println(cell.getNumericCellValue());
			}

		} 


		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	public void FichierEcriture(int valeurCellule, int numligne, int numCell) {

		lecturexml();
		//recuperation de la feuille Excell
		try {
			
			
		FileInputStream excelFile2 = new FileInputStream(new File(fichierAModifier));
		//fichier stocker dans un objet de type HSSFWorkbook 
		Workbook workbook = new HSSFWorkbook(excelFile2);
			
			//Récupération de la première feuille de calcul du document
			Sheet dataSheet = workbook.getSheetAt(numfeuilleClasseur);
			
			dataSheet.getRow(2).getCell(3).setCellValue(valeurCellule);
		
	
		
			FileOutputStream output = new FileOutputStream(fichierAModifier);
			dataSheet.getWorkbook().write(output);
			output.close();
			} catch (FileNotFoundException e){
			e.printStackTrace();
			} catch(IOException e){
			e.printStackTrace();
			}
	
		
		
	}

}


