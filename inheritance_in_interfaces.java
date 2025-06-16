interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface{
    void meth3();
    void meth4();
}
class MySampleClass implements childSampleInterface,sampleInterface{ 
    @Override
    public void meth1(){
        System.out.println("meth1");
    }
    @Override
    public void meth2(){
        System.out.println("meth2");
    }
    @Override
    public void meth3(){
        System.out.println("meth3");
    }
    @Override
    public void meth4(){
        System.out.println("meth4");
    }
    void meth5(){
        System.out.println("meth5");
    }
}
public class inheritance_in_interfaces{
    public static void main(String[] args){
        MySampleClass msc=new MySampleClass();
        childSampleInterface sc1=new MySampleClass(); 
        sampleInterface sc2=new MySampleClass(); 
        sc2.meth1();
        sc2.meth2();
        sc1.meth3();
        sc1.meth4();
        msc.meth5();
        msc.meth1();
        msc.meth2();
        msc.meth3();
        msc.meth4();
    }
}