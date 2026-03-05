public class TestaSmartTV {
    public static void main(String[] args){
        SmartTV s1 = new SmartTV();
        s1.setVolume(-40);
        s1.setVolume(130);
        s1.setVolume(50);
        System.out.println("Volume S1: " + s1.getVolume());
        s1.abrirYoutube();

        SmartTV s2 = new SmartTV("Samsung", "ABC" ,0);
        s2.abrirYoutube();

        SmartTV s3 = new SmartTV("LG", "UTV", 30);
        s3.abrirYoutube();

    }
}