//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 28; Upcasting And Downcasting

public class JavaSimple28UpcastingAndDowncasting {
    public static void main(String[] args) {
        Machine machine1 = new Machine();
        Camera camera1 = new Camera();

        machine1.start();
        camera1.start();
        camera1.snap();
        System.out.println();

        // Upcasting
        Machine machine2 = camera1;
        machine2.start();
        // error: machine2.snap();

        // Downcasting
        Machine machine3 = new Camera();
        machine3.start();
        Camera camera2 = (Camera) machine3;
        camera2.start();
        camera2.snap();

        // Doesn't work --- runtime error.
        Machine machine4 = new Machine();
        machine4.toString();
        // Camera camera3 = (Camera)machine4;
        // camera3.start();
        // camera3.snap();
    }
}
