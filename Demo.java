public class Demo {
    public static void main(String[] argv){
        Stackp stack = new Stackp();
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        stack.push("lala");
        stack.push(4);
        stack.push(7);
        stack.pop();
        stack.pop();
        System.out.println(stack.size());
        System.out.println(stack.top()+"--------------");
        Queue2 que = new Queue2();
        System.out.println(que.size());
        que.enqueue(2);
        que.enqueue("lala");
        que.enqueue(12);
        que.dequeue();
        System.out.println(que.size());
        System.out.println("------------");
        delimiting del = new delimiting("()(()){([()])}");
        System.out.println(del.symbols_m());
    }
}
