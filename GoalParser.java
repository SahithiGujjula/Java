package com.company;

public class GoalParser {
    public String interpret(String command) {
        String s = new String();
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='G'){
                s+='G';
            }
            else if(command.charAt(i)=='('){
                if(command.charAt(i+1)==')'){
                    s+='o';
                    i+=1;
                }
                else{
                    s+="al";
                    i+=3;
                }
            }
        }
        return s;
    }

    public static void main(String[] args){
        GoalParser obj = new GoalParser();
        System.out.println(obj.interpret("G()()()(al)"));
    }


}
