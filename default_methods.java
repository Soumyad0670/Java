interface Camera {
    void takeSnap();

    void recordVideo();

    private void MusicScore() {
        System.out.println("Music");
    }

    default void record4kVideo() {
        MusicScore();
        System.out.println("Recording...");
    }
}

interface wifi {
    String[] getNetwork();

    void connectToNetwork(String network);
}

class MyCellPhone {
    public void callNumber(int phoneNumber) {
        System.out.println("calling " + phoneNumber);
    }

    public void pickCall() {
        System.out.println("connecting");
    }
}

class MySmartPhone extends MyCellPhone implements wifi, Camera {
    @Override
    public void takeSnap() {
        System.out.println("Taking snap");
    }

    @Override
    public void recordVideo() {
        System.out.println("Taking snap");
    }

    @Override
    public String[] getNetwork() {
        System.out.println("Getting list of network");
        String[] networkList = { "SD", "LM", "SR" };
        return networkList;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to network" + network);
    }
    /*
     * @Override
     * public void record4kVideo(){
     * System.out.println("Recording 4k...");
     * }
     */
}

public class default_methods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        String[] ar = ms.getNetwork();
        for (String item : ar) {
            System.out.println(item);
        }
        ms.record4kVideo();
    }
}
