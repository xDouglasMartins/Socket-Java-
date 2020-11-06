import java.io.IOException;
    import java.net.ServerSocket;
    import java.net.Socket;
    import java.util.Scanner;

    public class Servidor {
        public static void main(String[] args) throws IOException {
            ServerSocket server = new ServerSocket(8000);
            System.out.println("Porta 8000 aberta!");

            Socket cliente = server.accept();
            System.out.println("Nova conexão com o cliente " +  
                cliente.getInetAddress().getHostAddress());

            Scanner entrada = new Scanner(cliente.getInputStream());
            while (entrada.hasNextLine()) {
                System.out.println(entrada.nextLine());
            }

            entrada.close();
            server.close();
        }
    }