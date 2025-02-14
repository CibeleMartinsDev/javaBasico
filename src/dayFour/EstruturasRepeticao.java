package dayFour;

public class EstruturasRepeticao {

    public void forLoop(){
        //FEITO PARA EXECUTAR CÓDIGO DADA UMA SEQUENCIA
        // DADA UMA QUANTIDADE DE VEZES
        for (int i = 0; i < 20; i++){
            // int i define a partir de qual index o looper vai inicializar
            // condicao define até que número/quantas vezes ele será executado
            //i++ incrementa, conta mais um
            System.out.println("Index: " + i);
        }
    }

    public void forWithArrays(){
        // É possível utilizar loops para percorrer listas, retornar, filtrar ou transformar os elementos das listas
        String[] cars = {"Gol", "Saveiro", "Uno"};
        for (int i = 0; i < cars.length; i++){
            cars[i] = cars[i] + " Elemento modificado.";
            cars[i] = cars[i + 1] = "Ferrari Elemento adicionado.";
            System.out.println(cars[i]);
        }
    }

    public void nestedLoops(){
        //Criar matrizes com foor loops com nested loops
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; i++){
                System.out.println(i);
            }
        }
    }

    public void whileLoops(){
        //variável fora do loop, diferente do for
        int i = 0;
        //enquanto a condicao for atendida
        while (i < 5){
            //execut eeste código
            System.out.println(i);
        }
    }
}
