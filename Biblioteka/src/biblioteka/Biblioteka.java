package biblioteka;

import java.util.LinkedList;

import biblioteka.interfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs{

	private LinkedList<Knjiga> knjige=new LinkedList<Knjiga>();
	
	public void dodajKnjigu(Knjiga knjiga) {
		
		knjige.add(knjiga);
		
	}

	
	public void obrisisKnjigu(Knjiga knjiga) {
		knjige.remove(knjiga);
		
	}

	
	public LinkedList<Knjiga> vratiSveKnjige() {
		return knjige;
		
		
	}

	
	public LinkedList<Knjiga> pronadjiKnjigu(String naslov, Autor autor, String isbn, String izdaavc) {
		if(naslov==null) {
			return null;
		}
		LinkedList<Knjiga> novaLista=new LinkedList<Knjiga>();
		for(int i=0;i<knjige.size();i++) {
			if(knjige.get(i).getNaslov().contains(naslov))		//da sadrzi naslov unet zbog greski
				novaLista.add(knjige.get(i));
		}
		
		
		return novaLista;
	}
	

}
