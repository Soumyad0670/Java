public class string {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    /**
     * @param args
     * @throws ArrayIndexOutOfBoundsException
     */
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
        int a,b;
        double p;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        p=(double)(a*a+b*b)/(a-b);
        System.out.println(p);
    }
    @Override
    public String toString() {
        return "string []";
    }
}
