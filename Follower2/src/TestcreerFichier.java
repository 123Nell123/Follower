import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestcreerFichier {

	

	public static void main(String[] args) throws IOException {
		
		String Lefichier="D:\\10-ODysseal\\ouput\\rapport\\model4.xls";
		TestcreerFichier testfichier = new TestcreerFichier();
		testfichier.FichierCreation(Lefichier);
		
		
	}
		
		
		
		
		public void FichierCreation(String Lefichier)
		{
		
			Path path = Paths.get(Lefichier);
			try {
				String str = "Some write file Example";

				//les elements sont envoyes sous forme de tableau de byte

				byte[] bs = str.getBytes();
				// envoi est un message plus un chemin
				Path writtenFilePath = Files.write(path, bs);
				System.out.println("Written content in file:\n"+ new String(Files.readAllBytes(writtenFilePath)));
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		
	}
}
