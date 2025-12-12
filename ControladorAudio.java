import model.Audio;

import java.util.ArrayList;
import java.util.List;

public class ControladorAudio {
    private List<Audio> biblioteca = new ArrayList<>();

    public void adicionar(Audio item){
        biblioteca.add(item);
    }

    public void listarTudo(){
        for (Audio item : biblioteca){
            item.exibirInfo();
            System.out.println("------------------");
        }
    }


}
