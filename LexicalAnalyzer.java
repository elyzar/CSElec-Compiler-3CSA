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
        
        
        
        /*
        int number = 1;//number lang
        int stored = 0;//na store sa array
        
        //nag bbilang ng space para masabi nya kung ilan laman ng array ganern
        for (int x = 0; x < input.length();x++) {
            if (input.charAt(x)== ' '){
                number++;
            }
        }
        
        String[] all = new String[number];
        for (int x = 0; x < input.length();x++ ) {
            try{
                if (input.charAt(x) == 'i' && (input.length()-x)>2 && input.charAt(x+1) == 'f' && input.charAt(x+2) == ' '){
                    all[stored]="if";
                    stored++;
                } else if (input.charAt(x) == 'e' && (input.length()-x)>4 && input.charAt(x+1) == 'l' && input.charAt(x+2) == 's' && input.charAt(x+3) == 'e' && input.charAt(x-1) == ' ' && input.charAt(x+4) == ' '){
                    for (String all1 : all) {
                        if ("if".equals(all1)) {
                            all[stored]="else";
                            stored++;

                        }       
                    }
                }
            } catch(ArrayIndexOutOfBoundsException exception) {
                return false;
            }
        }
        
        for (int x = 0; x < stored; x++){
            
                System.out.print(all[x] + " ");
        }
        
        
        return false;
    
        

        */
    }

    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("SUDO LEXICAL ANALYZER: RESERVED WORDS");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();


        String inputTok="";

        ArrayList inputList = new ArrayList();

        for(int i=0, j=i+1; i < input.length() ; i++){


        inputTok += input.charAt(i);



         if(input.charAt(i)==' '){
             inputList.add(inputTok);
             inputTok="";


        }


        }

        System.out.println(inputList);

        for(int i=0 ; i < inputList.size() ; i++){
         System.out.println(IsReservedWord(inputList.get(i).toString().trim()));
        }

    }



}
