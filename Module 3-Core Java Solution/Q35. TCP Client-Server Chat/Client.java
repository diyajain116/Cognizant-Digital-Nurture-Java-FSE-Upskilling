import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        try {

            Socket socket =
                    new Socket(
                            "localhost",
                            5000
                    );

            System.out.println(
                    "Connected to Server!"
            );

            BufferedReader in =
                    new BufferedReader(
                            new InputStreamReader(
                                    socket.getInputStream()
                            )
                    );

            PrintWriter out =
                    new PrintWriter(
                            socket.getOutputStream(),
                            true
                    );

            Scanner sc = new Scanner(System.in);

            while (true) {

                System.out.print(
                        "Client: "
                );

                String message =
                        sc.nextLine();

                out.println(message);

                if (message.equalsIgnoreCase("exit")) {
                    break;
                }

                String serverReply =
                        in.readLine();

                System.out.println(
                        "Server: "
                                + serverReply
                );
            }
                sc.close();
            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
