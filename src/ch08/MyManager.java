package ch08;

public class MyManager {
    private int score;

    private MyManager(int score){
        this.score = score;
    }
    private static MyManager mgr;

    public static MyManager getInstance(){
        if (mgr ==null)
            mgr = new MyManager(10);
        return mgr;
    }
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
class MyManagerUse{
    public static void main(String[] args) {
        MyManager mgrObj = MyManager.getInstance();
        System.out.println(mgrObj);
        System.out.println("mrgObj.getScore() = "+ mgrObj.getScore());
        mgrObj.setScore(20);
        System.out.println("mrgObj.getScore() = "+ mgrObj.getScore());
    }
}