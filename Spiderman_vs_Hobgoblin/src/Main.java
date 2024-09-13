public class Main {
    public static void main(String[] args) throws Exception {
        frame1 frame = new frame1();
        while (frame.con()) {
            frame.audio();//Infinite soundtrack loop
        }
    }
}