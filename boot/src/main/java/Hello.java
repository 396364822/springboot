import java.util.Date;

public class Hello implements Runnable{
    private String name;

    public Hello(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("名字为："+Thread.currentThread().getName()+" start，" +
                "Time"+new Date());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("名字为："+Thread.currentThread().getName()+" end，" +
                "Time"+new Date());
    }
}
