import org.dizitart.no2.Nitrite;
import org.dizitart.no2.objects.ObjectRepository;

import java.util.ArrayList;

public class ComandaService {

    private static ObjectRepository<Comanda> comandaRepository;

    public static void initDatabase() {
        Nitrite database = Nitrite.builder()
                .filePath(FileServices.getPathToFile("comanda.db").toFile())
                .openOrCreate("comanda", "pictata");

        comandaRepository = database.getRepository(Comanda.class);

    }

    public static void adaugareComanda(String client, String oras , String strada, String numar, Produs produs,Boolean asistenta,String Data) {
        comandaRepository.insert(new Comanda (client,oras, strada,numar,produs,asistenta,Data));
    }

    public static ArrayList<Comanda> comenzi() {
        ArrayList<Comanda> list = new ArrayList<>();
        for(Comanda comanda : comandaRepository.find()) {
            list.add(comanda);
        }
        return list;

    }

    public static ArrayList<Comanda> comenzi(String currentUser) {
        ArrayList<Comanda> list = new ArrayList<>();
        for(Comanda comanda : comandaRepository.find()) {
            if(comanda.getClient().equals(currentUser))
                list.add(comanda);
        }
        return list;
    }



}