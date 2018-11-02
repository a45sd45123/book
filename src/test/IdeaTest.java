import java.util.*;

public class IdeaTest {
    public static void main(String[] args){
        int a =getOneNum();
        int b =2;
        System.out.println(a);
        if(a==b||a==b+1||a==b-1){
            System.out.println("a=b");
        }else {
            System.out.println("a!=b");
        }
        //vector相比arraylist而言，是线程安全的，但是相应的效率就会比较慢
        Vector<String> strings = new Vector<>();
        ArrayList<String> strings1 = new ArrayList<>();
        LinkedList<String> strings2 = new LinkedList<>();
        Set<String> set = new HashSet<String>();
        String aaa = "aaa";
        String bbb = "bbb";
        set.add(aaa);
        set.add(bbb);
        System.out.println(set);
        aaa=bbb;
        set.add(aaa);
        System.out.println(set);
        strings1.add("eee");
        strings1.add("eee");
        strings1.add("aaa");
        strings1.add("bbb");
        strings.add("www");
        strings2.add("sss");
        strings2.add("sss");
        strings2.add("aaa");
        strings2.add("bbb");
        strings.addAll(strings1);
        strings.addAll(strings2);
        System.out.println(strings1);
        System.out.println(strings2);
        System.out.println(strings);

    }

    public static int  getOneNum(){
        return (int) (Math.random()*10);
    }
}
