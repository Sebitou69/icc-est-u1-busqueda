import java.util.List;
import models.Persona;

public class BusquedaLineal {

    Persona persona = new Persona("Sebas", 18, "Masculino");

    public Persona findByByName(List<Persona> names, String name){
        for(int i = 0; i < names.size(); i++){
            if (names.get(i).getName().equals(name)){
                return names.get(i);
            }
        }
        return null;
    }

    public int findPosByName(List<Persona> names, String name){
        for(int i = 0; i < names.size(); i++){
            if (names.get(i).getName().equals(name)){
                return names.indexOf(i);
            }
        }
        return -1;
    }
}
