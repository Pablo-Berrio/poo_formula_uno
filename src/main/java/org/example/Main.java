package org.example;
import java.util.ArrayList;
import java.util.List;
import org.example.equpos.Escuderia;

public class Main {
    public static void main(String[] args) {

        List<Escuderia> lista = new ArrayList<Escuderia>();
        lista.add(new Escuderia("Ferrari","MoneyGram Hass f1","Charles Leclerc",3900));
        lista.add(new Escuderia("Mercedes benz","v6 1.6 turbo hibrido","Lewis Hamilton",3800));
        lista.add(new Escuderia("Red bul racing","motor impulsado por red bull","Sergio Perez",2600));
        lista.add(new Escuderia("Mclaren","motor mclaren","Lando Norris",2200));
        lista.add(new Escuderia("Alpine","motor alpin","Otmar Szafnauer",1400));

        Escuderia escuderiaMascara = lista.get(0);

        for (int i=0; i< lista.size(); i++){
            if (lista.get(i).getCostoAnual()> escuderiaMascara.getCostoAnual()){
                escuderiaMascara=lista.get(i);
            }
        }

        System.out.println("La escuderia con el costo anual mas alto es: "+escuderiaMascara.getNombre()+" con un gasto anual de: "+escuderiaMascara.getCostoAnual()+" millones de dolares");
        
    }
}


