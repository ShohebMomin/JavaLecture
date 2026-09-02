package day38;

public class DeepShallowCopyDemoDriver {
    static void main() {
        DeepCopyShallowCopy dp = new DeepCopyShallowCopy();
        dp.getDetails();

        DeepCopyShallowCopy newDp = new DeepCopyShallowCopy(dp);
        dp.name = "bob";
        dp.getDetails();
    }
}
