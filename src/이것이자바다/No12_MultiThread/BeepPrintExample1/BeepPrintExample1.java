package 이것이자바다.No12_MultiThread.BeepPrintExample1;

import java.awt.*;

public class BeepPrintExample1 {
    public static void main(String[] args) {
        Toolkit toolit = Toolkit.getDefaultToolkit();
        for(int i=0; i<5; i++) {
            toolit.beep();
            try { Thread.sleep(500); } catch (Exception e) {}
        }

        for(int i=0; i<5; i++) {
            System.out.println("띵");
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}
