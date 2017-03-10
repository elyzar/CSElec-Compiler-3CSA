/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexicalanalyzer;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author renziverdb
 */
public class LexicalAnalyzer {


    public static boolean IsReservedWord(String input){

        if(input.equals("if")){

            return true;
        }else return false;




    }

    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("SUDO LEXICAL ANALYZER: RESERVED WORDS");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char inputTok[];

        ArrayList inputList = new ArrayList();

        for(int i=0 ; i < input.length() ; i++){

            while(input.charAt(i) != ' '){
                //inputTok = input.charAt(i);
            }

        }

       System.out.println(IsReservedWord(input));


    }



}
