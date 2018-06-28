package progettoArnaldo.esercizi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class LettoreDelFile {

	public LettoreDelFile() {
	}
	
	public void Lettura_Scrittura(String Input, String Output) throws FileNotFoundException {
		int i;
		double tempoInizio=System.currentTimeMillis();
		File file = new File(Input); 
		ArrayList<Integer> Contenitore = new ArrayList<Integer>();
		ArrayList<Integer> Primo = new ArrayList<Integer>();
		ArrayList<Integer> Secondo = new ArrayList<Integer>();
		ArrayList<Integer> Inizio = new ArrayList<Integer>();
		ArrayList<Integer> Fine = new ArrayList<Integer>();
		PrintWriter uscita = new PrintWriter(Output);

		try {
			Scanner Acquisisci = new Scanner(file);
			while (Acquisisci.hasNextLine()) {
				i=Acquisisci.nextInt();
				Contenitore.add(i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		for(int j=0; j<Contenitore.get(0)*4;j++) {
			switch((j+1)%4) {
			case 1:
				Primo.add(Contenitore.get(j+1));	
				break;
			case 2:
				Secondo.add(Contenitore.get(j+1));	
				break;
			case 3:
				Inizio.add(Contenitore.get(j+1));	
				break;
			case 0:
				Fine.add(Contenitore.get(j+1));	
				break;
			}
		}

		for(int k=0;k<Primo.size();k++) {
			Divisori divisore=new Divisori();
			System.out.println(divisore.contaDivisori(Primo.get(k),Secondo.get(k),Inizio.get(k),Fine.get(k)));
			uscita.println(divisore.contaDivisori(Primo.get(k),Secondo.get(k),Inizio.get(k),Fine.get(k)));
		}
		
		double tempoFine=System.currentTimeMillis();
		uscita.println((tempoFine/1000)-(tempoInizio/1000));
		System.out.println((tempoFine/1000)-(tempoInizio/1000));
		uscita.close();
	}
	
}
