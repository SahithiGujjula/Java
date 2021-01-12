package com.company;

public class defangIP {
    public String defangIPaddr(String address) {
        String defangled = "";
        for(int i = 0; i < address.length(); i++){
            if(address.charAt(i) == '.') {
                defangled+="[.]";
            }
            else{
                defangled += address.charAt(i);
            }
        }
        return defangled;
    }

    public static void main(String[] args){
        defangIP d = new defangIP();
        System.out.println(d.defangIPaddr("255.100.50.0"));
    }


}
