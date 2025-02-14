package daySix;

// declaracao da classe
//poderia ter outro nome, geralmente classes sao abstracoes do mundo real
//sendo assim, poderia ser, por exemplo, cliente
public class Classe {

    //existem diversos modificadores de acesso
    // um deles é o private
    //existe tbm o public, protected e default
    //auxiliam no encapsulamento das definicoes/informacoes de uma classe
    //que consiste na ideia de proteger as propriedades de uma classe, encapsulá-las
    // de forma que o acesso fica restringido com base em alguns criterios, de acordo com cada modificador de acesso
    private String nome;

    private  String email;

    String telefone;
    // tbm é possível definir parametros no construtor da classe
    //de forma que, ao instanciá-la e gerar um objeto
    // vc deverá informar o valor de tais parametros
    Classe(String nome){
        this.nome = nome;
        //aqui vc pode inicializar alguma das variáveis
        this.email = "classe@admin.com.br";
        //ou executar outro código que precise ser executado na construcao/inicializacao na classe
        System.out.println("A classe foi instanciada!");
    }

    //Tbm existem os metodos de acesso
    //os getters acessam uma propriedade/atributo de um objeto
    public String getEmail() {
        return email;
    }
    //os setters alteram uma propriedade/atributo de um objeto
    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
