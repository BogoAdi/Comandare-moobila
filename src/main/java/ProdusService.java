import org.dizitart.no2.Nitrite;
import org.dizitart.no2.objects.ObjectRepository;

import java.util.ArrayList;
import java.util.Objects;

import static org.dizitart.no2.objects.filters.ObjectFilters.eq;

public class ProdusService {
    private static ObjectRepository<Produs> produseRepository;


    public static void initDatabase() {
        Nitrite database = Nitrite.builder()
                .filePath(FileServices.getPathToFile("produse.db").toFile())
                .openOrCreate("produs", "dedus");

        produseRepository = database.getRepository(Produs.class);
    }

    public static void addProdus(String nume,String lemn,int pret) throws ProdusExistent {
        checkProdusDoesNotAlreadyExist(nume,lemn);
        produseRepository.insert(new Produs(nume,lemn, pret));
    }

    public static void checkProdusDoesNotAlreadyExist(String nume, String lemn) throws ProdusExistent {
        for (Produs produs : produseRepository.find()) {
            if (Objects.equals(nume, produs.getNume())&&Objects.equals(lemn,produs.getLemn()))
                throw new ProdusExistent(nume,lemn);
        }
    }
    public static ArrayList<Produs> Produs() {
        ArrayList<Produs> list = new ArrayList<>();
        for(Produs prod : produseRepository.find()) {
            list.add(prod);
        }
        return list;
    }
    public static void stergereProdus(Produs produs){
        produseRepository.remove(eq("nume", produs.getNume()));
    }

}
