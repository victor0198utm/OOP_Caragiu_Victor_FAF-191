package com;
import javax.naming.Binding;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.*;
import java.util.Scanner;
import java.util.Stack;


public class Expressions {
    String path, fileName;
    Stack expresion = new Stack();

    public Expressions(String path,String fileName) {
        this.path = path;
        this.fileName = fileName;
        System.out.println("\nFile: " + fileName);
    }

    public void check_paranthesis() throws FileNotFoundException {
        File file = new File(this.path.concat("\\" + this.fileName));
        Scanner sc = new Scanner(file);
        Stack st = new Stack();
        String line, message = "";
        Character ch;
        Boolean error;
        int opened = 0, closed = 0;
        while (sc.hasNextLine()){
            line = sc.nextLine();
            this.expresion.push(line);
            error = false;
            opened = 0; closed = 0;
            for (int idx = 0; idx < line.length() && !error; idx++){
                ch = line.charAt(idx);
                if (ch.equals('(')){
                    opened++;
                    st.push(ch);
                }

                if (ch.equals(')')) {
                    if (st.isEmpty()) {
                        error = true;
                        message = "Started with closed parentheses";
                    } else if (opened == closed) {
                        error = true;
                        message = "Too many closed parentheses";
                    } else {
                        closed++;
                        st.push(ch);
                    }
                }
            }

            System.out.println(line);
            if (error)
                System.out.println("Error: " + message);
            else
                System.out.println("OK");
        }
    }

    public double compute_value() throws IOException {
        File myObj = new File("compute.bat");
        myObj.createNewFile();
        String line;
        for (int i = 0; i < this.expresion.size(); i++){
            FileWriter myWriter = new FileWriter(path.concat("\\compute.bat"));
            myWriter.write("@echo off\n" +
                            "set /a num1=" + this.expresion.get(i) + "\n" +
                            "echo %num1%");
            myWriter.close();
            ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c",
                    "cd \"" + path + "\" && compute.bat");
            builder.redirectErrorStream(true);
            Process p = builder.start();
            BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
            line = r.readLine();
            if (line == null) break;

            System.out.println("Result " + (i+1) + ": " + line);
        }
        myObj.delete();

        return 0;
    }

    public static void main(String[] args) throws Exception
    {
        String path = new File("").getAbsolutePath();
        String fileName = "one_expression.txt";
        Expressions one_expression = new Expressions(path, fileName);
        one_expression.check_paranthesis();
        one_expression.compute_value();

//        [output]
//        File: one_expression.txt
//        2 * 4 + (3 +6 * 9 -    12 * (2*9 - 15))  + 2 +(-4)*((2 - 15))
//        OK
//        Result 1: 83

        fileName = "three_expressions.txt";
        Expressions three_expression = new Expressions(path, fileName);
        three_expression.check_paranthesis();
        three_expression.compute_value();
//        [output]
//        File: three_expressions.txt
//        1. 2x - 3y + 25 / (2+5)*12 - ((29*4-2) + 32) -14
//        OK
//        2. 2x - 3y + 25 / (-((29*4-2) + 32) -14 - (2+5)*12
//        OK
//        3. ((((((((((((((((((((2x-4y * 98 )))))))))))))))))))))
//        Error: Too many closed parentheses
//        Result 1: Missing operator.
//        Result 2: Missing operator.
//        Result 3: Missing operator.
    }
}
