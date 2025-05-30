import com.sun.source.tree.Scope;

import java.net.*;
import java.io.*;
public class Server6{
    public static void main(String [] a)throws Exception{

        ServerSocket socket = new ServerSocket(8080);

        while(true) {
            Socket connectionSocket = socket.accept();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
            DataOutputStream dataOutputStream = new DataOutputStream(connectionSocket.getOutputStream());

            dataOutputStream.writeBytes("Enter some operation '+', '-', '*', '/'" + '\n');
            dataOutputStream.writeBytes("Enter END to finish" + '\n');

            String operationMessage = bufferedReader.readLine();
            if(operationMessage.equalsIgnoreCase("END")) System.exit(0);

            char operation = operationMessage.charAt(0);
            dataOutputStream.writeBytes("Enter first num: " + '\n');
            int number1 = Integer.parseInt(bufferedReader.readLine());

            dataOutputStream.writeBytes("Enter second num: " + '\n');
            int number2 = Integer.parseInt(bufferedReader.readLine());

            int result = 0;
            double result1 = 0;
            boolean flag = false;
            switch (operation) {
                case '+':
                    result = number1 + number2;
                    break;
                case '-':
                    result = number1 - number2;
                    break;
                case '*':
                    result = number1 * number2;
                    break;
                case '/':
                    result1 = (double) number1 / number2;
                    flag = true;
                    break;
                default:
                    dataOutputStream.writeBytes("An error has occurred..." + '\n');
            }

            if (flag) {
                dataOutputStream.writeBytes(number1 + " / " + number2 + " = " + result1 + '\n');
            } else {
                dataOutputStream.writeBytes(number1 + " " + operation + " " + number2 + " = " + result + '\n');
            }
            connectionSocket.close();
            bufferedReader.close();
            dataOutputStream.close();
            }

//        ServerSocket s = new ServerSocket(8080);
//
//        while(true){
//            Socket x = s.accept();
//            BufferedReader  from = new BufferedReader(new InputStreamReader(x.getInputStream()));
//            DataOutputStream to =new DataOutputStream(x.getOutputStream());
//            String chr = "";
//            char c;
//            int number1, number2, res;
//            float res2;
//            to.writeBytes("Input one of the operators '+', '-', '*', '/' to select an operation: " + '\n');
//            to.writeBytes("To finish enter 'END' " + '\n');
//
//            chr = from.readLine();       //If the user enters "END", the server will stop working
//            if(chr.equalsIgnoreCase("end")){
//                System.exit(0);
//            }
//
//
//            c=chr.charAt(0);
//            to.writeBytes("Input the first number:  " + '\n');
//            number1 = Integer.parseInt(from.readLine());
//            to.writeBytes("Input the second number: " + '\n');
//            number2 = Integer.parseInt(from.readLine());
//
//            switch(c){
//                case '+':
//                    res=number1+number2;
//                    to.writeBytes("-> " +number1 + "+" + number2 + "=" + res + '\n');
//                    break;
//                case '-':
//                    res=number1-number2;
//                    to.writeBytes("-> " + number1 + "-" + number2 + "=" + res + '\n');
//                    break;
//                case '*':
//                    res=number1*number2;
//                    to.writeBytes("-> " + number1 + "*" + number2 + "=" + res + '\n');
//                    break;
//                case '/':
//                    res2= (float) ((1.0*number1)/number2);
//                    to.writeBytes("-> " + number1 + "/" + number2 + "=" + res2 + '\n');
//                    break;
//                default: to.writeBytes("-> An error has occurred" + '\n');
//            }
//            x.close();
//        }
    }
}