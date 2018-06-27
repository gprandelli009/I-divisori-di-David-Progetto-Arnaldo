package progettoArnaldo.esercizi;

public class Divisori {

	
	public Divisori() {
	}
	
	 public int contaDivisori(int primo, int secondo,int inizio,int fine) {
		int i=0;
		int Divisori=0;
		for(i=inizio; i<=fine; i++)
		{
			if((i%primo)==0||(i%secondo)==0)
				Divisori++;
		}
		
		return Divisori;
	}
}
