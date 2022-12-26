package inheritance;

public class ParentClass {
    public void print(){
        System.out.println("Public print from parent");
    }

    public int sum (int a, int b){
        return a + b;
    }
    protected void secondPrint(){
        System.out.println("Protected print from parent");
    }
    private void thirdPrint(){
        System.out.println("Private print from parent");
    }
}
