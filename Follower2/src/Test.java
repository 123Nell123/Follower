import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Test {

	public static void main(String[] args) throws IOException {
		
		String fichierALire = "D:\\10-ODysseal\\workspaceFinal\\Follower2\\output\\rapport_client.xls" ;
		String fichierACreer= "D:\\10-ODysseal\\ouput\\rapport\\model3.xls";
		String fichierAModifier =  "D:\\10-ODysseal\\workspaceFinal\\Follower2\\output\\rapport_client.xls" ;

		String fichier = "D:\\10-ODysseal\\workspaceFinal\\Follower2\\output\\rapport_client.xls" ;
		
		//	FileInputStream excelFile = new FileInputStream(new File(“D:\\10-ODysseal\\workspaceFinal\\Follower2\\output\\rapport_client.xlsm”));
			FileInputStream excelFile;
			
			int feuilleClasseur = 0 ;
			
				
			try {
				int valeurCellule = 4443 ;
				
			FileInputStream excelFile2 = new FileInputStream(new File(fichierAModifier));
			//fichier stocker dans un objet de type HSSFWorkbook 
			Workbook workbook = new HSSFWorkbook(excelFile2);
				
				//Récupération de la première feuille de calcul du document
				Sheet dataSheet = workbook.getSheetAt(feuilleClasseur);
				
				dataSheet.getRow(2).getCell(3).setCellValue(valeurCellule);
				
				FileOutputStream output = new FileOutputStream(fichierAModifier);
				dataSheet.getWorkbook().write(output);
				output.close();
				System.out.println("le fichier a été modifié avec succès");
				} catch (FileNotFoundException e){
				e.printStackTrace();
				} catch(IOException e){
				e.printStackTrace();
				}
		
		
		
		
		
		/*
		
		try {
			  
            // Recevoir le fichier 
            File f = new File("D:\\10-ODysseal\\ouput\\rapport\\model.xls");
  
            // Créer un nouveau fichier
            // Vérifier s'il n'existe pas
            if (f.createNewFile())
                System.out.println("File created");
            else
                System.out.println("File already exists");
        }
        catch (Exception e) {
            System.err.println(e);
        }
        */
	}


}

