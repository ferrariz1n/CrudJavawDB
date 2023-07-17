//Import Scanner
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws SQLException{

    Scanner scanner = new Scanner(System.in);
        
    //Inserir nome

    System.out.println("Insira o nome: ");
    String nome = scanner.nextLine();
    LimparConsole.limparConsole();

    //Inserir idade
        
    System.out.println("Insira a idade: ");
    int idade = scanner.nextInt();
    LimparConsole.limparConsole();
    
    
    //Saida de dados
    System.out.println("O nome é: "+nome);
    System.out.println("A idade é: "+idade);
    
    addbanco(nome, idade);
    }

    //Add banco
    public static void addbanco(String nome, int idade) throws SQLException{

        ConexaoMySQL dbpessoa = new ConexaoMySQL();
        dbpessoa.OpenDB();
        String sql = "INSERT INTO pessoa (nome, idade) VALUES ('" + nome + "', " + idade + ")";
        dbpessoa.ExecuteQuerry(sql);
        dbpessoa.CloseDB();
    
    }

}