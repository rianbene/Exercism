class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder newIdent = new StringBuilder();
        char c;
        for (int i = 0; i < identifier.length(); i++){
            c = identifier.charAt(i);
            //Task 2
            if (i > 0){
                if (identifier.charAt(i-1) == '-'){
                    c = Character.toUpperCase(c);
                    //newIdent.deleteCharAt(i-1);
                }
            }
            //Task 3
            if (c == '4'){
                c = 'a';
            }
            if (c == '3'){
                c = 'e';
            }
            if (c == '0'){
                c = 'o';
            }
            if (c == '1'){
                c = 'l';
            }
            if (c == '7'){
                c = 't';
            }
                            
            //Task 1
            if (c == ' '){
                newIdent.append('_');
            } else if (Character.isAlphabetic(c)){
                newIdent.append(c);
            }
            
        }
        return newIdent.toString(); 
    }
}
