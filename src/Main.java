
//Imports

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.MessageProperties;
import com.rabbitmq.client.DeliverCallback;

import java.util.Scanner;

public class Main {

    private static final String TASK_QUEUE_NAME = "FACOM";

    public static void main(String[] args) throws Exception {
        Usuario usuario = Usuario.cadastrarUsuario();
        System.out.println(usuario);
    }
}