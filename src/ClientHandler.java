import java.net.Socket;

public class ClientHandler extends Thread{
    Socket s=null;
    static int count=0;
    ClientHandler(Socket s)
    {
        this.s = s;
    }

    @Override
    public void run()
    {
        count++;
        System.out.println("Client assigned : Thread " +count);
    }


}
