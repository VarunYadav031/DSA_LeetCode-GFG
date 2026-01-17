class Geeks {

    static void checkString(String s) {
        int v = 0;
        int c = 0;

        // Your code here
        for(char ch:s.toCharArray()){
            // if(character.isLetter(ch)){
             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    v++;
                } else {
                    c++;
                }
        }
        // }
        

        if (v > c)
            System.out.print("Yes");
        else if (c > v)
            System.out.print("No");
        else
            System.out.print("Same");

        System.out.println();
    }
}

//Position this line where user code will be pasted.