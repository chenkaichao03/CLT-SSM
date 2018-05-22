package cn.clt.core.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description 线程池
 * @Aouthor CLT
 * @Date 2018/05/19 16:46
 */
public class ExecutorUtil {
    private static final int MAX_CLIENT_POOL = 3000;
    private static ExecutorService executorService;

    static {
        executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() * MAX_CLIENT_POOL);
    }

    public static void doInBackground(Runnable r) {
        executorService.execute(r);
    }
}
