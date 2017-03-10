/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexicalanalyzer;

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

       System.out.println(IsReservedWord(input));


    }



}
