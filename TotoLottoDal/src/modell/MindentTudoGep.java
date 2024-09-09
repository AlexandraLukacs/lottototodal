package modell;

import java.util.Random;


public class MindentTudoGep {
    private int[] lottoSzelveny;
    private String totoSzelveny;
    private String[] dalok;
    
    Random rnd = new Random();

    public MindentTudoGep(){
        this(new  String[0]);
    }
    
    public MindentTudoGep(String dal){
        this(new  String[]{dal});
    }
    
    public MindentTudoGep(String[] dalok){
        this.lottoSzelveny = new int[5];
        this.totoSzelveny = "";
        dallalFeltolt();
        if(!(dalok == null || dalok.length == 0 || dalok[0].isBlank())){
            dalokatFelvesz(dalok);
        }
    }
    
    public void ujraindit(){
        
    }
    
    private String generalLottoSzelveny(){
        this.lottoSzelveny = lottoSzelveny;
        int[] generalt = new int[5];
        for (int i = 1; i < 5; i++) {
            int random = rnd.nextInt(90)+1;
            generalt[i] = random;
            if(random == generalt[i]){
                generalt[i] = rnd.nextInt(90)+1;
            }
        }
        return "";
    }
    
    public String kerLottoSzelveny(){
        return "1, 2, 3, 4, 5";
    }
    
    private String generalTotoSzelveny(){
        this.totoSzelveny = totoSzelveny;
        
        return "";
    }
    
    public String kerTotoSzelveny(){
        String s = "";
        s += "1 2 3 ... 13 13+1";
        s += "x 1 2 ... x 1";
        return s;
    }
    
    public String kerDal(){
        return "";
    }
    
    public void ujDal(String dal){
        
    }

    private void dallalFeltolt() {
        
    }

    private void dalokatFelvesz(String[] dalok) {
        
    }
}
