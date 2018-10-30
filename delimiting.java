public class delimiting extends Stackp{
    public String test;

    public delimiting(String input){
        super();
        test = input;
    }

    public boolean symbols_m(){
        char[] m = test.toCharArray();
        if(m.length <= 1){
            return false;
        }

        for(int i=0;i<test.length();i++){

           push(m[i]);
           char comp;
            if((char)top() == ']' || (char)top() == '}' || (char)top() == ')'){
                comp = (char)pop();
                if((char)pop() != comp){
                    return false;
                }
            }


        }
        return true;
    }
}
