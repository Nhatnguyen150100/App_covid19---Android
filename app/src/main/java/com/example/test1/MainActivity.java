package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MainActivity extends AppCompatActivity {
    private String SERVER_IP = "192.168.10.117";
    private int SERVER_PORT = 9999;
    private Thread Thread1 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(MainActivity.this, loginForm.class);
        startActivity(intent);
        Thread1 = new Thread(new Thread1());
        Thread1.start();
    }
    private PrintWriter output;
    private BufferedReader input;
    class Thread1 implements Runnable {
        public void run() {
            Socket socket;
            try {
                socket = new Socket(SERVER_IP, SERVER_PORT);
                output = new PrintWriter(socket.getOutputStream());
                input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            sendMessageToServer("loogin",socket);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        Toast toast = Toast.makeText(MainActivity.this,"connect",Toast.LENGTH_SHORT);
                        toast.show();
                    }
                });
//                new Thread(new Thread2()).start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private void sendMessageToServer(String str, Socket sock) throws IOException {
        OutputStream ostream = sock.getOutputStream();
        PrintWriter pwrite = new PrintWriter(ostream, true);
        pwrite.println(str);       // sending to server
        pwrite.flush();            // flush the data
    }
}