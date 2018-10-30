public class Queue2 extends Stackp{
    public Queue2(){
        super();
    }

    public void enqueue(Object element){
        push(element);
    }


    public Object dequeue(){
        Object[] obj = getArr();
        int i = 0;
        for(;obj[i+1]!=null;i++){
            obj[i]=obj[i+1];
        }
        pop();
        return obj[0];

    }


}
