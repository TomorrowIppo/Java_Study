package 이것이자바다.No12_MultiThread.BeepPrintExample3;

import java.awt.*;

public class BeepPrintExample3 {
//    public static void main(String[] args) {
//        Thread thread = new BeepThread();
//        thread.start();
//
//        for(int i=0; i<5; i++) {
//            System.out.println("띵");
//            try {
//                Thread.sleep(500);
//            } catch (Exception e) {
//
//            }
//        }
//    }

    // 익명 자식 객체
    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for(int i=0; i<5; i++) {
                    toolkit.beep();
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {

                    }
                }
            }
        };
        thread.start();

        for(int i=0; i<5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }
}
