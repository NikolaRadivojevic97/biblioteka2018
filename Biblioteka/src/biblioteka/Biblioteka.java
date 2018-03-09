package biblioteka;

import java.util.LinkedList;

import biblioteka.interfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs{

	private LinkedList<Knjiga> knjige=new LinkedList<Knjiga>();
	
	public void dodajKnjigu(Knjiga knjiga) {
		if(knjiga==null || knjige.contains(knjiga))
			throw new RuntimeException("Knjiga je null ili vec postoji");

		knjige.add(knjiga);
		
	}

	
	public void obrisisKnjigu(Knjiga knjiga) {
		if(knjiga==null || knjige.contains(knjiga))
			throw new RuntimeException("Knjiga je null ili vec postoji");
		knjige.remove(knjiga);
	}

	
	public LinkedList<Knjiga> vratiSveKnjige() {
		return knjige;
	}

	
	public LinkedList<Knjiga> pronadjiKnjigu(String naslov, Autor autor, String isbn, String izdaavc) {
		if(naslov==null)
			throw new RuntimeException("morate uneti nasolov");

		LinkedList<Knjiga> novaLista=new LinkedList<Knjiga>();
		for(int i=0;i<knjige.size();i++) {
			if(knjige.get(i).getNaslov().contains(naslov))		//da sadrzi naslov unet zbog greskik
				novaLista.add(knjige.get(i));
		}
		
		
		return novaLista;
	}
	

}
