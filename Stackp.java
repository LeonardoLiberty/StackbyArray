public class Stackp implements Stack{

    private final int maxlen = 500;
    protected Object[] arr;

    public Stackp(){
         arr = new Object[maxlen];
    }

    public Object[] getArr(){
        return arr;
    }


    @Override
    public int size() {
        int i = 0;
        if(arr == null){
            return 0;
        }
        for(;arr[i+1] != null;i++){}
        return i;
    }

    @Override
    public boolean isEmpty() {
        if(arr == null){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public Object top() {
        Object re = new Object();
        if(arr == null){
            return null;
        }else {
            int i = 0;
            for(;arr[i+1] != null;i++){}
            re = arr[i];


        }
        return re;
    }

    @Override
    public void push(Object element){

        if(arr == null){
            arr[0] = element;
        }else {
            int i=0;
            for(;arr[i+1] != null;i++){}
            arr[i+1] = element;

        }

    }

    @Override
    public Object pop() {
        Object re = new Object();
        if(arr == null){
            return null;
        }else {
            int i = 0;
            for(;arr[i+1] != null;i++){}
            re = arr[i];
            arr[i] = null;
        }
        return re;
    }
}
