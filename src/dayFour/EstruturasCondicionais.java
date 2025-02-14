package dayFour;

import java.util.Locale;
import java.util.Scanner;

public class EstruturasCondicionais {


    public void ifAndElse(){

    }
    public void swiTch(){
        Scanner s = new Scanner(System.in);
        String produto = s.next().toLowerCase();

        switch (produto){
            case "Caderno": //CASO O PRODUTO SE CHAMAR...
                //EXECUTE ESSE CÓDIGO
                System.out.println("Nome: "+ produto + " Valor: " + "R$ 25, 65");
                break;
            // É POSSÍVEL ADICIONAR MAIS CASES
            case "Livro":
                System.out.println("Nome: "+ produto + " Valor: " + "R$ 57, 65");
                break;
        }
    }

}
