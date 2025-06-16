interface Camera2 {
    void takeSnap2();
    void recordVideo2();
    private void MusicScore2(){
        System.out.println("Music");
    }
    default void record4kVideo2(){
        MusicScore2();
        System.out.println("Recording...");
    }
}
interface wifi2{
    String[] getNetwork2();
    void connectToNetwork2(String network);   
}
class MyCellPhone2{
    void callNumber2(int phoneNumber){
        System.out.println("calling "+phoneNumber);
    }
    void pickCall2(){
        System.out.println("connecting");
    }
}
class MySmartPhone2 extends MyCellPhone2 implements wifi2,Camera2{
    @Override
    public void takeSnap2(){
        System.out.println("Taking snap");
    }
    @Override
    public void recordVideo2(){
        System.out.println("Taking snap");
    }
    @Override
    public String[] getNetwork2() {
        System.out.println("Getting list of network");
        String[] networkList={"SD","LM","SR"};
        return networkList;
    }
    @Override
    public void connectToNetwork2(String network){
        System.out.println("Connecting to network"+network);      
    }  
    /* 
    @Override
    public void record4kVideo2(){
        System.out.println("Recording 4k...");
    } 
    */
}
public class polymorphism {
    public static void main(String[] args) {
        Camera2 cam=new MySmartPhone2();//Smart phone used as a camera, Smartphone is an object and Camera is a reference
        //cam.getNetwork();-->Not allowed
        cam.record4kVideo2();
        MySmartPhone2 s=new MySmartPhone2();
        s.takeSnap2();
        s.recordVideo2();
        s.record4kVideo2();
        s.connectToNetwork2("Jio");
        s.callNumber2(66546);
        s.pickCall2();
    }
}