import java.sql.*;

public class ConexaoMySQL {
    public static String URL = "jdbc:mysql://localhost:3306/pessoa";
    public static String USER = "root";
    public static String PWD = "";

    //objetos de conexao
    private Connection connectDB = null;
    private Statement managerQSL = null;
    private ResultSet resultSQL = null;

    public void OpenDB(){

        try {
            connectDB = DriverManager.getConnection(URL, USER, PWD);
            System.out.println("Conectatado com sucesso em: "+URL);
            managerQSL = connectDB.createStatement(); //cria obejtos para SQLs
        } catch(Exception Error)
        {
            System.out.println("Error on connect: "+Error.getMessage());
        }
    }    
    
    public void CloseDB() throws SQLException{
        managerQSL.close();
        connectDB.close();
    
    
    }

    public int ExecuteQuerry(String sql){
        try{
            return managerQSL.executeUpdate(sql);
    } catch(Exception Error)
        System.out.println("Error on connect: "+Error.getMessage());
    }


    }

