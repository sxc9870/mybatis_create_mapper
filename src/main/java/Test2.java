import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/***
 * @Description:
 * @author LiangChun
 * @date 2018年3月13日
 */
public class Test2 {

    public static class Test3 {

    }

    public static class Test4 extends Test3 {

    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
      //  System.out.println(c);
        // // java.io.File file = new java.io.File("d:\\404.txt");
        // // BufferedReader reader = null;
        // // System.out.println("以行为单位读取文件内容，一次读一整行：");
        // // reader = new BufferedReader(new FileReader(file));
        // // String tempString = null;
        // // int line = 1;
        // // List<String> raw = new java.util.ArrayList<>();
        // // while ((tempString = reader.readLine()) != null) {
        // // line++;
        // // raw.add(tempString);
        // // }
        // // groups = raw.parallelStream().collect(Collectors.groupingBy(e ->
        // // e.split(" ")[0]));
        // // groups.forEach((k, v) -> {
        // // v.forEach(z -> handleOne(z));
        // // });
        // // System.out.println(groups.size());
        // // groups2 = raw2.stream().collect(Collectors.groupingBy(e ->
        // e.split("
        // // ")[0]));
        // // System.out.println(groups2.size());
        // // groups2.forEach((k, v) -> {
        // // String[] aa = v.get(0).split(" ");
        // // String a = "";
        // // for (String string : aa) {
        // // if (isSp(string)) {
        // // a += string;
        // //
        // // }
        // // }
        // // System.out.println(k + ":" + a);
        // // });
        // SynchronousQueue q = new SynchronousQueue();
        // Test2 n= new Test2();
        // for (int i = 0; i < 3; i++) {
        //
        // new Thread(() -> {
        // try {
        // n.name();
        //
        // System.out.println("put");
        // q.put(1);
        //
        // } catch (Exception e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }
        // }).start();
        // new Thread(() -> {
        // try {
        // q.take();
        // System.out.println("take");
        // } catch (Exception e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }
        // }).start();
        // ;
        // }

        // ThreadPoolExecutor e2 = new ThreadPoolExecutor(1, 5, 0L,
        // TimeUnit.MILLISECONDS,
        // new SynchronousQueue<Runnable>());
        //
        // CompletionService completionService = new
        // ExecutorCompletionService(e2);
        // List<String> l = new java.util.ArrayList<>();
        // for (int i = 0; i < 5; i++) {
        // l.add(i + "");
        // completionService.submit(new java.util.concurrent.Callable<String>()
        // {
        // @Override
        // public String call() throws Exception {
        // try {
        // Thread.sleep(1000);
        // System.out.println(Thread.currentThread().getName());
        //
        // } catch (Exception e1) {
        // e1.printStackTrace();
        // }
        // if ("pool-1-thread-2".equals(Thread.currentThread().getName())) {
        // throw new RuntimeException();
        // }
        // return "1";
        // }
        //
        // });
        // }
        //
        // for (int i = 0; i < 7; i++) {
        // Future f = completionService.take();
        // Object o = f.get();
        // System.out.println(o);
        // }
        // e2.shutdown();
        // System.out.println(Thread.currentThread().getName());

        // l.parallelStream().forEach(e->{
        // try {
        // Thread.sleep(1000);
        // } catch (Exception e1) {
        // // TODO Auto-generated catch block
        // e1.printStackTrace();
        // }
        // System.out.println(Thread.currentThread().getName());
        // });

    }

    private static boolean isSp(String s) {
        return s.toUpperCase().contains("spider".toUpperCase());
    }

    static List<String> raw2 = new java.util.ArrayList<>();

    private static Object handleOne(String z) {

        String[] zs = z.split(" ");
        for (String zz : zs) {
            if (zz.toUpperCase().contains("spider".toUpperCase())) {
                raw2.add(z);
            }
        }

        return null;
    }

    private static Map<String, List<String>> groups = new java.util.HashMap<>();
    private static Map<String, List<String>> groups2 = new java.util.HashMap<>();
    private static Map<String, List<String>> groups3 = new java.util.HashMap<>();
}
