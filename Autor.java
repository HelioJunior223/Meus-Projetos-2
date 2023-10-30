    import java.util.ArrayList;

    public class Autor extends Pessoa { //herança
        private String nacionalidade; //private encapsulamento
        private static ArrayList<Autor> autores = new ArrayList<Autor>();

        public Autor(String nome, String nacionalidade) {
            super(nome); //super puxa o constrututor
            this.nacionalidade = nacionalidade;

            autores.add(this);
        }

        public Autor(String nome) {
            this(nome, "Brasil");
            /*super(nome);
            this.nacionalidade = "Brasil";

            autores.add(this);*/
        }

        public void setNacionalidade(String nacionalidade) {
            this.nacionalidade = nacionalidade;
        }

        public String getNacionalidade() { //get encapsulamento
            return this.nacionalidade;
        }

        public static ArrayList<Autor> getAutores() {
            return autores;
        }

        public String toString() { //polimorfismo
            return super.toString() + ". Nacionalidade: " + this.nacionalidade;
        }

        public static void listarAutores() {
            for(int i = 0; i < autores.size(); i++) {
                System.out.println(i + " - " + autores.get(i).toString());
            }
        }
    }