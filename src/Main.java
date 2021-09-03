import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Gerente santos = new Gerente("Santos","Masculino",8000);
        Funcionario luis = new Funcionario("Luis","Masculino", 2000);
        Vendedor carlos = new Vendedor("Carlos","Masculino", 3000,100000);
        Programador thiago = new Programador("Thiago","Masculino",6000,"Programador", "234567");


        FileOutputStream funcionario = new FileOutputStream("ListaFuncionario.txt");
        OutputStreamWriter gerarLista = new OutputStreamWriter(funcionario);
        BufferedWriter bw = new BufferedWriter(gerarLista);

        bw.append(santos.toString());
        bw.newLine();
        bw.append(luis.toString());
        bw.newLine();
        bw.append(carlos.toString());
        bw.newLine();
        bw.append(thiago.toString());

        bw.close();
    }
}
