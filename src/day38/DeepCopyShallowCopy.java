package day38;

public class DeepCopyShallowCopy {
    public int rno = 10;
    public String name = "Alice";
    public long contact = 888874741;
    public DeepCopyShallowCopy(){}

    public DeepCopyShallowCopy(DeepCopyShallowCopy dc){
        this.name = dc.name;
        this.rno = dc.rno;
        this.contact = dc.rno;
    }
    void getDetails(){
        System.out.println(this.name);
        System.out.println(this.rno);
        System.out.println(this.contact);
    }

}
