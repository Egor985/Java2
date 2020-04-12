package src.Lesson5.homework;

public class Multithreading {
    static final int size = 10000000;
    static final int h = size / 2;

    public void methodOne(){
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) arr[i] = 1;
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++)
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        System.out.printf("Время работы первого метода = %d", (System.currentTimeMillis() - a));
        System.out.println( "\n");
    }

    public void methodTwo(){
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) arr[i] = 1;
        long a = System.currentTimeMillis();

        float[] a1 = new float[h];
        float[] a2 = new float[h];
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        Thread time1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < a1.length; i++)
                    a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        Thread time2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < a2.length; i++)
                    a2[i] = (float) (a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

    time1.start();
    time2.start();
    try {
        time1.join();
        time2.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        System.out.printf("Время работы второго метода = %d",(System.currentTimeMillis() - a));
        System.out.println();
    }

    public static void main(String[] args) {
        Multithreading multithreading = new Multithreading();
        System.out.println("Старт первого метода: просто бежит по массиву и вычисляет время выполнения");
        multithreading.methodOne();
        System.out.println("Старт второго метода: разбивает массив на два массива, \n" +
                "в двух потоках высчитывает новые значения и потом склеивает эти массивы обратно в один");
        multithreading.methodTwo();
    }
}
